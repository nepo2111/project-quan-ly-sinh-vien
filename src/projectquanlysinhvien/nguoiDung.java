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
public class nguoiDung {
    private int stt;
    private String name;
    private String userName;
    private String password;
    private String email;
    private String diaChi;

    public nguoiDung() {
    }

    public nguoiDung(int stt, String name, String userName, String password, String email, String diaChi) {
        this.stt = stt;
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.diaChi = diaChi;
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    
    
    
}
