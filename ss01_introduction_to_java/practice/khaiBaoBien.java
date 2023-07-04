package ss01_introduction_to_java.practice;

import java.util.Scanner;

public class khaiBaoBien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap vao ho va ten");
        String name = sc.nextLine();

        System.out.println("Nhap vao mot so nguyen");
        int number = sc.nextInt();

        System.out.println("Nhap vao mot so thuc");
        float duoDecimal = sc.nextFloat();
    }
}

