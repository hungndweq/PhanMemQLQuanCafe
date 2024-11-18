/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package phanmemqlquancafe;

import java.text.SimpleDateFormat;
import java.util.Date;
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
        System.out.println("************************************");
        System.out.println("*          Welcome to Java         *");
        System.out.println("*        Code with Nhom 4          *");
        System.out.println("************************************");
        System.out.println("    *    ");
        System.out.println("   ***   ");
        System.out.println("  *****  ");
        System.out.println(" ******* ");
        System.out.println("    |    ");
        System.out.println(" Merry Christmas!");
        System.out.println("=====================================");
        System.out.println("|           JAVA PROGRAM            |");
        System.out.println("=====================================");
        System.out.println("           Let's get started!        ");

        System.out.println("Xin chao ae!");

        System.out.println("Toi la Trung Kien");
        System.out.println("Toi la Trung Kien");
       
        System.out.println("Toi la Trong Kien");
        System.out.println("al1");
        System.out.println("Toi la Anh Duc1");
        System.out.println("Toi la Tuan Minh");

        System.out.println("Moi ngay 1 commit1");
        System.out.println("Nho commit nhe moi nguoi");
        System.out.println("Huong dan moi nguoi/video");
        System.out.println("Kang Da Gyeom la Duy hung nhe moi nguoi");

        whfphjewpigjpwigjpi
        wegwegWG

        int rows = 10; // Số dòng tam giác Pascal

        for (int i = 0; i < rows; i++) {
            int number = 1;

            // Thêm khoảng trắng đầu dòng
            for (int k = 0; k < rows - i; k++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }

            System.out.println();

        }
        System.out.println("     J    A   V     V   A");
        System.out.println("     J   A A   V   V   A A");
        System.out.println(" J   J  AAAAA   V V   AAAAA");
        System.out.println("  JJJ  A     A   V   A     A");
        String text = "JAVA ROCKS!";
        String[] colors = {
            "\033[31m", // Red
            "\033[32m", // Green
            "\033[33m", // Yellow
            "\033[34m", // Blue
            "\033[35m", // Magenta
            "\033[36m" // Cyan
        };

        for (int i = 0; i < text.length(); i++) {
            System.out.print(colors[i % colors.length] + text.charAt(i));
        }
        System.out.println("\033[0m"); // Reset color
        // Màu sắc bằng ANSI Escape Codes
        String[] colors1 = {
            "\033[31m", // Đỏ
            "\033[33m", // Vàng
            "\033[32m", // Xanh lá
            "\033[34m", // Xanh dương
            "\033[35m", // Tím
            "\033[36m", // Xanh cyan
            "\033[37m" // Trắng
        };

        // Chuỗi chữ cần in
        String text1 = "NETFLIX";

        // In từng ký tự với màu sắc
        for (int i = 0; i < text1.length(); i++) {
            System.out.print(colors[i % colors.length] + text1.charAt(i));
        }
        System.out.println("Anh em nho moi ngay 1 commit nhe,toi thay ae van chua commit dau");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ten : ");
        String ten = sc.nextLine();
        System.out.println("Nhap vao dia chi");
        String diaChi = sc.nextLine();
        System.out.println("Nhap vao nam sinh : ");
        int namSinh = sc.nextInt();
        sc.nextLine();

        System.out.println("-------------");
        System.out.println("Thong tin vua nhap la");
        System.out.println("Ten : " + ten);
        System.out.println("Dia chi : " + diaChi);
        System.out.println("Nam sinh : " + namSinh);
        System.out.println("Merge pull theo yeu cau");

        System.out.println("fwf");
        System.out.println("Kiene");

         System.out.println("Toi la Tuan Minh commit ngay 2 lan 3");
           System.out.println("Toi la Tuan Minh commit ngay 2 lan 3");

           vavaa

           System.out.println("bkuqwhfeuwf");
          

    }

}
