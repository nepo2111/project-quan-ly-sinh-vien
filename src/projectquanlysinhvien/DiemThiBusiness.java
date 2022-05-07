/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectquanlysinhvien;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class DiemThiBusiness {

    //Hàm lấy danh sách
    public List<DiemThi> layDanhSachDiemThi() {
        Connection conn = null;
        //Khai báo danh sách người dùng
        List<DiemThi> lstDiemThi = new ArrayList<DiemThi>();
        try {
            conn = DataProvider.ketNoi();
            //Tạo câu lệnh truy vấn SQL
            String strSQL = "Select SinhVienId, MonHocId, NgayThi, DiemThi, PhongHocId, HoTen from DiemThi";
            Statement st = conn.createStatement();
            //Lấy kết quả 
            ResultSet rs = st.executeQuery(strSQL);
            DiemThi objDiemThi = null;
            while (rs.next()) {
                objDiemThi = new DiemThi();
                objDiemThi.setSinhVienId(rs.getString("SinhVienId"));
                objDiemThi.setMonHocId(rs.getString("MonHocId"));
                objDiemThi.setNgayThi(rs.getDate("NgayThi"));
                objDiemThi.setDiemThi(rs.getDouble("DiemThi"));
                objDiemThi.setPhongHocId(rs.getString("PhongHocId"));
                objDiemThi.setHoTen(rs.getString("HoTen"));

                //Thêm vào danh sách
                lstDiemThi.add(objDiemThi);
            }
            //Lấy tên của Sinh Viên

        } catch (SQLException ex) {
            Logger.getLogger(nguoiDungBusiness.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(nguoiDungBusiness.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return lstDiemThi;

    }

    public boolean themMoi(DiemThi objDt) {
        Connection conn = null;

        try {
            //Kết nối đến db làm việc
            conn = DataProvider.ketNoi();

            //Khai báo công việc
            String strInsert = "Insert into DiemThi(SinhVienId, MonHocId, NgayThi, DiemThi, PhongHocId, HoTen) values("
                    + "?,?,?,?,?,?)";

            //Truyền theo kiểu dạng tham số
            PreparedStatement comm = conn.prepareStatement(strInsert);

            comm.setString(1, objDt.getSinhVienId());
            comm.setString(2, objDt.getMonHocId());
            comm.setDate(3, new java.sql.Date(objDt.getNgayThi().getTime()));
            comm.setDouble(4, objDt.getDiemThi());
            comm.setString(5, objDt.getPhongHocId());
            comm.setString(6, objDt.getHoTen());

            return (comm.executeUpdate() > 0);
        } catch (SQLException ex) {
            Logger.getLogger(DiemThiBusiness.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (conn != null) {
                    //Đóng kết nối
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(DiemThiBusiness.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }

    //Hàm lấy chi tiết theo mã ID sinh viên
    public DiemThi layChiTietTheoMa(String Id) {
        DiemThi objDiemThi = null;

        Connection conn = null;
        try {
            //Kết nối đến db làm việc
            conn = DataProvider.ketNoi();

            //Khai báo công việc
            //Có thể dùng theo kiểu cộng chuỗi nhưng không khuyến khích 
            String strSQL = "Select SinhVienId, HoTen, DiemThi, NgayThi, MonHocId, PhongHocId from diemthi" + " where SinhVienId = '" + Id + "'";

            Statement comm = conn.createStatement();

            //Lấy data trả về
            ResultSet rs = comm.executeQuery(strSQL);

            while (rs.next()) {
                objDiemThi = new DiemThi();
                objDiemThi.setSinhVienId(rs.getString("SinhVienId"));
                objDiemThi.setHoTen(rs.getString("HoTen"));
                objDiemThi.setDiemThi(rs.getDouble("DiemThi"));
                objDiemThi.setNgayThi(rs.getDate("NgayThi"));
                objDiemThi.setMonHocId(rs.getString("MonHocId"));
                objDiemThi.setPhongHocId(rs.getString("PhongHocId"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(DiemThiBusiness.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (conn != null) {
                    //Đóng kết nối
                    conn.close();
                }
            } catch (SQLException exx) {
                System.out.println("");
            }
        }

        return objDiemThi;
    }

    public boolean capNhat(DiemThi objDiem) {
        Connection conn = null;
        try {
            //Kết nối đến db làm việc
            conn = DataProvider.ketNoi();

            //Khai báo công việc
            String strUpdate = "Update diemthi set MonHocId = ?, NgayThi = ?, DiemThi = ?, PhongHocId=?, HoTen = ? where SinhVienId = ?";

            PreparedStatement comm = conn.prepareStatement(strUpdate);

            comm.setString(1, objDiem.getMonHocId());
            comm.setDate(2, new Date(objDiem.getNgayThi().getTime()));
            comm.setDouble(3, objDiem.getDiemThi());
            comm.setString(4, objDiem.getPhongHocId());
            comm.setString(5, objDiem.getHoTen());
            comm.setString(6, objDiem.getSinhVienId());

            //Thực hiện công việc
            return (comm.executeUpdate() > 0);
        } catch (SQLException ex) {
            Logger.getLogger(DiemThiBusiness.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (conn != null) {
                    //Đóng kết nối
                    conn.close();
                }

            } catch (SQLException ex) {
                Logger.getLogger(DiemThiBusiness.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }

    public boolean xoaSinhVien(String id) {
        Connection conn = null;
        try {
            //Kết nối đến db làm việc
            conn = DataProvider.ketNoi();

            //Khai báo công việc
            String strDelete = "Delete from diemthi where SinhVienId = ?";
            PreparedStatement comm = conn.prepareStatement(strDelete);
            //Thiết lập các giá trị cho tham số
            comm.setString(1, id);

            //Thực hiện công việc
            return (comm.executeUpdate() > 0);
        } catch (SQLException ex) {
            System.out.println("Sai hêre");
        } finally {
            try {
                if (conn != null) {
                    //Đóng kết nối
                    conn.close();
                }

            } catch (SQLException ex) {
                Logger.getLogger(DiemThiBusiness.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }

    public List<DiemThi> timKiemDiemThi(String tuKhoa, String maMh) {
        //Khai báo 1 danh sách
        List<DiemThi> lstDiemThi = new ArrayList<DiemThi>();
        Connection conn = null;
        try {
            conn = DataProvider.ketNoi();
            //Khai báo công việc
            String strSQL = "Select SinhVienId, MonHocId, NgayThi, DiemThi, PhongHocId, HoTen from diemthi where 1=1";
            //Nếu tìm theo từ khóa
            if (!tuKhoa.isEmpty()) {
                strSQL += " AND (SinhVienId = '" + tuKhoa + "' OR HoTen Like '%" + tuKhoa
                        + "%'" + " OR DiemThi like '%" + tuKhoa + "%')";
            }

            //Nếu tìm theo mã môn học
            if (!maMh.isEmpty()) {
                strSQL += " AND MonHocId = '" + maMh + "'";
            }
            Statement comm = conn.createStatement();
            //Lấy data trả về
            ResultSet rs = comm.executeQuery(strSQL);
            //Đọc từng dòng để đưa vào danh sách
            DiemThi objDiemThi = null;
            while (rs.next()) {
                objDiemThi = new DiemThi();
                objDiemThi.setSinhVienId(rs.getString("SinhVienId"));
                objDiemThi.setMonHocId(rs.getString("MonHocId"));
                objDiemThi.setNgayThi(rs.getDate("NgayThi"));
                objDiemThi.setDiemThi(rs.getDouble("DiemThi"));
                objDiemThi.setPhongHocId(rs.getString("PhongHocId"));
                objDiemThi.setHoTen(rs.getString("HoTen"));
                //Thêm vào danh sách
                lstDiemThi.add(objDiemThi);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DiemThiBusiness.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (conn != null) {
                    //Đóng kết nối
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(DiemThiBusiness.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lstDiemThi;
    }

    public List<DiemThi> sapXepDanhSach(List<DiemThi> lstDiem, int sel) {
        Collections.sort(lstDiem, new Comparator<DiemThi>() {
            @Override
            public int compare(DiemThi o1, DiemThi o2) {
                int kq = 0;
                if (sel == 1) {
                    kq = Double.compare(o1.getDiemThi(), o2.getDiemThi());
                    if (kq == 0) {
                        kq = -(o1.getHoTen()).compareTo(o2.getHoTen());
                    }
                }
                if (sel == 2) {
                    kq = -Double.compare(o1.getDiemThi(), o2.getDiemThi());
                    if (kq == 0) {
                        kq = (o1.getHoTen()).compareTo(o2.getHoTen());
                    }
                }

                if (sel == 3) {      //A - Z
                    kq = (o1.getHoTen()).compareTo(o2.getHoTen());
                    if (kq == 0) {
                        kq = -Double.compare(o1.getDiemThi(), o2.getDiemThi());
                    }
                }
                return kq;
            }
        });
            return lstDiem;
    }
    
}
