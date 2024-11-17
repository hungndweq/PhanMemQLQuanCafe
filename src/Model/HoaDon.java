/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Hyun
 */
import java.time.LocalDateTime;

public class HoaDon {

    private String idHoaDon;
    private String idNhanVien;
    private String idSanPham;
    private String idKhachHang;
    private int soLuongSanPhamMua;
    private double tongTien;
    private LocalDateTime thoiGianXuatHoaDon;

    // Constructors
    public HoaDon() {
    }

    public HoaDon(String idHoaDon, String idNhanVien, String idSanPham, String idKhachHang,
            int soLuongSanPhamMua, double tongTien, LocalDateTime thoiGianXuatHoaDon) {
        this.idHoaDon = idHoaDon;
        this.idNhanVien = idNhanVien;
        this.idSanPham = idSanPham;
        this.idKhachHang = idKhachHang;
        this.soLuongSanPhamMua = soLuongSanPhamMua;
        this.tongTien = tongTien;
        this.thoiGianXuatHoaDon = thoiGianXuatHoaDon;
    }

    // Getters and Setters
    public String getIdHoaDon() {
        return idHoaDon;
    }

    public void setIdHoaDon(String idHoaDon) {
        this.idHoaDon = idHoaDon;
    }

    public String getIdNhanVien() {
        return idNhanVien;
    }

    public void setIdNhanVien(String idNhanVien) {
        this.idNhanVien = idNhanVien;
    }

    public String getIdSanPham() {
        return idSanPham;
    }

    public void setIdSanPham(String idSanPham) {
        this.idSanPham = idSanPham;
    }

    public String getIdKhachHang() {
        return idKhachHang;
    }

    public void setIdKhachHang(String idKhachHang) {
        this.idKhachHang = idKhachHang;
    }

    public int getSoLuongSanPhamMua() {
        return soLuongSanPhamMua;
    }

    public void setSoLuongSanPhamMua(int soLuongSanPhamMua) {
        this.soLuongSanPhamMua = soLuongSanPhamMua;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public LocalDateTime getThoiGianXuatHoaDon() {
        return thoiGianXuatHoaDon;
    }

    public void setThoiGianXuatHoaDon(LocalDateTime thoiGianXuatHoaDon) {
        this.thoiGianXuatHoaDon = thoiGianXuatHoaDon;
    }
}
