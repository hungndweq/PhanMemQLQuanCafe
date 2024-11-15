/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package phanmemqlquancafe;
import java.time.Year;
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
        System.out.println("Toi la Trong Kien");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập năm sinh của bạn: ");
        int birthYear = sc.nextInt();

        int currentYear = Year.now().getValue();

        int age = currentYear - birthYear;

        System.out.println("Tuổi của bạn là: " + age);

        sc.close();
    }
    
}
