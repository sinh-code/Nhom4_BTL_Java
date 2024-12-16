/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Alex
 */
public class ChiTietHoaDon {

    private String tenSP;  // Tên sản phẩm
    private int soLuongBan;  // Số lượng bán
    private double gia;  // Giá sản phẩm
    private double thanhTien;  // Tổng tiền cho sản phẩm

    // Constructor
    public ChiTietHoaDon(String tenSP, int soLuongBan, double gia) {
        this.tenSP = tenSP;
        this.soLuongBan = soLuongBan;
        this.gia = gia;
        this.thanhTien = calculateThanhTien();  // Tính tổng tiền khi tạo chi tiết
    }

    // Getter và Setter
    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getSoLuongBan() {
        return soLuongBan;
    }

    public void setSoLuongBan(int soLuongBan) {
        this.soLuongBan = soLuongBan;
        this.thanhTien = calculateThanhTien();  // Tính lại tổng tiền khi thay đổi số lượng
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
        this.thanhTien = calculateThanhTien();  // Tính lại tổng tiền khi thay đổi giá
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    private double calculateThanhTien() {
        return this.soLuongBan * this.gia;  // Tính tổng tiền
    }
}
