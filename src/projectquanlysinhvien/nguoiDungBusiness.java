/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectquanlysinhvien;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Admin
 */
public class nguoiDungBusiness {

    public boolean checkLogin(String taiKhoan, String matKhau) {
        Connection conn = null;
        try {
            conn = DataProvider.ketNoi();
            Statement st = conn.createStatement();
            String strSQL = "Select UserName, Password from userlogin";
            //Lấy dữ liệu trả về
            ResultSet rs = st.executeQuery(strSQL);
            //Thêm vào List
            while (rs.next()) {
                if ((taiKhoan.equals(rs.getString("UserName"))) && (matKhau.equals(rs.getString("Password")))) {
                    return true;
                }
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi hêre");
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(nguoiDungBusiness.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return false;

    }

    //Hàm lấy danh sách người dùng
    public List<nguoiDung> layDanhSachNguoiDung() {
        Connection conn = null;
        //Khai báo danh sách người dùng
        List<nguoiDung> lstNguoiDung = new ArrayList<nguoiDung>();
        try {
            conn = DataProvider.ketNoi();
            //Tạo câu lệnh truy vấn SQL
            String strSQL = "Select STT, Name, UserName, Password, Email, DiaChi from userlogin";
            Statement st = conn.createStatement();

            //Lấy kết quả 
            ResultSet rs = st.executeQuery(strSQL);
            nguoiDung objNguoiDung = null;
            while (rs.next()) {
                objNguoiDung = new nguoiDung();
                objNguoiDung.setStt(rs.getInt("STT"));
                objNguoiDung.setName(rs.getString("Name"));
                objNguoiDung.setUserName(rs.getString("UserName"));
                objNguoiDung.setPassword(rs.getString("Password"));
                objNguoiDung.setEmail(rs.getString("Email"));
                objNguoiDung.setDiaChi(rs.getString("DiaChi"));

                //Thêm vào danh sách
                lstNguoiDung.add(objNguoiDung);
            }
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
        return lstNguoiDung;

    }

    //Hàm thêm mới người dùng
    public boolean themMoiNguoiDung(nguoiDung objNd) {
        Connection conn = null;
        try {
            conn = DataProvider.ketNoi();
            //Khai báo câu lệnh truy vấn SQL
            String strSQL = "Insert into userlogin(STT, Name, UserName, Password, Email, DiaChi) values(?, ?, ?, ?, ?, ?)";

            PreparedStatement ps = conn.prepareStatement(strSQL);
            //Truyền vào theo từng cột
            ps.setInt(1, objNd.getStt());
            ps.setString(2, objNd.getName());
            ps.setString(3, objNd.getUserName());
            ps.setString(4, objNd.getPassword());
            ps.setString(5, objNd.getEmail());
            ps.setString(6, objNd.getDiaChi());

            return (ps.executeUpdate() > 0);
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
            return false;
        }

    }

    public boolean checkNum(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (Exception e) {
        }
        return false;
    }

    //Hàm Cập nhật thông tin người dùng
    public boolean capNhatNguoiDung(nguoiDung objNguoiDung) {
        //Tạo kết nối với DB
        Connection conn = null;
        try {
            conn = DataProvider.ketNoi();
            //Tạo câu lệnh truy vấn SQL
            String strSQL = "Update userlogin set STT = ?, Name = ?, Password = ?, Email = ?, DiaChi = ? where UserName = ?";

            PreparedStatement ps = conn.prepareStatement(strSQL);

            //Truyền dữ liệu vào bảng
            ps.setInt(1, objNguoiDung.getStt());
            ps.setString(2, objNguoiDung.getName());
            ps.setString(3, objNguoiDung.getPassword());
            ps.setString(4, objNguoiDung.getEmail());
            ps.setString(5, objNguoiDung.getDiaChi());
            ps.setString(6, objNguoiDung.getUserName());
            
            return (ps.executeUpdate() > 0);

        } catch (SQLException ex) {
            System.out.println("Looix here");
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(nguoiDungBusiness.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return false;
    }

    //Hàm lấy người dùng theo tài khoản
    public nguoiDung layNguoiDungTheoTaiKhoan(String taiKhoan) {
        nguoiDung objNguoiDung = null;

        //Tạo kết nối với DB
        Connection conn = null;
        try {
            conn = DataProvider.ketNoi();

            //Tạo câu lệnh truy vấn SQL
            String strSQL = "Select STT, Name, UserName, password, Email, DiaChi from userlogin" + " where UserName = '" + taiKhoan + "'";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(strSQL);
            while (rs.next()) {             
                objNguoiDung = new nguoiDung();
                objNguoiDung.setStt(rs.getInt("STT"));
                objNguoiDung.setName(rs.getString("Name"));
                objNguoiDung.setUserName(rs.getString("UserName"));
                objNguoiDung.setPassword(rs.getString("Password"));
                objNguoiDung.setEmail(rs.getString("Email"));
                objNguoiDung.setDiaChi(rs.getString("DiaChi"));
            }

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
        return objNguoiDung;
    }
    
    //Hàm xóa người dùng
    public boolean xoaNguoiDung(String taiKhoan){
            //Tạo kết nối
            Connection conn = null;
        try {           
            conn = DataProvider.ketNoi();
            //Tạo câu lệnh truy vấn SQL
            String strSQL = "Delete from userlogin where UserName = ?";
            PreparedStatement ps = conn.prepareStatement(strSQL);
            //Truyền dữ liệu
            ps.setString(1, taiKhoan);
            
            return (ps.executeUpdate() > 0);
        } catch (SQLException ex) {
            System.out.println("Lỗi khi xóa người dùng");
        } finally {
            if (conn != null){
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(nguoiDungBusiness.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return false;
    }
    
    public List<nguoiDung> timKiemNguoiDung(String hoTen, String taiKhoan) {
        //Khai báo 1 danh sách
        List<nguoiDung> lstNguoiDung = new ArrayList<nguoiDung>();
        Connection conn = null;
        try {
            conn = DataProvider.ketNoi();
            //Khai báo công việc
            String strSQL = "Select STT, Name, UserName, Password, Email, DiaChi from userlogin where 1=1";
            //Nếu tìm theo Tài khoản
            if (!taiKhoan.isEmpty()) {
                strSQL += " AND UserName = '" + taiKhoan + "'";
            }
            //Nếu tìm theo họ tên
            if (!hoTen.isEmpty()) {
                strSQL += " AND Name = '" + hoTen + "'";
            }
            Statement comm = conn.createStatement();
            //Lấy data trả về
            ResultSet rs = comm.executeQuery(strSQL);
            //Đọc từng dòng để đưa vào danh sách
            nguoiDung objNd = null;
            while (rs.next()) {
                objNd = new nguoiDung();
                objNd.setStt(rs.getInt("STT"));
                objNd.setName(rs.getString("Name"));
                objNd.setUserName(rs.getString("UserName"));
                objNd.setEmail(rs.getString("Email"));
                objNd.setDiaChi(rs.getString("DiaChi"));
                objNd.setPassword(rs.getString("Password"));
                //Thêm vào danh sách
                lstNguoiDung.add(objNd);
            }
        } catch (SQLException ex) {
            Logger.getLogger(nguoiDungBusiness.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(conn != null){
                //Đóng kết nối
                conn.close();                  
                }
            } catch (SQLException ex) {
                Logger.getLogger(nguoiDungBusiness.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lstNguoiDung;
    }

}
