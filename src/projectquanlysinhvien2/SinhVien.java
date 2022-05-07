/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectquanlysinhvien2;

import java.util.Date;


/**
 *
 * @author Admin
 */
public class SinhVien {
    private String id;
    private String maSV;
    private String hoTen;
    private int gioiTinh;
    private Date ngaySinh;
    private String dienThoai;
    private String email;
    private String diaChi;
    private String chuyenKhoaId;

    public SinhVien() {
    }

    public SinhVien(String id, String maSV, String hoTen, int gioiTinh, Date ngaySinh, String dienThoai, String email, String diaChi, String chuyenKhoaId) {
        this.id = id;
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.dienThoai = dienThoai;
        this.email = email;
        this.diaChi = diaChi;
        this.chuyenKhoaId = chuyenKhoaId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getChuyenKhoaId() {
        return chuyenKhoaId;
    }

    public void setChuyenKhoaId(String chuyenKhoaId) {
        this.chuyenKhoaId = chuyenKhoaId;
    }
    
    
    
    
}
