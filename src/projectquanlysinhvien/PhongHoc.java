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
public class PhongHoc {
    private String id;
    private String maPhong;
    private String tenPhong;
    private String mota;
    private String sapXep;

    public PhongHoc() {
    }

    public PhongHoc(String id, String maPhong, String tenPhong, String mota, String sapXep) {
        this.id = id;
        this.maPhong = maPhong;
        this.tenPhong = tenPhong;
        this.mota = mota;
        this.sapXep = sapXep;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public String getSapXep() {
        return sapXep;
    }

    public void setSapXep(String sapXep) {
        this.sapXep = sapXep;
    }
    
    
    
    
}
