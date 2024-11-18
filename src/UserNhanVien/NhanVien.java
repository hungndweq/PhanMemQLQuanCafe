/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserNhanVien;

/**
 *
 * @author culua
 */
public class NhanVien {
    private String Id;
    private String Password;
    private String Fullname;
    private String Email;
    private String Admin;

    public NhanVien(String Id, String Password, String Fullname, String Email, String Admin) {
        this.Id = Id;
        this.Password = Password;
        this.Fullname = Fullname;
        this.Email = Email;
        this.Admin = Admin;
    }

    public NhanVien() {
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getFullname() {
        return Fullname;
    }

    public void setFullname(String Fullname) {
        this.Fullname = Fullname;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getAdmin() {
        return Admin;
    }

    public void setAdmin(String Admin) {
        this.Admin = Admin;
    }
    
    
}
