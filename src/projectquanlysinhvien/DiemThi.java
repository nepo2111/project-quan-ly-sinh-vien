/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectquanlysinhvien;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class DiemThi {
    private String sinhVienId;
    private String hoTen;
    private String monHocId;
    private Date ngayThi;
    private double diemThi;
    private String phongHocId;

    public DiemThi() {
    }

    public DiemThi(String sinhVienId, String hoTen, String monHocId, Date ngayThi, double diemThi, String phongHocId) {
        this.sinhVienId = sinhVienId;
        this.hoTen = hoTen;
        this.monHocId = monHocId;
        this.ngayThi = ngayThi;
        this.diemThi = diemThi;
        this.phongHocId = phongHocId;
    }

    public String getSinhVienId() {
        return sinhVienId;
    }

    public void setSinhVienId(String sinhVienId) {
        this.sinhVienId = sinhVienId;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getMonHocId() {
        return monHocId;
    }

    public void setMonHocId(String monHocId) {
        this.monHocId = monHocId;
    }

    public Date getNgayThi() {
        return ngayThi;
    }

    public void setNgayThi(Date ngayThi) {
        this.ngayThi = ngayThi;
    }

    public double getDiemThi() {
        return diemThi;
    }

    public void setDiemThi(double diemThi) {
        this.diemThi = diemThi;
    }

    public String getPhongHocId() {
        return phongHocId;
    }

    public void setPhongHocId(String phongHocId) {
        this.phongHocId = phongHocId;
    }
    
    
    
}
