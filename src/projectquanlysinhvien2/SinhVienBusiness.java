/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectquanlysinhvien2;
import projectquanlysinhvien.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Admin
 */
public class SinhVienBusiness {

    //hàm Lấy danh sách sinh viên
    public List<SinhVien> layDanhSachSinhVien() {
        Connection conn = null;
        //Khai báo danh sách người dùng
        List<SinhVien> lstSinhVien = new ArrayList<SinhVien>();
        try {
            conn = DataProvider.ketNoi();
            //Tạo câu lệnh truy vấn SQL
            String strSQL = "Select Id, MaSV, HoTen, GioiTinh, NgaySinh, DienThoai, Email, DiaChi, ChuyenKhoaId from sinhvien";
            Statement st = conn.createStatement();

            //Lấy kết quả 
            ResultSet rs = st.executeQuery(strSQL);
            SinhVien objSinhVien = null;
            while (rs.next()) {
                objSinhVien = new SinhVien();
                objSinhVien.setId(rs.getString("Id"));
                objSinhVien.setMaSV(rs.getString("MaSV"));
                objSinhVien.setHoTen(rs.getString("HoTen"));
                objSinhVien.setGioiTinh(rs.getInt("GioiTinh"));
                objSinhVien.setNgaySinh(rs.getDate("NgaySinh"));
                objSinhVien.setDienThoai(rs.getString("DienThoai"));
                objSinhVien.setDiaChi(rs.getString("DiaChi"));
                objSinhVien.setEmail(rs.getString("Email"));
                objSinhVien.setChuyenKhoaId(rs.getString("ChuyenKhoaId"));

                //Thêm vào danh sách
                lstSinhVien.add(objSinhVien);
            }
        } catch (SQLException ex) {
            Logger.getLogger(nguoiDungBusiness.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SinhVienBusiness.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
        return lstSinhVien;

    }
    
    
    public boolean themMoi(SinhVien objSV) {
        Connection conn = null;

        try {
            //Kết nối đến db làm việc
            conn = DataProvider.ketNoi();
            
            //Khai báo công việc
            String strInsert = "Insert into sinhvien(Id, MaSV, HoTen, GioiTinh, NgaySinh, DienThoai, Email, DiaChi, ChuyenKhoaId) values("
                    + "?,?,?,?,?,?,?,?,?)";

            //Truyền theo kiểu dạng tham số
            //Có bao nhiêu giá trị truyền vào thì truyền bấy nhiêu tham số
            PreparedStatement comm = conn.prepareStatement(strInsert);

            //Thiết lập các giá cho tham số
            //Tham số luôn bắt đầu từ 1 chứ không phải từ 0
            //Truyền đúng theo trình tự cột
            comm.setString(1, objSV.getId());
            comm.setString(2, objSV.getMaSV());
            comm.setString(3, objSV.getHoTen());
            comm.setInt(4, objSV.getGioiTinh());
            comm.setDate(5, new java.sql.Date(objSV.getNgaySinh().getTime()));
            comm.setString(6, objSV.getDienThoai());
            comm.setString(7, objSV.getEmail());
            comm.setString(8, objSV.getDiaChi());
            comm.setString(9, objSV.getChuyenKhoaId());

            //Thực hiện công việc
            //Hàm trả về số dòng thực hiện thành công
            // lớn hơn 0 thì thực hiện thành công - trả về true
            // Return là trả về true false, trả về biểu thức so sánh
            return (comm.executeUpdate() > 0);
        } catch (SQLException ex) {
            Logger.getLogger(SinhVienBusiness.class.getName()).log(Level.SEVERE, null, ex);
        } finally { 
            try {
                if(conn != null){
                //Đóng kết nối
                conn.close();                  
                }
            } catch (SQLException ex) {
                Logger.getLogger(SinhVienBusiness.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }

    public SinhVien layChiTietTheoMa(String maSV) {
        SinhVien objSV = null;

        Connection conn = null;
        try {
            //Kết nối đến db làm việc
            conn = DataProvider.ketNoi();
            
            //Khai báo công việc
            //Có thể dùng theo kiểu cộng chuỗi nhưng không khuyến khích 
            String strSQL = "Select Id, MaSV, HoTen, GioiTinh, NgaySinh, DienThoai, Email, DiaChi, ChuyenKhoaId from sinhvien" + " where MaSV = '" + maSV + "'";
            
            Statement comm = conn.createStatement();
             
            //Lấy data trả về
            ResultSet rs = comm.executeQuery(strSQL);           
            //Đọc từng dòng
            while (rs.next()) {
                objSV = new SinhVien();
                
                objSV.setId(rs.getString("Id"));
                objSV.setMaSV(rs.getString("MaSV"));
                objSV.setHoTen(rs.getString("HoTen"));
                objSV.setGioiTinh(rs.getInt("GioiTinh"));
                objSV.setNgaySinh(rs.getDate("NgaySinh"));               
                objSV.setDienThoai(rs.getString("DienThoai"));
                objSV.setEmail(rs.getString("Email"));
                objSV.setDiaChi(rs.getString("DiaChi"));               
                objSV.setChuyenKhoaId(rs.getString("ChuyenKhoaId"));               
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(SinhVienBusiness.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            try {
                if(conn != null){
                //Đóng kết nối
                conn.close();                  
                }
            } catch (SQLException exx) {
                System.out.println("");
            }
        }
        return objSV;
    }
 
    public boolean capNhat(SinhVien objSV) {
        Connection conn = null;
        try {
            //Kết nối đến db làm việc
            conn = DataProvider.ketNoi();

            //Khai báo công việc
            String strUpdate = "Update sinhvien set HoTen = ?, DienThoai = ?, Email=?, DiaChi=?" + ", GioiTinh = ?"
                    + ", NgaySinh = ?, ChuyenKhoaId = ? where MaSV = ? AND Id = ?";
            PreparedStatement comm = conn.prepareStatement(strUpdate);

            //Thiết lập các giá trị cho tham số
            //Phải để đúng trình tự
            comm.setString(1, objSV.getHoTen());
            comm.setString(2, objSV.getDienThoai());
            comm.setString(3, objSV.getEmail());
            comm.setString(4, objSV.getDiaChi());
            comm.setInt(5, objSV.getGioiTinh());
            comm.setDate(6, new java.sql.Date(objSV.getNgaySinh().getTime()));
            comm.setString(7, objSV.getChuyenKhoaId());
            comm.setString(8, objSV.getMaSV());
            comm.setString(9, objSV.getId());
            
            
            //Thực hiện công việc
            return (comm.executeUpdate() > 0);
        } catch (SQLException ex) {
            Logger.getLogger(SinhVienBusiness.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (conn != null) {
                    //Đóng kết nối
                    conn.close();
                }

            } catch (SQLException ex) {
                Logger.getLogger(SinhVienBusiness.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }

    public boolean xoaSinhVien(String maSV) {
        Connection conn = null;
        try {
            //Kết nối đến db làm việc
            conn = DataProvider.ketNoi();
            //Khai báo công việc
            String strDelete = "Delete from sinhvien where MaSV = ?";
            PreparedStatement comm = conn.prepareStatement(strDelete);

            //Thiết lập các giá trị cho tham số
            //Phải để đúng trình tự
            comm.setString(1, maSV);
          
            //Thực hiện công việc
            return (comm.executeUpdate() > 0);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                if (conn != null) {
                    //Đóng kết nối
                    conn.close();
                }

            } catch (SQLException ex) {
                Logger.getLogger(SinhVienBusiness.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }
 
    
    public List<SinhVien> timKiemSinhVien(List<ChuyenKhoa> lstCk) {
        //Khai báo 1 danh sách
        List<SinhVien> lstSinhVien = new ArrayList<SinhVien>();
        Connection conn = null;
        try {
            conn = DataProvider.ketNoi();
            //Khai báo công việc
            //Nếu tìm theo mã khoa
            for (ChuyenKhoa o : lstCk) {
                String strSQL = "Select Id, MaSV, HoTen, GioiTinh, NgaySinh, DienThoai, Email, DiaChi, ChuyenKhoaId from SinhVien where 1=1";
                String maKhoa = o.getMaKhoa();
            if (!maKhoa.isEmpty()) {
                strSQL += " AND ChuyenKhoaId = '" + maKhoa + "'";
                }                
            Statement comm = conn.createStatement();
            //Lấy data trả về
            ResultSet rs = comm.executeQuery(strSQL);
            //Đọc từng dòng để đưa vào danh sách
            SinhVien objSV = null;
            while (rs.next()) {
                objSV = new SinhVien();        
                objSV.setId(rs.getString("Id"));
                objSV.setMaSV(rs.getString("MaSV"));
                objSV.setHoTen(rs.getString("HoTen"));
                objSV.setGioiTinh(rs.getInt("GioiTinh"));
                objSV.setNgaySinh(rs.getDate("NgaySinh"));
                objSV.setDienThoai(rs.getString("DienThoai"));
                objSV.setEmail(rs.getString("Email"));
                objSV.setDiaChi(rs.getString("DiaChi"));
                objSV.setChuyenKhoaId(rs.getString("ChuyenKhoaId"));
                
                //Thêm vào danh sách
                lstSinhVien.add(objSV);
            }
           }
        } catch (SQLException ex) {
            Logger.getLogger(SinhVienBusiness.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(conn != null){
                //Đóng kết nối
                conn.close();                  
                }
            } catch (SQLException ex) {
                Logger.getLogger(SinhVienBusiness.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lstSinhVien;
    }
}
