/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.HoaDonDAO;
import model.ChiTietHoaDon;
import model.HoaDon;
import javax.swing.JOptionPane;
import java.awt.print.PrinterException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alex
 */
public class QLBanThuoc extends javax.swing.JFrame {

    /**
     * Creates new form QLBanThuoc
     */
    private List<ChiTietHoaDon> chiTietHoaDonList = new ArrayList<>();

    public QLBanThuoc() {
        initComponents();
        this.setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField5 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTenThuoc = new javax.swing.JTextField();
        txtSoLuong = new javax.swing.JTextField();
        txtGia = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtTenKH = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        btnThemThuoc = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        btnPrint = new javax.swing.JButton();
        ngay = new javax.swing.JLabel();
        txtNgay = new javax.swing.JTextField();
        btnThemHD = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();

        jTextField5.setText("jTextField5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("QUẢN LÝ BÁN THUỐC");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Tên thuốc");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Số lượng");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Giá bán");

        txtSoLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSoLuongActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Tên khách hàng");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Địa chỉ ");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Số điện thoại");

        txtSDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSDTActionPerformed(evt);
            }
        });

        btnThemThuoc.setText("Thêm thuốc");
        btnThemThuoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemThuocActionPerformed(evt);
            }
        });

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        btnPrint.setText("In hoá đơn");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        ngay.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ngay.setText("Ngày lập");

        btnThemHD.setText("Them hoa don");
        btnThemHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemHDActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnThemThuoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(48, 48, 48)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDiaChi, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                                    .addComponent(txtSDT)
                                    .addComponent(txtTenKH)
                                    .addComponent(txtTenThuoc)
                                    .addComponent(txtGia)
                                    .addComponent(txtSoLuong)))
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(ngay, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnThemHD, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel6))
                            .addComponent(txtTenKH, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTenThuoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addComponent(btnThemThuoc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ngay)
                            .addComponent(txtNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemHD)
                    .addComponent(btnReset)
                    .addComponent(btnPrint))
                .addContainerGap(108, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSoLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSoLuongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSoLuongActionPerformed

    private void txtSDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSDTActionPerformed

    private void btnThemThuocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemThuocActionPerformed
        // TODO add your handling code here:
        // Collect data from the product fields
        // Lấy dữ liệu từ các trường nhập liệu
        String tenSP = txtTenThuoc.getText();  // Tên sản phẩm
        int soLuong = Integer.parseInt(txtSoLuong.getText());  // Số lượng
        double gia = Double.parseDouble(txtGia.getText());  // Giá

        // Tạo đối tượng ChiTietHoaDon và thêm vào danh sách
        ChiTietHoaDon chiTiet = new ChiTietHoaDon(tenSP, soLuong, gia);
        chiTietHoaDonList.add(chiTiet);

        // Hiển thị thông tin đã thêm vào TextArea (Có thể là danh sách các sản phẩm)
        StringBuilder sb = new StringBuilder();
        sb.append("Items in the invoice:\n");
        for (ChiTietHoaDon item : chiTietHoaDonList) {
            sb.append(item.getTenSP()).append(" - ").append(item.getSoLuongBan()).append(" x ").append(item.getGia()).append(" = ").append(item.getThanhTien()).append("\n");
        }
        sb.append("\nTotal for all items: ").append(calculateTotal()).append("\n");
        txtArea.setText(sb.toString());  // Hiển thị toàn bộ thông tin vào JTextArea

        // Làm sạch các trường nhập liệu cho sản phẩm
        txtTenThuoc.setText("");
        txtSoLuong.setText("");
        txtGia.setText("");


    }//GEN-LAST:event_btnThemThuocActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        try {
            // Kiểm tra nếu JTextArea có dữ liệu
            if (txtArea.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Không có nội dung để in!", "Thông báo", JOptionPane.WARNING_MESSAGE);
                return;
            }

            // Thực hiện in nội dung từ JTextArea
            boolean printed = txtArea.print();

            if (printed) {
                JOptionPane.showMessageDialog(this, "In hóa đơn thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Việc in hóa đơn đã bị hủy.", "Thông báo", JOptionPane.WARNING_MESSAGE);
            }
        } catch (PrinterException ex) {
            JOptionPane.showMessageDialog(this, "Lỗi khi in hóa đơn: " + ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnPrintActionPerformed

    private void btnThemHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemHDActionPerformed

    // Kiểm tra các trường thông tin đầu vào
    if (txtTenKH.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Tên khách hàng không được để trống", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    if (txtDiaChi.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Địa chỉ không được để trống", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    if (txtSDT.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Số điện thoại không được để trống", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Lấy thông tin từ các trường nhập liệu
    String tenKH = txtTenKH.getText();  // Tên khách hàng
    String ngayLap = txtNgay.getText(); // Ngày lập hóa đơn
    String sdt = txtSDT.getText();      // Số điện thoại khách hàng
    String diaChi = txtDiaChi.getText(); // Địa chỉ khách hàng

    // Tạo đối tượng HoaDon
    HoaDon hoaDon = new HoaDon();
    hoaDon.setTenKH(tenKH);
    hoaDon.setNgayLap(ngayLap);
    hoaDon.setSDT(sdt);
    hoaDon.setDiaChi(diaChi);

    // Tính tổng tiền hóa đơn từ danh sách chi tiết hóa đơn
    double tongTien = 0;
    for (ChiTietHoaDon chiTiet : chiTietHoaDonList) {
        double thanhTien = chiTiet.getSoLuongBan() * chiTiet.getGia(); // Tính thành tiền cho từng sản phẩm
        chiTiet.setThanhTien(thanhTien); // Lưu lại thành tiền vào đối tượng
        tongTien += thanhTien; // Cộng dồn vào tổng tiền
        hoaDon.addChiTiet(chiTiet); // Thêm sản phẩm vào hóa đơn
    }
    hoaDon.setTongTien(tongTien); // Lưu tổng tiền vào hóa đơn

    // Lưu hóa đơn vào cơ sở dữ liệu
    HoaDonDAO hoaDonDAO = new HoaDonDAO();
    boolean isAdded = hoaDonDAO.themHoaDon(hoaDon);

    if (isAdded) {
        // Nếu lưu thành công, hiển thị thông tin vào JTextArea
        StringBuilder sb = new StringBuilder();
        sb.append("===== Pharmacy Invoice =====\n");

        // Hiển thị thông tin khách hàng
        sb.append(String.format("%-20s: %s\n", "Số hoá đơn:", hoaDon.getMaHD())); // Số hóa đơn
        sb.append(String.format("%-20s: %s\n", "Tên khách hàng:", hoaDon.getTenKH())); // Tên khách hàng
        sb.append(String.format("%-20s: %s\n", "Ngày lập: ", hoaDon.getNgayLap()));        // Ngày lập hóa đơn
        sb.append(String.format("%-20s: %s\n", "Số điện thoại: ", hoaDon.getSDT()));    // Số điện thoại
        sb.append(String.format("%-20s: %s\n", "Địa chỉ:", hoaDon.getDiaChi()));      // Địa chỉ

        // Hiển thị chi tiết hóa đơn
        sb.append("\nItems:\n");
        sb.append(String.format("%-20s %-10s %-10s %-10s\n", "Tên thuốc", "Số lượng", "Giá", "Thành tiền")); // Tiêu đề
        sb.append("-------------------------------------------------------------\n");
        for (ChiTietHoaDon chiTiet : hoaDon.getChiTietHoaDonList()) {
            sb.append(String.format("%-20s %-10d %-10.2f %-10.2f\n", chiTiet.getTenSP(), chiTiet.getSoLuongBan(), chiTiet.getGia(), chiTiet.getThanhTien()));
        }
        sb.append("-------------------------------------------------------------\n");
        sb.append(String.format("%-20s: %.2f\n", "Tổng tiền", hoaDon.getTongTien())); // Tổng tiền
        sb.append("\nCảm ơn đã mua hàng!\n");

        // Hiển thị vào JTextArea
        txtArea.setText(sb.toString());

        // Thông báo thành công
        JOptionPane.showMessageDialog(this, "Hóa đơn đã được thêm thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);

        // Làm sạch form và danh sách chi tiết hóa đơn
//        resetForm();
        chiTietHoaDonList.clear();
    } else {
        // Nếu lỗi, hiển thị thông báo
        JOptionPane.showMessageDialog(this, "Có lỗi xảy ra khi thêm hóa đơn.", "Lỗi", JOptionPane.ERROR_MESSAGE);
    }


    }//GEN-LAST:event_btnThemHDActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        resetForm();
    }//GEN-LAST:event_btnResetActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QLBanThuoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLBanThuoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLBanThuoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLBanThuoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLBanThuoc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnThemHD;
    private javax.swing.JButton btnThemThuoc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel ngay;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtNgay;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTenKH;
    private javax.swing.JTextField txtTenThuoc;
    // End of variables declaration//GEN-END:variables

    private void resetForm() {
        // Reset all text fields
        txtNgay.setText("");
        txtSDT.setText("");
        txtTenKH.setText("");
        txtDiaChi.setText("");
        txtTenThuoc.setText("");
        txtSoLuong.setText("");
        txtGia.setText("");

        // Clear the product list
        chiTietHoaDonList.clear();
        txtArea.setText(""); // Clear the JTextArea as well
    }

    private double calculateTotal() {
        double total = 0;
        for (ChiTietHoaDon item : chiTietHoaDonList) {
            total += item.getThanhTien();
        }
        return total;
    }

}
