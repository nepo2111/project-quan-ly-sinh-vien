/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectquanlysinhvien2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import projectquanlysinhvien.DataProvider;
import projectquanlysinhvien.nguoiDungBusiness;

/**
 *
 * @author Admin
 */
public class ChuyenKhoaBusiness {
    
    //Lấy danh sách
    public List<ChuyenKhoa> layDanhSachChuyenKhoa() {
        Connection conn = null;
        //Khai báo danh sách người dùng
        List<ChuyenKhoa> lstChuyenKhoa = new ArrayList<ChuyenKhoa>();
        try {
            conn = DataProvider.ketNoi();
            //Tạo câu lệnh truy vấn SQL
            String strSQL = "Select MaKhoa, TenKhoa, OrderNumber from chuyenkhoa";
            Statement st = conn.createStatement();

            //Lấy kết quả 
            ResultSet rs = st.executeQuery(strSQL);
            ChuyenKhoa objChuyenKhoa = null;
            while (rs.next()) {
                objChuyenKhoa = new ChuyenKhoa();
                objChuyenKhoa.setMaKhoa(rs.getString("MaKhoa"));
                objChuyenKhoa.setTenKhoa(rs.getString("TenKhoa"));
                objChuyenKhoa.setOderNumber(rs.getString("OrderNumber"));
             
                //Thêm vào danh sách
                lstChuyenKhoa.add(objChuyenKhoa);
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
        return lstChuyenKhoa;

    }
    public ChuyenKhoa layChiTietTheoMa(String maKhoa) {
        ChuyenKhoa objCk = null;

        Connection conn = null;
        try {
            //Kết nối đến db làm việc
            conn = DataProvider.ketNoi();
            
            //Khai báo công việc
            //Có thể dùng theo kiểu cộng chuỗi nhưng không khuyến khích 
            String strSQL = "Select MaKhoa, TenKhoa, OrderNumber from chuyenkhoa where MaKhoa = '" + maKhoa + "'";      
            Statement comm = conn.createStatement();
            
            //Lấy data trả về
            ResultSet rs = comm.executeQuery(strSQL);
            
            //Đọc từng dòng
            //bản chất là chúng ta đang where theo khóa Chính
            //Khóa chính chắc chắn chỉ còn một thông tin  
            while (rs.next()) {
                objCk = new ChuyenKhoa();                
                objCk.setMaKhoa(rs.getString("MaKhoa"));
                objCk.setTenKhoa(rs.getString("TenKhoa"));
                objCk.setOderNumber(rs.getString("OrderNumber"));
                
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
        return objCk;
    }
}
