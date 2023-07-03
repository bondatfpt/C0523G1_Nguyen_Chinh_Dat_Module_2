package Bai_1_introduction_to_java.practice;

import java.util.Scanner;

public class chiSoCanNangCoThe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float weight,height;
        System.out.println("Nhap vao can nang cua co the");
        weight = sc.nextFloat();
        System.out.println("Nhap vao chieu cao cua co the");
        height = sc.nextFloat();
        double bmi = weight / Math.pow(height,2);
        if (bmi < 18.5){
            System.out.println("UnderWeight");
        }
        else if (bmi < 25){
            System.out.println("Normal");
        }
        else if (bmi < 30){
            System.out.println("Overweight");
        }
        else {
            System.out.println("Obese");
        }
    }
}
