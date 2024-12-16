/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author Alex
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import model.HoaDon;
import model.ChiTietHoaDon;
public class HoaDonDAO {

    private static final String DB_URL = "jdbc:sqlserver://LAPTOP-GTMBKA52\\SQLEXPRESS:1433;databaseName=QLNhaThuoc;encrypt=true;trustServerCertificate=true";
    private static final String USER = "sa";
    private static final String PASSWORD = "123456789";

    // Phương thức thêm hóa đơn vào cơ sở dữ liệu
    

    private Connection conn;

    // Constructor kết nối đến cơ sở dữ liệu
    public HoaDonDAO() {
        try {
            // Kết nối tới cơ sở dữ liệu (cần thay đổi URL, username, password nếu cần)
            conn = DriverManager.getConnection(DB_URL,USER,PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Phương thức thêm hóa đơn vào CSDL
   public boolean themHoaDon(HoaDon hoaDon) {
    Connection conn = null;
    PreparedStatement pstmtHoaDon = null;
    PreparedStatement pstmtChiTiet = null;

    try {
        // Kết nối cơ sở dữ liệu
        conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);

        // Bắt đầu transaction
        conn.setAutoCommit(false);

        // Tính tổng tiền hóa đơn từ danh sách ChiTietHoaDon
        double tongTien = 0;
        for (ChiTietHoaDon chiTiet : hoaDon.getChiTietHoaDonList()) {
            tongTien += chiTiet.getSoLuongBan() * chiTiet.getGia();
        }
        hoaDon.setTongTien(tongTien);

        // Thêm hóa đơn
        String sqlHoaDon = "INSERT INTO HoaDon (NgayLap, SDT, TenKH, DiaChi, TongTien) VALUES (?, ?, ?, ?, ?)";
        pstmtHoaDon = conn.prepareStatement(sqlHoaDon, PreparedStatement.RETURN_GENERATED_KEYS);
        pstmtHoaDon.setString(1, hoaDon.getNgayLap());
        pstmtHoaDon.setString(2, hoaDon.getSDT());
        pstmtHoaDon.setString(3, hoaDon.getTenKH());
        pstmtHoaDon.setString(4, hoaDon.getDiaChi());
        pstmtHoaDon.setDouble(5, hoaDon.getTongTien());

        int affectedRows = pstmtHoaDon.executeUpdate();
        if (affectedRows == 0) {
            throw new SQLException("Failed to insert HoaDon, no rows affected.");
        }

        // Lấy mã hóa đơn vừa tạo tự động
        int maHD;
        try (var generatedKeys = pstmtHoaDon.getGeneratedKeys()) {
            if (generatedKeys.next()) {
                maHD = generatedKeys.getInt(1);
            } else {
                throw new SQLException("Failed to obtain MaHD.");
            }
        }

        // Thêm chi tiết hóa đơn
        String sqlChiTiet = "INSERT INTO ChiTietHoaDon (MaHD, TenSP, SoLuongBan, Gia, ThanhTien) VALUES (?, ?, ?, ?, ?)";
        pstmtChiTiet = conn.prepareStatement(sqlChiTiet);

        for (ChiTietHoaDon chiTiet : hoaDon.getChiTietHoaDonList()) {
            double thanhTien = chiTiet.getSoLuongBan() * chiTiet.getGia();
            pstmtChiTiet.setInt(1, maHD);
            pstmtChiTiet.setString(2, chiTiet.getTenSP());
            pstmtChiTiet.setInt(3, chiTiet.getSoLuongBan());
            pstmtChiTiet.setDouble(4, chiTiet.getGia());
            pstmtChiTiet.setDouble(5, thanhTien);
            pstmtChiTiet.addBatch();
        }

        pstmtChiTiet.executeBatch();

        // Commit transaction
        conn.commit();
        return true;

    } catch (SQLException e) {
        if (conn != null) {
            try {
                conn.rollback();
            } catch (SQLException rollbackEx) {
                rollbackEx.printStackTrace();
            }
        }
        e.printStackTrace();
        return false;
    } finally {
        // Đóng tài nguyên
        try {
            if (pstmtHoaDon != null) pstmtHoaDon.close();
            if (pstmtChiTiet != null) pstmtChiTiet.close();
            if (conn != null) conn.close();
        } catch (SQLException closeEx) {
            closeEx.printStackTrace();
        }
    }
}


    // Phương thức lấy danh sách hóa đơn
    public List<HoaDon> layDanhSachHoaDon() {
        List<HoaDon> hoaDons = new ArrayList<>();
        String selectSQL = "SELECT * FROM HoaDon";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(selectSQL)) {
            while (rs.next()) {
                HoaDon hoaDon = new HoaDon();
                hoaDon.setMaHD(rs.getInt("maHD"));
                hoaDon.setTenKH(rs.getString("tenKH"));
                hoaDon.setNgayLap(rs.getString("ngayLap"));
                hoaDon.setSDT(rs.getString("sdt"));
                hoaDon.setDiaChi(rs.getString("diaChi"));
                
                // Lấy chi tiết hóa đơn liên quan
                hoaDon.setChiTietHoaDonList(layChiTietHoaDon(hoaDon.getMaHD()));
                
                hoaDons.add(hoaDon);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return hoaDons;
    }

    // Phương thức lấy chi tiết hóa đơn từ cơ sở dữ liệu
    private List<ChiTietHoaDon> layChiTietHoaDon(int maHD) {
        List<ChiTietHoaDon> chiTietHoaDons = new ArrayList<>();
        String selectSQL = "SELECT * FROM ChiTietHoaDon WHERE maHD = ?";
        try (PreparedStatement stmt = conn.prepareStatement(selectSQL)) {
            stmt.setInt(1, maHD);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    ChiTietHoaDon chiTiet = new ChiTietHoaDon(
                        rs.getString("tenSP"),
                        rs.getInt("soLuongBan"),
                        rs.getDouble("gia")
                    );
                    chiTiet.setThanhTien(rs.getDouble("thanhTien"));
                    chiTietHoaDons.add(chiTiet);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return chiTietHoaDons;
    }

    // Đóng kết nối
    public void close() {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public boolean xoaHoaDon(int maHD) {
    String deleteChiTietQuery = "DELETE FROM ChiTietHoaDon WHERE MaHD = ?";
    String deleteHoaDonQuery = "DELETE FROM HoaDon WHERE MaHD = ?";

    try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD)) {
        conn.setAutoCommit(false); // Bắt đầu transaction

        // Xóa các chi tiết hóa đơn liên quan
        try (PreparedStatement stmtChiTiet = conn.prepareStatement(deleteChiTietQuery)) {
            stmtChiTiet.setInt(1, maHD);
            stmtChiTiet.executeUpdate();
        }

        // Xóa hóa đơn
        try (PreparedStatement stmtHoaDon = conn.prepareStatement(deleteHoaDonQuery)) {
            stmtHoaDon.setInt(1, maHD);
            stmtHoaDon.executeUpdate();
        }

        conn.commit(); // Commit transaction
        return true;

    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
}


}