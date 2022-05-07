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
public class PhongHocBusiness {
    //Lấy danh sách
    public List<PhongHoc> layDanhSachPhongThi() {
        Connection conn = null;
        //Khai báo danh sách môn học
        List<PhongHoc> lstPhongHoc = new ArrayList<PhongHoc>();
        try {
            conn = DataProvider.ketNoi();
            //Tạo câu lệnh truy vấn SQL
            String strSQL = "Select Id, MaPhong, TenPhong, MoTa, SapXep from PhongHoc";
            Statement st = conn.createStatement();

            //Lấy kết quả 
            ResultSet rs = st.executeQuery(strSQL);
            PhongHoc objPh = null;
            while (rs.next()) {
                objPh = new PhongHoc();
                objPh.setId(rs.getString("Id"));
                objPh.setMaPhong(rs.getString("MaPhong"));
                objPh.setTenPhong(rs.getString("TenPhong"));
                objPh.setMota(rs.getString("MoTa"));
                objPh.setSapXep(rs.getString("SapXep"));
             
                //Thêm vào danh sách
                lstPhongHoc.add(objPh);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PhongHocBusiness.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MonHocBusiness.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return lstPhongHoc;

    }
    public PhongHoc layChiTietTheoMa(String maPH) {
        PhongHoc objPH = null;

        Connection conn = null;
        try {
            //Kết nối đến db làm việc
            conn = DataProvider.ketNoi();
            
            //Khai báo công việc
            String strSQL = "Select Id, MaPhong, TenPhong, MoTa, SapXep from PhongHoc where Id = '" + maPH + "'";      
            Statement comm = conn.createStatement();
            
            //Lấy data trả về
            ResultSet rs = comm.executeQuery(strSQL);
           
            while (rs.next()) {
                objPH = new PhongHoc();                
                objPH.setId(rs.getString("Id"));
                objPH.setMaPhong(rs.getString("MaPhong"));
                objPH.setTenPhong(rs.getString("TenPhong"));
                objPH.setMota(rs.getString("MoTa"));
                objPH.setSapXep(rs.getString("SapXep"));
                
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(PhongHocBusiness.class.getName()).log(Level.SEVERE, null, ex);
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
        return objPH;
    }
    
}
