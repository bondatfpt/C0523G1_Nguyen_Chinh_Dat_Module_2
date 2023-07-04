package ss01_introduction_to_java.practice;

import java.util.Scanner;

public class dienTichHcn {
    public static void main(String[] args) {
        float height;
        float width ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào chiều dài hình chữ nhật");
        height = sc.nextFloat();
        System.out.println("Nhập vào chiều rộng hình chữ nhật");
        width = sc.nextFloat();
        float area = height * width;
        System.out.println("Diện tích hình chữ nhật là: " + area);
    }
}
