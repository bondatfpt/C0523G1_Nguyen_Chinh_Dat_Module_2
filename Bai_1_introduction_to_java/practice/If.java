package Bai_1_introduction_to_java.practice;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap vao mot so nguyen");
        int number = sc.nextInt();

        if (number > 10 ){
            System.out.println("La so lon hon 10");
        }
        else {
            System.out.println("La so be hon 10");
        }
    }
}
