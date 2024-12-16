/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author Alex
 */

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.ChiTietHoaDon;
import model.HoaDon;
//
//public class ThongKeDAO {
//
//    /**
//     * Lấy toàn bộ thống kê hóa đơn và chi tiết hóa đơn
//     */
//     private Connection conn;
//    public ThongKeDAO() {
//    try {
//        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//        String url = "jdbc:sqlserver://LAPTOP-GTMBKA52\\SQLEXPRESS:1433;databaseName=QLNhaThuoc;encrypt=true;trustServerCertificate=true";
//        String user = "sa";
//        String pwd = "123456789";
//        conn = DriverManager.getConnection(url, user, pwd);
//    } catch (Exception e) {
//        e.printStackTrace();
//        throw new RuntimeException("Database connection failed!", e);
//    }
//}
//
//    public static List<HoaDon> getAllThongKe() {
//        List<HoaDon> hoaDonList = new ArrayList<>();
//        Connection conn = null;
//        PreparedStatement pre = null;
//        ResultSet rs = null;
//        try {
//            String sql = "SELECT HoaDon.maHD, HoaDon.tenKH, HoaDon.ngayLap, HoaDon.sdt, HoaDon.diaChi, HoaDon.tongTien " +
//                         "FROM HoaDon";
//            pre = conn.prepareStatement(sql);
//            rs = pre.executeQuery();
//
//            while (rs.next()) {
//                HoaDon hoaDon = new HoaDon(
//                        rs.getInt("maHD"),
//                        rs.getString("tenKH"),
//                        rs.getString("ngayLap"),
//                        rs.getString("sdt"),
//                        rs.getString("diaChi"),
//                        rs.getDouble("tongTien")
//                );
//                hoaDonList.add(hoaDon);
//            }
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        } finally {
//            closeResources(conn, pre, rs);
//        }
//        return hoaDonList;
//    }
//
//    /**
//     * Lọc hóa đơn theo ngày
//     */
//    public static List<HoaDon> findByDate(String ngayLap) {
//        List<HoaDon> hoaDonList = new ArrayList<>();
//        Connection conn = null;
//        PreparedStatement pre = null;
//        ResultSet rs = null;
//        try {
//            String sql = "SELECT HoaDon.maHD, HoaDon.tenKH, HoaDon.ngayLap, HoaDon.sdt, HoaDon.diaChi, HoaDon.tongTien " +
//                         "FROM HoaDon WHERE ngayLap = ?";
//            pre = conn.prepareStatement(sql);
//            pre.setString(1, ngayLap);
//            rs = pre.executeQuery();
//
//            while (rs.next()) {
//                HoaDon hoaDon = new HoaDon(
//                        rs.getInt("maHD"),
//                        rs.getString("tenKH"),
//                        rs.getString("ngayLap"),
//                        rs.getString("sdt"),
//                        rs.getString("diaChi"),
//                        rs.getFloat("tongTien")
//                );
//                hoaDonList.add(hoaDon);
//            }
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//
//        } finally {
//            closeResources(conn, pre, rs);
//        }
//        return hoaDonList;
//    }
//
//    /**
//     * Lấy chi tiết hóa đơn theo mã hóa đơn
//     */
//    public static List<ChiTietHoaDon> getChiTietHoaDon(String maHD) {
//        List<ChiTietHoaDon> chiTietList = new ArrayList<>();
//        Connection conn = null;
//        PreparedStatement pre = null;
//        ResultSet rs = null;
//        try {
//            String sql = "SELECT maCTHD, maHD, tenSP, soLuongBan, gia, thanhTien " +
//                         "FROM ChiTietHoaDon WHERE maHD = ?";
//            pre = conn.prepareStatement(sql);
//            pre.setString(1, maHD);
//            rs = pre.executeQuery();
//
//            while (rs.next()) {
//                ChiTietHoaDon chiTiet = new ChiTietHoaDon(
//                        rs.getString("tenSP"),
//                        rs.getInt("soLuongBan"),
//                        rs.getDouble("gia")
//                );
//                chiTietList.add(chiTiet);
//            }
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        } finally {
//            closeResources(conn, pre, rs);
//        }
//        return chiTietList;
//    }
//
//    /**
//     * Tính tổng doanh thu
//     */
//    public static double getTongDoanhThu() {
//        Connection conn = null;
//        PreparedStatement pre = null;
//        ResultSet rs = null;
//        double tongDoanhThu = 0;
//        try {
//            String sql = "SELECT SUM(tongTien) AS tongDoanhThu FROM HoaDon";
//            pre = conn.prepareStatement(sql);
//            rs = pre.executeQuery();
//
//            if (rs.next()) {
//                tongDoanhThu = rs.getDouble("tongDoanhThu");
//            }
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//
//        } finally {
//            closeResources(conn, pre, rs);
//        }
//        return tongDoanhThu;
//    }
//
//    /**
//     * Đóng tài nguyên
//     */
//    private static void closeResources(Connection conn, PreparedStatement pre, ResultSet rs) {
//        try {
//            if (rs != null) rs.close();
//            if (pre != null) pre.close();
//            if (conn != null) conn.close();
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        }
//    }
//}
public class ThongKeDAO {
    private Connection conn;

    public ThongKeDAO() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://LAPTOP-GTMBKA52\\SQLEXPRESS:1433;databaseName=QLNhaThuoc;encrypt=true;trustServerCertificate=true";
            String user = "sa";
            String pwd = "123456789";
            conn = DriverManager.getConnection(url, user, pwd);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to connect to the database", e);
        }
    }

    public List<HoaDon> findByDate(String ngayLap) {
        List<HoaDon> hoaDonList = new ArrayList<>();
        PreparedStatement pre = null;
        ResultSet rs = null;

        try {
            String sql = "SELECT HoaDon.maHD, HoaDon.tenKH, HoaDon.ngayLap, HoaDon.sdt, HoaDon.diaChi, HoaDon.tongTien FROM HoaDon WHERE ngayLap = ?";
            pre = conn.prepareStatement(sql);
            pre.setString(1, ngayLap);
            rs = pre.executeQuery();

            while (rs.next()) {
                HoaDon hoaDon = new HoaDon(
                    rs.getInt("maHD"),
                    rs.getString("tenKH"),
                    rs.getString("ngayLap"),
                    rs.getString("sdt"),
                    rs.getString("diaChi"),
                    rs.getDouble("tongTien")
                );
                hoaDonList.add(hoaDon);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            closeResources(null, pre, rs);
        }

        return hoaDonList;
    }
public double getTongDoanhThuTheoNgay(String ngayLap) {
    double tongDoanhThu = 0;
    PreparedStatement pre = null;
    ResultSet rs = null;

    try {
        String sql = "SELECT SUM(tongTien) AS tongDoanhThu FROM HoaDon WHERE ngayLap = ?";
        pre = conn.prepareStatement(sql);
        pre.setString(1, ngayLap);
        rs = pre.executeQuery();

        if (rs.next()) {
            tongDoanhThu = rs.getDouble("tongDoanhThu");
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
    } finally {
        closeResources(null, pre, rs);
    }

    return tongDoanhThu;
}
public List<HoaDon> sortHoaDonByTongTien(boolean ascending) {
    List<HoaDon> hoaDonList = new ArrayList<>();
    PreparedStatement pre = null;
    ResultSet rs = null;

    try {
        // SQL query for sorting
        String sql = "SELECT maHD, tenKH, ngayLap, sdt, diaChi, tongTien " +
                     "FROM HoaDon ORDER BY tongTien " + (ascending ? "ASC" : "DESC");
        pre = conn.prepareStatement(sql);
        rs = pre.executeQuery();

        while (rs.next()) {
            HoaDon hoaDon = new HoaDon(
                    rs.getInt("maHD"),
                    rs.getString("tenKH"),
                    rs.getString("ngayLap"),
                    rs.getString("sdt"),
                    rs.getString("diaChi"),
                    rs.getDouble("tongTien")
            );
            hoaDonList.add(hoaDon);
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
    } finally {
        closeResources(null, pre, rs);
    }

    return hoaDonList;
}

    private void closeResources(Connection conn, PreparedStatement pre, ResultSet rs) {
        try {
            if (rs != null) rs.close();
            if (pre != null) pre.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
