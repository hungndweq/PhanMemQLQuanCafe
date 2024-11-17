/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Hyun
 */
public class KhachHang {
    private String idKhachHang;
    private String tenKhachHang;
    private String email;
    private String sdt;

    // Constructors
    public KhachHang() {}

    public KhachHang(String idKhachHang, String tenKhachHang, String email, String sdt) {
        this.idKhachHang = idKhachHang;
        this.tenKhachHang = tenKhachHang;
        this.email = email;
        this.sdt = sdt;
    }

    // Getters and Setters
    public String getIdKhachHang() {
        return idKhachHang;
    }

    public void setIdKhachHang(String idKhachHang) {
        this.idKhachHang = idKhachHang;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
}
