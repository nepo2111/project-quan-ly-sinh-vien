/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectquanlysinhvien;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class CheckConnections {
    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        
        conn = DataProvider.ketNoi();
        if(conn != null){
            System.out.println("Kết nối thành công");            
        } else {
            System.out.println("Kết nối thất bại");
        }
    }
    
}
