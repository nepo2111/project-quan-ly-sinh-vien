/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectquanlysinhvien;

import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class FrmCapNhatNguoiDung extends javax.swing.JFrame {

    private String taiKhoan = "";

    public String getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(String taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    /**
     * Creates new form FrmCapNhatNguoiDung
     */
    public FrmCapNhatNguoiDung() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtStt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtHoTen = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTaiKhoan = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        btnDong = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtMatKhau = new javax.swing.JPasswordField();
        txtXacNhan = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin người dùng  ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 15))); // NOI18N

        jLabel1.setText("STT:");

        txtStt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Họ tên:");

        txtHoTen.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Tài khoản:");

        txtTaiKhoan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Mật khẩu:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Email:");

        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Địa chỉ:");

        txtDiaChi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnDong.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnDong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectquanlysinhvien/image/Images/Images/cancel.gif"))); // NOI18N
        btnDong.setText("Đóng");
        btnDong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDongActionPerformed(evt);
            }
        });

        btnCapNhat.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCapNhat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectquanlysinhvien/image/Images/Images/Update.png"))); // NOI18N
        btnCapNhat.setText("Cập nhật");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Xác nhận:");

        txtMatKhau.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtXacNhan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHoTen)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtXacNhan))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(60, 60, 60)
                        .addComponent(txtStt, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(36, 36, 36)
                        .addComponent(txtDiaChi))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCapNhat)
                        .addGap(18, 18, 18)
                        .addComponent(btnDong, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtStt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtXacNhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDong)
                    .addComponent(btnCapNhat))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        //Khởi tạo đối tượng để gọi hàm
        nguoiDungBusiness nguoiDungBus = new nguoiDungBusiness();
        nguoiDung objNguoiDung = new nguoiDung();

        //Khai báo biến
        String strStt = "", hoTen = "", taiKhoan1 = "", matKhau = "", xacNhan = "",
                email = "", diaChi = "";
        int stt = 0;

        //Lấy dữ liệu từ giao diện
        strStt = txtStt.getText();
        hoTen = txtHoTen.getText();
        taiKhoan1 = txtTaiKhoan.getText();
        matKhau = new String(txtMatKhau.getPassword());
        xacNhan = new String(txtXacNhan.getPassword());
        email = txtEmail.getText();
        diaChi = txtDiaChi.getText();
        //Kiểm tra điều kiện nhập
        if (strStt.length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Bạn cần phải nhập số thứ tự");
            txtStt.requestFocus();
            return;
        }
        if (nguoiDungBus.checkNum(strStt) == false) {
            JOptionPane.showMessageDialog(rootPane, "Số thứ tự không phù hợp, vui lòng nhập lại");
            txtStt.requestFocus();
            return;
        }
        if (hoTen.length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Bạn cần phải nhập họ tên");
            txtHoTen.requestFocus();
            return;
        }
        if (taiKhoan1.length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Bạn cần phải nhập tài khoản");
            txtTaiKhoan.requestFocus();
            return;
        }
        if (matKhau.length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Bạn cần phải nhập mật khẩu");
            txtMatKhau.requestFocus();
            return;
        }
        if (xacNhan.compareTo(matKhau) != 0) {
            JOptionPane.showMessageDialog(rootPane, "Mật khẩu không trùng khớp, vui lòng nhập lại");
            return;
        }
        if (email.length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Bạn cần phải nhập địa chỉ email");
            txtEmail.requestFocus();
            return;
        }
        if (diaChi.length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Bạn cần phải nhập địa chỉ");
            txtDiaChi.requestFocus();
            return;
        }
        stt = Integer.parseInt(strStt);

        //Truyền vào thuộc tính
        objNguoiDung.setStt(stt);
        objNguoiDung.setName(hoTen);
        objNguoiDung.setUserName(taiKhoan1);
        objNguoiDung.setPassword(matKhau);
        objNguoiDung.setEmail(email);
        objNguoiDung.setDiaChi(diaChi);
        
        boolean kq = false;
        //Kiểm tra điều kiện để thực hiện Cập nhật hay thêm mới
        if (!taiKhoan.isEmpty()) {
            kq = nguoiDungBus.capNhatNguoiDung(objNguoiDung);
        } else {
            //Lấy danh sách người dùng
            List<nguoiDung> lstNguoiDung = nguoiDungBus.layDanhSachNguoiDung();
            //Kiểm tra tài khoản trùng lặp
            for (nguoiDung d : lstNguoiDung) {
                if (d.getUserName().equals(taiKhoan1)) {
                    JOptionPane.showMessageDialog(rootPane, "Tài khoản này đã tồn tại");
                    txtTaiKhoan.requestFocus();
                    return;
                }
            }
            for (nguoiDung nd : lstNguoiDung) {
                if (nd.getStt() == stt) {
                    JOptionPane.showMessageDialog(rootPane, "Số thứ tự này đã tồn tại");
                    return;
                }
            //Thêm mói người dùng
            kq = nguoiDungBus.themMoiNguoiDung(objNguoiDung);
            }
            
        }

        //Reload lại danh sách
        FrmDanhSachNguoiDung.hienThiDanhSach();
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        if (!taiKhoan.isEmpty()) {
            this.setTitle("SỬA THÔNG TIN NGƯỜI DÙNG");
            txtTaiKhoan.setText(taiKhoan);
  //          txtTaiKhoan.setEditable(false);
            hienThiThongTin();
        } else {
            this.setTitle("THÊM MỚI NGƯỜI DÙNG");
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnDongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDongActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnDongActionPerformed

    public void hienThiThongTin() {
        nguoiDungBusiness nguoiDungBus = new nguoiDungBusiness();
        nguoiDung objNd = nguoiDungBus.layNguoiDungTheoTaiKhoan(taiKhoan);

        txtStt.setText(objNd.getStt() + "");
   //     txtStt.setEditable(false);
        txtHoTen.setText(objNd.getName());
        txtTaiKhoan.setText(objNd.getUserName());
        txtMatKhau.setText(objNd.getPassword());
        txtEmail.setText(objNd.getEmail());
        txtDiaChi.setText(objNd.getDiaChi());
    }

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
            java.util.logging.Logger.getLogger(FrmCapNhatNguoiDung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCapNhatNguoiDung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCapNhatNguoiDung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCapNhatNguoiDung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCapNhatNguoiDung().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnDong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JTextField txtStt;
    private javax.swing.JTextField txtTaiKhoan;
    private javax.swing.JPasswordField txtXacNhan;
    // End of variables declaration//GEN-END:variables
}