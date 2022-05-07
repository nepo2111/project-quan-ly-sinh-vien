/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectquanlysinhvien;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class TimKiemUserBusiness {

    //Hàm lấy danh sách
    public List<TimKiemUser> layDanhSach() {
        List<TimKiemUser> lstTimKiem = new ArrayList<TimKiemUser>();
        //Tạo kết nối
        Connection conn = null;
        try {
            conn = DataProvider.ketNoi();
            //Tạo câu lện truy vấn SQL
            String SQL = "Select Name, UserName from userlogin";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            TimKiemUser objTimKiemU = null;
            while (rs.next()) {
                objTimKiemU = new TimKiemUser();
                objTimKiemU.setHoTen(rs.getString("Name"));
                objTimKiemU.setTaiKhoan(rs.getString("UserName"));

                //Them vao danh sach
                lstTimKiem.add(objTimKiemU);
            }

        } catch (SQLException ex) {
            Logger.getLogger(TimKiemUserBusiness.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lstTimKiem;
    }
    
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

}
