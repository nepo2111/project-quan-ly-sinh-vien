/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectquanlysinhvien2;

/**
 *
 * @author Admin
 */
public class ChuyenKhoa {
    private String maKhoa;
    private String tenKhoa;
    private String oderNumber;

    public ChuyenKhoa() {
    }

    public ChuyenKhoa(String maKhoa, String tenKhoa, String oderNumber) {
        this.maKhoa = maKhoa;
        this.tenKhoa = tenKhoa;
        this.oderNumber = oderNumber;
    }

    public String getMaKhoa() {
        return maKhoa;
    }

    public void setMaKhoa(String maKhoa) {
        this.maKhoa = maKhoa;
    }

    public String getTenKhoa() {
        return tenKhoa;
    }

    public void setTenKhoa(String tenKhoa) {
        this.tenKhoa = tenKhoa;
    }

    public String getOderNumber() {
        return oderNumber;
    }

    public void setOderNumber(String oderNumber) {
        this.oderNumber = oderNumber;
    }
    
    
    
}
