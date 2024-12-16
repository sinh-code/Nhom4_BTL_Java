/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

public class HoaDon {
    private int maHD; // Mã hóa đơn
    private String ngayLap; // Ngày lập hóa đơn
    private String SDT; // Số điện thoại khách hàng
    private String tenKH; // Tên khách hàng
    private String diaChi; // Địa chỉ khách hàng
    private List<ChiTietHoaDon> chiTietHoaDonList; // Danh sách chi tiết hóa đơn
    private double tongTien;

    // Hàm tạo mặc định
    public HoaDon() {
        this.chiTietHoaDonList = new ArrayList<>();
    }

    // Hàm tạo với thông tin đầy đủ
    public HoaDon(int maHD, String ngayLap, String SDT, String tenKH, String diaChi, double tongTien) {
        this.maHD = maHD;
        this.ngayLap = ngayLap;
        this.SDT = SDT;
        this.tenKH = tenKH;
        this.diaChi = diaChi;
        this.tongTien = tongTien;
        this.chiTietHoaDonList = new ArrayList<>();
    }

    // Getter và Setter
    public int getMaHD() {
        return maHD;
    }

    public void setMaHD(int maHD) {
        this.maHD = maHD;
    }

    public String getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(String ngayLap) {
        this.ngayLap = ngayLap;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public List<ChiTietHoaDon> getChiTietHoaDonList() {
        return chiTietHoaDonList;
    }

    public void setChiTietHoaDonList(List<ChiTietHoaDon> chiTietHoaDonList) {
        this.chiTietHoaDonList = chiTietHoaDonList;
    }
 
 public double getTongTien() {
        return tongTien;
    }

    // Phương thức tính tổng tiền
//    public float tinhTongTien() {
//        float tongTien = 0;
//        for (ChiTietHoaDon cthd : chiTietHoaDonList) {
//            tongTien += cthd.getThanhTien();
//        }
//        return tongTien;
//    }
// public double getTongTien() {
//        double tongTien = 0;
//        for (ChiTietHoaDon chiTiet : chiTietHoaDonList) {
//            tongTien += chiTiet.getThanhTien();
//        }
//        return tongTien;
//    }
    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public void addChiTiet(ChiTietHoaDon chiTiet) {
        this.chiTietHoaDonList.add(chiTiet);
    }

   

   
}