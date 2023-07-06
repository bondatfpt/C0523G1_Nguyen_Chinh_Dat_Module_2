package ss03_mang_va_phuong_thuc.practice;

import java.util.Scanner;

public class chuyenDoiNhietDo2 {
    public static double convertFahrenheit( double celsius){
        return celsius * 9/5 + 32;
    }
    public  static  double convertCelsius(double fahrenheit){
        return  5.9 * (fahrenheit - 32);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double celsius;
        double fahrenheit;
        int choice ;
        do {
            System.out.println("Menu: " + "\n" + " 1.Chuyen sang do F." + "\n" + " 2.Chuyen sang do C." + "\n" + " 3.Ket thuc chuong trinh");
            System.out.println("Lua chon cua ban la: ");
            choice = input.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Nhap vao do C");
                    celsius = input.nextDouble();
                    System.out.println(celsius + " do C = " + convertFahrenheit(celsius) + " do F" );
                    break;
                case 2:
                    System.out.println("Nhap vao do F");
                    fahrenheit = input.nextDouble();
                    System.out.println(fahrenheit + " do F = " + convertCelsius(fahrenheit)+ " do C");
                    break;
                case 3:
                    System.out.println("Cam on ban da tin tuong su dung");
                    break;
                default:
                    System.out.println("Ban nen chon dung so tuong ung voi dich vu cua chung toi");
            }
        }
        while (choice != 3);
    }
}
