/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectquanlysinhvien;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Comparator;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class FrmTraCuuDiemThi extends javax.swing.JFrame {

    /**
     * Creates new form FrmTraCuuDiemThi
     */
    public FrmTraCuuDiemThi() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtTuKhoa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cboMonHoc = new javax.swing.JComboBox<>();
        btnTimKiem = new javax.swing.JButton();
        cboSapXep = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDiemThi = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnDong = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnThemMoi = new javax.swing.JButton();
        btnSapXep = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "T??m Ki???m ??i???m Thi  ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("T??? Kh??a:");

        txtTuKhoa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("S???p x???p:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("M??n h???c:");

        cboMonHoc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cboMonHoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnTimKiem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectquanlysinhvien/image/Images/Images/search.png"))); // NOI18N
        btnTimKiem.setText("T??m Ki???m");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        cboSapXep.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cboSapXep.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---- ??i???m ----", "T??ng d???n", "Gi???m d???n" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtTuKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboSapXep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cboMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTuKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(cboMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimKiem)
                    .addComponent(cboSapXep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jTableDiemThi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableDiemThi);

        btnDong.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectquanlysinhvien/image/Images/Images/cancel.gif"))); // NOI18N
        btnDong.setText("????ng");
        btnDong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDongActionPerformed(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectquanlysinhvien/image/Images/Images/delete.png"))); // NOI18N
        btnXoa.setText("X??a");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectquanlysinhvien/image/Images/Images/EditTableHS.png"))); // NOI18N
        btnSua.setText("S???a");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnThemMoi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThemMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectquanlysinhvien/image/Images/Images/103.png"))); // NOI18N
        btnThemMoi.setText("Th??m m???i");
        btnThemMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemMoiActionPerformed(evt);
            }
        });

        btnSapXep.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSapXep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectquanlysinhvien/image/Images/Images/SortHS.png"))); // NOI18N
        btnSapXep.setText("S???p x???p");
        btnSapXep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSapXepActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSapXep, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnThemMoi)
                .addGap(18, 18, 18)
                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDong, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXoa)
                    .addComponent(btnDong)
                    .addComponent(btnSua)
                    .addComponent(btnThemMoi)
                    .addComponent(btnSapXep))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //G???i h??m hi???n th??? danh s??ch ??i???m
        hienThiDanhSachMonHoc();
        hienThiDanhSachDiem();

    }//GEN-LAST:event_formWindowOpened

    private void btnThemMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemMoiActionPerformed
        FrmThemMoi themMoi = new FrmThemMoi();

        themMoi.setVisible(true);
    }//GEN-LAST:event_btnThemMoiActionPerformed

    private void btnDongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDongActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnDongActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        int dongChon = 0;
        String sinhVienId = "";
        dongChon = jTableDiemThi.getSelectedRow();
        sinhVienId = "" + jTableDiemThi.getValueAt(dongChon, 0);
        FrmThemMoi sua = new FrmThemMoi();
        //Truy???n l??n giao di???n
        sua.setSinhVienId(sinhVienId);
        sua.setVisible(true);

    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        //X??a th??ng tin
        int ketQua = JOptionPane.showConfirmDialog(rootPane, "B???n c?? mu???n x??a th??ng tin n??y kh??ng?",
                "Th??ng b??o", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        //N???u ????ng mu???n x??a
        if (ketQua == JOptionPane.YES_OPTION) {
            String id = "";
            int dongChon = 0;

            //L???y d??ng ch???n
            dongChon = jTableDiemThi.getSelectedRow();
            id = "" + jTableDiemThi.getValueAt(dongChon, 0);
            //Khai b??o ?????i t?????ng
            DiemThiBusiness diemThiBus = new DiemThiBusiness();
            //G???i h??m x??a
            boolean kq = diemThiBus.xoaSinhVien(id);
            if (kq) {
                hienThiDanhSachDiem();
            }
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        hienThiDanhSachDiem();
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnSapXepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSapXepActionPerformed
        hienThiDanhSachDiem();
    }//GEN-LAST:event_btnSapXepActionPerformed

 
    public static void hienThiDanhSachDiem() {
        String tuKhoa = "", idMon = "";
        int s = 0;
        tuKhoa = txtTuKhoa.getText();
        s = cboSapXep.getSelectedIndex();
        MonHoc objMon = (MonHoc) cboMonHoc.getSelectedItem();

        if (objMon != null) {
            idMon = objMon.getId();
        }
        //Khai b??o c???t ti??u ?????
        String[] cotTieuDe = new String[]{"ID SV", "H??? T??n", "ID M??n", "Ng??y Thi", "??i???m Thi", "ID Ph??ng"};
        //Khai b??o model
        DefaultTableModel model = new DefaultTableModel(cotTieuDe, 0);
        //Khai b??o ?????i t?????ng ????? g???i h??m hi???n th??? danh s??ch
        DiemThiBusiness diemThiBus = new DiemThiBusiness();
        //G???i h??m hi???n th??? danh s??ch
        List<DiemThi> lstDiemThi = diemThiBus.timKiemDiemThi(tuKhoa, idMon);
        if (s == 1){
            Collections.sort(lstDiemThi, (DiemThi o1, DiemThi o2) -> {
                int kq = Double.compare(o1.getDiemThi(), o2.getDiemThi());
                if (kq == 0){
                    kq = -(o1.getHoTen()).compareTo(o2.getHoTen());
                }
                return kq; //To change body of generated lambdas, choose Tools | Templates.
            });
                
        }
        if (s == 2){
            Collections.sort(lstDiemThi, (DiemThi o1, DiemThi o2) -> {
                int kq = -Double.compare(o1.getDiemThi(), o2.getDiemThi());
                if (kq == 0){
                    kq = (o1.getHoTen()).compareTo(o2.getHoTen());
                }
                return kq; //To change body of generated lambdas, choose Tools | Templates.
            });
                
        }

        Object row[];
        for (DiemThi sv : lstDiemThi) {
            row = new Object[6];
            row[0] = sv.getSinhVienId();
            row[1] = sv.getHoTen();
            row[2] = sv.getMonHocId();
            row[3] = sv.getNgayThi();
            row[4] = sv.getDiemThi();
            row[5] = sv.getPhongHocId();

            model.addRow(row);
        }
        jTableDiemThi.setModel(model);
    }

    private void hienThiDanhSachMonHoc() {
        ///Khai b??o 1 ?????i t?????ng
        MonHocBusiness monHocBus = new MonHocBusiness();
        //L???y danh s??ch khoa
        List<MonHoc> lstMonHoc = monHocBus.layDanhSachMonHoc();
        MonHoc root = new MonHoc();
        root.setId("");
        root.setMaMH("");
        root.setTenMonHoc("---Ch???n m??n---");
        lstMonHoc.add(0, root);
        //Khai b??o 1 ?????i t?????ng ????? hi???n th??? th??ng tin l??n combobox
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        //Duy???t ????? ????a v??o danh s??ch
        for (MonHoc o : lstMonHoc) {
            model.addElement(o);
        }
        //Hi???n th??? l??n combobox
        cboMonHoc.setModel(model);
        //Tu??? bi???n l???i t???ng item c???a combobox
        cboMonHoc.setRenderer(new MonHocRender());
    }

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
            java.util.logging.Logger.getLogger(FrmTraCuuDiemThi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmTraCuuDiemThi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmTraCuuDiemThi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmTraCuuDiemThi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmTraCuuDiemThi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDong;
    private javax.swing.JButton btnSapXep;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThemMoi;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private static javax.swing.JComboBox<String> cboMonHoc;
    private static javax.swing.JComboBox<String> cboSapXep;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable jTableDiemThi;
    private static javax.swing.JTextField txtTuKhoa;
    // End of variables declaration//GEN-END:variables
}
