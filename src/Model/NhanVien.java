/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Hyun
 */
<<<<<<< HEAD
public class NhanVien {
    
}
=======
import java.time.LocalDateTime;

public class NhanVien {
    private String idNhanVien;
    private String tenNhanVien;
    private LocalDateTime caLam;
    private String diaChi;
    private String email;
    private String sdt;

    // Constructors
    public NhanVien() {}

    public NhanVien(String idNhanVien, String tenNhanVien, LocalDateTime caLam, String diaChi, String email, String sdt) {
        this.idNhanVien = idNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.caLam = caLam;
        this.diaChi = diaChi;
        this.email = email;
        this.sdt = sdt;
    }

    // Getters and Setters
    public String getIdNhanVien() {
        return idNhanVien;
    }

    public void setIdNhanVien(String idNhanVien) {
        this.idNhanVien = idNhanVien;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public LocalDateTime getCaLam() {
        return caLam;
    }

    public void setCaLam(LocalDateTime caLam) {
        this.caLam = caLam;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
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

>>>>>>> 19737577e7a3cc60c8dd22f4af25436e91c7b6f6
