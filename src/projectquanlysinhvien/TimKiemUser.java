/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectquanlysinhvien;

/**
 *
 * @author Admin
 */
public class TimKiemUser {
    private String hoTen;
    private String taiKhoan;

    public TimKiemUser() {
    }

    public TimKiemUser(String hoTen, String taiKhoan) {
        this.hoTen = hoTen;
        this.taiKhoan = taiKhoan;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(String taiKhoan) {
        this.taiKhoan = taiKhoan;
    }
    
    
    
}
