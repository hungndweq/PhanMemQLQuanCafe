/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import Model.HoaDon;
import Model.KhachHang;
import Model.NhanVien;
import Model.SanPham;
import java.util.ArrayList;

/**
 *
 * @author Hyun
 */
public class DBQuery {
    DBConnection bConnection;
    ArrayList<SanPham> al = new ArrayList<>();
    ArrayList<KhachHang> al1 = new ArrayList<>();
    ArrayList<NhanVien> al2 = new ArrayList<>();
    ArrayList<HoaDon> al3 = new ArrayList<>();
    public ArrayList<SanPham> getSP(){
        
        return al;
    }
}
