package ss01_introduction_to_java.practice;

import java.util.Scanner;

public class DienTichHcn {
    public static void main(String[] args) {
        double height;
        double width ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào chiều dài hình chữ nhật");
        height = sc.nextDouble();
        System.out.println("Nhập vào chiều rộng hình chữ nhật");
        width = sc.nextDouble();
        double area = height * width;
        System.out.println("Diện tích hình chữ nhật là: " + area);
    }
}
