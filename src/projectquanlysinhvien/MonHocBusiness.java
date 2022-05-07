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
public class MonHocBusiness {
    //Lấy danh sách
    public List<MonHoc> layDanhSachMonHoc() {
        Connection conn = null;
        //Khai báo danh sách môn học
        List<MonHoc> lstMonHoc = new ArrayList<MonHoc>();
        try {
            conn = DataProvider.ketNoi();
            //Tạo câu lệnh truy vấn SQL
            String strSQL = "Select id, MaMH, TenMonHoc from MonHoc";
            Statement st = conn.createStatement();

            //Lấy kết quả 
            ResultSet rs = st.executeQuery(strSQL);
            MonHoc objMonHoc = null;
            while (rs.next()) {
                objMonHoc = new MonHoc();
                objMonHoc.setId(rs.getString("id"));
                objMonHoc.setMaMH(rs.getString("MaMH"));
                objMonHoc.setTenMonHoc(rs.getString("TenMonHoc"));
             
                //Thêm vào danh sách
                lstMonHoc.add(objMonHoc);
            }
        } catch (SQLException ex) {
            Logger.getLogger(nguoiDungBusiness.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MonHocBusiness.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return lstMonHoc;

    }
    
    
    public MonHoc layChiTietTheoMa(String maMH) {
        MonHoc objMh = null;

        Connection conn = null;
        try {
            //Kết nối đến db làm việc
            conn = DataProvider.ketNoi();
            
            //Khai báo công việc
            String strSQL = "Select id, MaMH, TenMonHoc from MonHoc where id = '" + maMH + "'";      
            Statement comm = conn.createStatement();
            
            //Lấy data trả về
            ResultSet rs = comm.executeQuery(strSQL);
           
            while (rs.next()) {
                objMh = new MonHoc();                
                objMh.setId(rs.getString("id"));
                objMh.setMaMH(rs.getString("MaMH"));
                objMh.setTenMonHoc(rs.getString("TenMonHoc"));
                
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
        return objMh;
    }
    
    
}
