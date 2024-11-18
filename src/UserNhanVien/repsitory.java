/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;
import java.sql.*;
import java.util.ArrayList;

import UserNhanVien.Dbconn;
import UserNhanVien.NhanVien;

/**
 *
 * @author culua
 */
public class repsitory {
    Dbconn dbconn;
    public ArrayList<NhanVien> getList(){
        String sql = "select * from Users";
        ArrayList<NhanVien> reslut = new ArrayList<>();
        try (Connection conn = dbconn.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
            )
        {
        ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                String Id = rs.getString("Id");
                String Password = rs.getString("Password");
                String Fullname = rs.getString("Fullname");
                String Email = rs.getString("Email");
                String Admin = rs.getString("Admin");
                
                NhanVien nhanVien = new NhanVien(Id, Password, Fullname, Email, Admin);
                reslut.add(nhanVien);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return reslut;
    }
    
    public boolean addNew(NhanVien nhanVien){
        String sql = "INSERT INTO Users (Id, Password, Fullname, Email, Admin) " + "VALUES (?,?,?,?,?)";
        try (Connection conn = Dbconn.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);)
        {           
            ps.setObject(1, nhanVien.getId());
            ps.setObject(2, nhanVien.getPassword());
            ps.setObject(3, nhanVien.getFullname());
            ps.setObject(4, nhanVien.getEmail());
            ps.setObject(5, nhanVien.getAdmin());
            
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
           e.printStackTrace();
           return false;
        }
    }
    
}
