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
public class MonHoc {
    private String id;
    private String maMH;
    private String tenMonHoc;

    public MonHoc() {
    }

    public MonHoc(String id, String maMH, String tenMonHoc) {
        this.id = id;
        this.maMH = maMH;
        this.tenMonHoc = tenMonHoc;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMaMH() {
        return maMH;
    }

    public void setMaMH(String maMH) {
        this.maMH = maMH;
    }

    public String getTenMonHoc() {
        return tenMonHoc;
    }

    public void setTenMonHoc(String tenMonHoc) {
        this.tenMonHoc = tenMonHoc;
    }
    
    
    
}
