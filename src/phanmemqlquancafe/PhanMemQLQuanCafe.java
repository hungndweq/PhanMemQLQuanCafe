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
        
           ho9wgh9powhgo9pehgpo9ho9ph

           
           // Kiểu dữ liệu nguyên thủy int 
           intVar = 42; double doubleVar = 3.14;
            char charVar = 'A'; 
            boolean boolVar = true; 
            System.out.println("Kiểu nguyên thủy:"); 
            System.out.println("int: " + intVar); 
            System.out.println("double: " + doubleVar); 
            System.out.println("char: " + charVar); 
            System.out.println("boolean: " + boolVar); 
            // Kiểu dữ liệu đối tượng 
            String stringVar = "Hello, World!"; 
            Integer integerObj = 123;
            Double doubleObj = 45.67; 
            System.out.println("\nKiểu đối tượng:"); 
            System.out.println("String: " + stringVar); 
            System.out.println("Integer: " + integerObj); 
            System.out.println("Double: " + doubleObj); 
            // Một số phương thức hữu ích của kiểu dữ liệu đối tượng 
            System.out.println("\nMột số phương thức của kiểu đối tượng:");
            System.out.println("Độ dài của chuỗi: " + stringVar.length()); 
            System.out.println("Ký tự tại vị trí 1 trong chuỗi: " + stringVar.charAt(1)); 
            System.out.println("Giá trị tuyệt đối của Integer: " + Math.abs(integerObj));
            System.out.println("Giá trị lớn nhất giữa Integer và Double: " + Math.max(integerObj, doubleObj.intValue()));
            // Tính chất đặc biệt của một số kiểu dữ liệu 
            System.out.println("\nTính chất đặc biệt:");
            System.out.println("Min value of int: " + Integer.MIN_VALUE); 
            System.out.println("Max value of int: " + Integer.MAX_VALUE); 
            System.out.println("Max value of double: " + Double.MAX_VALUE); 
            System.out.println("Boolean TRUE: " + Boolean.TRUE);


            public class ForLoopExample1 {
                public static void main(String[] args) {
                    // Vòng lặp for đơn giản
                    for (int i = 1; i <= 10; i++) {
                        System.out.println("Số: " + i);
                    }
                }
            }

            public class ForLoopExample2 {
                public static void main(String[] args) {
                    // Vòng lặp for lồng nhau
                    for (int i = 1; i <= 5; i++) {
                        System.out.println("Bảng cửu chương của " + i);
                        for (int j = 1; j <= 10; j++) {
                            System.out.println(i + " x " + j + " = " + (i * j));
                        }
                        System.out.println(); // Dòng trống để phân tách các bảng cửu chương
                    }
                }
            }
            
            Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập cân nặng (kg): ");
        double canNang = scanner.nextDouble();

        System.out.print("Nhập chiều cao (m): ");
        double chieuCao = scanner.nextDouble();

        double bmi = canNang / (chieuCao * chieuCao);

        System.out.println("Chỉ số BMI của bạn là: " + bmi);

        // Thêm phần xếp loại BMI nếu muốn
        if (bmi < 18.5) {
            System.out.println("Bạn đang bị gầy.");
        } else if (bmi < 25) {
            System.out.println("Bạn có cân nặng bình thường.");
        } else if (bmi < 30) {
            System.out.println("Bạn đang thừa cân.");
        } else {
            System.out.println("Bạn đang bị béo phì.");
        } 

        
        anh em vao ma commit di nhe


        System.out.print("Nhập tên của bạn: "); 
        String name = scanner.nextLine(); 
        System.out.print("Nhập tuổi của bạn: "); 
        int age = scanner.nextInt(); 
        scanner.nextLine(); 
        // Đọc bỏ dòng mới còn lại 
        System.out.print("Nhập giới tính của bạn: "); 
        String gender = scanner.nextLine(); 
        System.out.print("Nhập địa chỉ của bạn: "); 
        String address = scanner.nextLine(); 
        // In ra thông tin cá nhân 
        System.out.println("\nThông tin cá nhân:");
        System.out.println("Tên: " + name); 
        System.out.println("Tuổi: " + age); 
        System.out.println("Giới tính: " + gender);
        System.out.println("Địa chỉ: " + address);



        System.out.print("Nhập số thứ nhất: "); 
        int num1 = scanner.nextInt(); 
        System.out.print("Nhập số thứ hai: "); 
        int num2 = scanner.nextInt(); 
        int sum = num1 + num2;
         System.out.println("Tổng của hai số là: " + sum); 
         scanner.close();

        oehogegheihgewshehoggoho
        Duy hung di test
        hiphfipahfip
        rhrwhrh


        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên dương: ");
        int num = scanner.nextInt();
        long factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        System.out.println("Giai thừa của " + num + " là: " + factorial);
        scanner.close();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một chuỗi ký tự: ");
        String input = scanner.nextLine();
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println("Chuỗi sau khi đảo ngược: " + reversed);
        scanner.close();



        System.out.print("Nhập một chuỗi ký tự: ");
        String input = scanner.nextLine();
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println("Chuỗi sau khi đảo ngược: " + reversed);
        scanner.close();


        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        double average = (double) sum / arr.length;
        System.out.println("Giá trị trung bình của các phần tử trong mảng là: " + average);



        int[] arr = {10, 20, 4, 45, 99};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("Số lớn thứ hai trong mảng là: " + secondLargest);


        int[] arr = {5, 2, 9, 1, 5, 6};
        bubbleSort(arr);
        System.out.println("Mảng sau khi sắp xếp:");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Đổi chỗ
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    System.out.print("Nhập một chuỗi số: ");
    String input = scanner.nextLine();
    try {
        int result = Integer.parseInt(input);
        System.out.println("Số nguyên là: " + result);
    } catch (NumberFormatException e) {
        System.out.println("Chuỗi không phải là một số hợp lệ.");
    }
    scanner.close();



    if (year % 4 == 0) {
        if (year % 100 == 0) {
            return year % 400 == 0;
        } else {
            return true;
        }
    } else {
        return false;
    }
    
        System.out.println("Toi la duc ");    

        System.out.println("Toi la duc 2 222 ");   
       
    }

}

