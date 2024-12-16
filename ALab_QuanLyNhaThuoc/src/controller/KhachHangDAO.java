/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.KhachHang;

/**
 *
 * @author Alex
 */
public class KhachHangDAO {
    
      private Connection conn;

    public KhachHangDAO() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://LAPTOP-GTMBKA52\\SQLEXPRESS:1433;databaseName=QLNhaThuoc;encrypt=true;trustServerCertificate=true";
            String user = "sa";
            String pwd = "123456789";
            conn = DriverManager.getConnection(url, user, pwd);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public ArrayList<KhachHang> getAllKhachHang() {       
        ArrayList<KhachHang> list = new ArrayList<>();
        String sql = "SELECT * FROM KHACHHANG";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                KhachHang kh = new KhachHang();
                kh.setMaKhachHang(rs.getInt("maKhachHang"));
                kh.setTenKH(rs.getString("tenKhachHang"));
                kh.setDiaChi(rs.getString("diaChi"));
                kh.setSDT(rs.getString("SDT"));
                
                list.add(kh);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public int addKhachHang(KhachHang nv) {
       String sql = "INSERT INTO KHACHHANG(tenKhachHang, diaChi, SDT) OUTPUT INSERTED.maKhachHang VALUES ( ?, ?, ?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, nv.getTenKH());
            ps.setString(2, nv.getDiaChi());
            ps.setString(3, nv.getSDT());

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt("maKhachHang");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1; // Return -1 if insertion fails*/
       
    }

   /* public boolean updateNhanVien(NhanVien nv) {
        String sql = "UPDATE NhanVien SET tenNV = ?, sdt = ?, chucVu = ?, luong = ? WHERE maNhanVien = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, nv.getTenNV());
            ps.setString(2, nv.getSdt());
            ps.setString(3, nv.getChucVu());
            ps.setDouble(4, nv.getLuong());
            ps.setInt(5, nv.getMaNhanVien());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean deleteNhanVien(int maNhanVien) {
        String sql = "DELETE FROM NhanVien WHERE maNhanVien = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, maNhanVien);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }*/
}


