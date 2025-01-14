/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.NhanVienDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.NhanVien;

/**
 *
 * @author Alex
 */
public class QLNhanVienForm extends javax.swing.JFrame {

    /**
     * Creates new form QLNhanVienForm
     */
    private ArrayList<NhanVien> nv ;
    private DefaultTableModel model;
    int selectedIndex;
    public QLNhanVienForm() {
        initComponents();
        this.setLocationRelativeTo(null);
        nv = new NhanVienDAO().getAllNhanVien();
        model = (DefaultTableModel) tblNhanVien.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnQuaylai = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTenNV = new javax.swing.JTextField();
        txtChucVu = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        txtLuong = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNhanVien = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("QUẢN LÝ NHÂN VIÊN");

        btnQuaylai.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        btnQuaylai.setText("Quay lại");
        btnQuaylai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuaylaiActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Tên nhân viên");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Chức vụ");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Số điện thoại");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Lương");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTenNV)
                    .addComponent(txtChucVu, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSDT)
                    .addComponent(txtLuong, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(118, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(btnQuaylai)
                .addGap(124, 124, 124)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnQuaylai)
                    .addComponent(jLabel1))
                .addGap(34, 34, 34)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setText("Xoá");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        tblNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã nhân viên", "Tên nhân viên", "Số điện thoại", "Chức vụ", "Lương"
            }
        ));
        tblNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNhanVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblNhanVien);

        jButton1.setText("Hiển thị");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(btnThem)
                .addGap(116, 116, 116)
                .addComponent(btnSua)
                .addGap(114, 114, 114)
                .addComponent(btnXoa)
                .addGap(113, 113, 113)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 836, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnSua)
                    .addComponent(btnXoa)
                    .addComponent(jButton1))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
    // Kiểm tra các trường hợp nhập liệu không hợp lệ
    if (txtTenNV.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Tên nhân viên không được để trống", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    if (txtChucVu.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Chức vụ không được để trống", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    if (txtSDT.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Số điện thoại không được để trống", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    if (txtLuong.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Lương không được để trống", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        double luong = Double.parseDouble(txtLuong.getText());

        NhanVien nv = new NhanVien();
        nv.setTenNV(txtTenNV.getText());
        nv.setChucVu(txtChucVu.getText());
        nv.setSdt(txtSDT.getText());
        nv.setLuong(luong);

        int generatedMaNV = new NhanVienDAO().addNhanVien(nv);
        if (generatedMaNV != -1) {
            nv.setMaNhanVien(generatedMaNV);

            DefaultTableModel model = (DefaultTableModel) tblNhanVien.getModel();
            model.addRow(new Object[]{
                nv.getMaNhanVien(),
                nv.getTenNV(),
                nv.getChucVu(),
                nv.getSdt(),
                nv.getLuong()
            });

            // Xóa trắng các trường nhập liệu
            txtTenNV.setText("");
            txtChucVu.setText("");
            txtSDT.setText("");
            txtLuong.setText("");

            JOptionPane.showMessageDialog(this, "Thêm nhân viên thành công với mã: " + generatedMaNV);
        } else {
            JOptionPane.showMessageDialog(this, "Thêm nhân viên thất bại", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Lương phải là số hợp lệ", "Error", JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblNhanVien.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(rootPane, "Chọn nhân viên để xóa!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(rootPane,
                "Bạn có chắc muốn xóa bản ghi này?",
                "Delete Confirmation",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if (confirm == JOptionPane.YES_OPTION) {
            // Lấy ID của nhân viên cần xóa
            int maNV = (int) tblNhanVien.getValueAt(selectedRow, 0); // Giả sử cột đầu tiên là ID nhân viên

            // Gọi phương thức xóa trong DAO
            NhanVienDAO dao = new NhanVienDAO();
            if (dao.deleteNhanVien(maNV)) {
                JOptionPane.showMessageDialog(rootPane, "Nhân viên đã được xóa thành công!");

                // Cập nhật lại bảng
                loadNhanVien();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Xóa nhân viên thất bại.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
     
    // Kiểm tra nếu chưa chọn nhân viên trong bảng
    int selectedRow = tblNhanVien.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(rootPane, "Chọn nhân viên để sửa!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        // Lấy ID nhân viên từ hàng được chọn trong bảng
        int maNV = (int) tblNhanVien.getValueAt(selectedRow, 0); // Giả sử cột đầu tiên là ID nhân viên

        if (txtTenNV.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Tên nhân viên không được để trống", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (txtChucVu.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Chức vụ không được để trống", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (txtSDT.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Số điện thoại không được để trống", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (txtLuong.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Lương không được để trống", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Chuyển đổi giá trị lương từ txtLuong sang kiểu double
        double luong = Double.parseDouble(txtLuong.getText());

        // Tạo đối tượng NhanVien và thiết lập thông tin
        NhanVien nv = new NhanVien();
        nv.setMaNhanVien(maNV); // Thiết lập ID nhân viên cần cập nhật
        nv.setTenNV(txtTenNV.getText());
        nv.setChucVu(txtChucVu.getText());
        nv.setSdt(txtSDT.getText());
        nv.setLuong(luong);

        // Gọi phương thức update trong DAO để cập nhật nhân viên
        if (new NhanVienDAO().updateNhanVien(nv)) {
            JOptionPane.showMessageDialog(rootPane, "Cập nhật nhân viên thành công");
            loadNhanVien(); // Cập nhật dữ liệu trên JTable
        } else {
            JOptionPane.showMessageDialog(rootPane, "Cập nhật nhân viên thất bại", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(rootPane, "Lương phải là số hợp lệ", "Error", JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_btnSuaActionPerformed

    private void tblNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNhanVienMouseClicked
        // TODO add your handling code here:
        selectedIndex = tblNhanVien.getSelectedRow();
    // Lấy đối tượng TaiKhoan từ danh sách account
    NhanVien tk = nv.get(selectedIndex);

    // Hiển thị dữ liệu vào các trường nhập liệu
    txtTenNV.setText(tk.getTenNV());
    txtChucVu.setText(tk.getChucVu());
    txtSDT.setText(tk.getSdt());
    txtLuong.setText(String.valueOf(tk.getLuong()));
    }//GEN-LAST:event_tblNhanVienMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        loadDataToTable();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnQuaylaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuaylaiActionPerformed
        // TODO add your handling code here:
        this.dispose();
        AdminPage admin = new AdminPage();
        admin.setVisible(true);
    }//GEN-LAST:event_btnQuaylaiActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLNhanVienForm().setVisible(true);
            }
        });
    }
 private void showResult() {
        DefaultTableModel model = (DefaultTableModel) tblNhanVien.getModel();
        NhanVien s = nv.get(nv.size() - 1); 
        model.addRow(new Object[]{
            nv.size(), 
            s.getTenNV(),
            s.getChucVu(),
            s.getSdt(),
            s.getLuong()
        });
    }
    private void loadNhanVien() {
        NhanVienDAO thuocDAO = new NhanVienDAO();
        ArrayList<NhanVien> danhSachNV = thuocDAO.getAllNhanVien();

        DefaultTableModel model = (DefaultTableModel) tblNhanVien.getModel();
        model.setRowCount(0); // Xóa dữ liệu cũ

        for (NhanVien s : danhSachNV) {
            model.addRow(new Object[]{
                s.getMaNhanVien(),
                s.getTenNV(),
                s.getChucVu(),
                s.getSdt(),
                s.getLuong()
            });
        }
    }

    private void loadDataToTable() {
        DefaultTableModel model = (DefaultTableModel) tblNhanVien.getModel();
        model.setRowCount(0); // Xóa dữ liệu cũ trên bảng

        NhanVienDAO dao = new NhanVienDAO();
        nv = dao.getAllNhanVien(); // Lấy danh sách tài khoản từ cơ sở dữ liệu

        if (nv == null || nv.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane,
                    "No data found in the database. Please check your connection or add some accounts.",
                    "Information",
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        // Thêm dữ liệu vào bảng
        for (NhanVien s : nv) {
            model.addRow(new Object[]{
                s.getMaNhanVien(),
                s.getTenNV(),
                s.getChucVu(),
                s.getSdt(),
                s.getLuong()
            });
        }
}


    // Variables declaration - do not modify                
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnQuaylai;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblNhanVien;
    private javax.swing.JTextField txtChucVu;
    private javax.swing.JTextField txtLuong;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTenNV;
    // End of variables declaration//GEN-END:variables
}
