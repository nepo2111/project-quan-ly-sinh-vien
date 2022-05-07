/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectquanlysinhvien;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class DataProvider {
    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    
    private static final String DATABASE_LINK = "jdbc:mysql://localhost:3306/quanlysinhvienproject?useUnicode=true&characterEncoding=UTF-8&useSSL=false";
    
    public static Connection ketNoi(){
        //Tạo kết nối đến DB
        Connection conn = null;
        try {
            Class.forName(JDBC_DRIVER);
            
            conn = DriverManager.getConnection(DATABASE_LINK, "root", "21112001");
        } catch (ClassNotFoundException ex) {
            System.out.println("Không tìm thấy driver, chi tiết lỗi: " + ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("Không tạo được kết nối, chi tiết lỗi: " + ex.getMessage());
        }
        return conn;
    }
}
