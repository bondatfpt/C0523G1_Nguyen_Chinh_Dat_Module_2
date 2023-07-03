package Bai_1_introduction_to_java.practice;

import java.util.Scanner;

public class kiemTraNamNhuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một năm bất kỳ");
        long year = sc.nextLong();
        if(year %  4 == 0 && year % 100 != 0){
            System.out.println(year + " là năm nhuận");
        }
        if (year % 100 == 0 && year % 400 != 0){
            System.out.println(year + " không phải là năm nhuận");
        }
        if (year % 100 == 0 && year % 400 == 0){
            System.out.println(year + " là năm nhuận");
        }
        if (year % 4 != 0 && year % 100 !=0 && year % 400 != 0){
            System.out.println(year + " không phải là năm nhuận");

        }
    }
}
