/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectquanlysinhvien;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
public class IDSinhVienBusiness {
    //Hàm lấy danh sách
    public List<IDSinhVien> layDanhSachIdSinhVien() {
        Connection conn = null;
        //Khai báo danh sách người dùng
        List<IDSinhVien> lstId = new ArrayList<IDSinhVien>();
        try {
            conn = DataProvider.ketNoi();
            //Tạo câu lệnh truy vấn SQL
            String strSQL = "Select Id, HoTen from SinhVien";
            Statement st = conn.createStatement();
            //Lấy kết quả 
            ResultSet rs = st.executeQuery(strSQL);
            IDSinhVien objId = null;
            while (rs.next()) {
                objId = new IDSinhVien();
                objId.setId(rs.getString("Id"));
                objId.setHoTen(rs.getString("HoTen"));
             
                //Thêm vào danh sách
                lstId.add(objId);
            }           
        } catch (SQLException ex) {
            Logger.getLogger(IDSinhVienBusiness.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(IDSinhVienBusiness.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return lstId;
    }
    
    public IDSinhVien layChiTietTheoMa(String Id) {
        IDSinhVien objId = null;

        Connection conn = null;
        try {
            //Kết nối đến db làm việc
            conn = DataProvider.ketNoi();
            
            //Khai báo công việc
            String strSQL = "Select Id, HoTen from SinhVien where Id = '" + Id + "'";      
            Statement comm = conn.createStatement();
            
            //Lấy data trả về
            ResultSet rs = comm.executeQuery(strSQL);
           
            while (rs.next()) {
                objId = new IDSinhVien();                
                objId.setId(rs.getString("id"));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(MonHocBusiness.class.getName()).log(Level.SEVERE, null, ex);
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
        return objId;
    }
    
}
