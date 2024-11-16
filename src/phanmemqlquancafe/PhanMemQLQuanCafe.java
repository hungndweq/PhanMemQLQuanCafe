/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package phanmemqlquancafe;
import java.time.Year;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class PhanMemQLQuanCafe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Xin chao ae!");
        
        Scanner scanner = new Scanner(System.in);
        

        System.out.print("Nhập năm sinh của bạn: ");
        int namSinh = scanner.nextInt();
        

        int namHienTai = LocalDate.now().getYear();
        

        int tuoi = namHienTai - namSinh;
        

        if (tuoi >= 0) {
            System.out.println("Tuổi của bạn là: " + tuoi + " tuổi.");
        } else {
            System.out.println("Năm sinh không hợp lệ!");
        }

        scanner.close();
    
    }
    
}
