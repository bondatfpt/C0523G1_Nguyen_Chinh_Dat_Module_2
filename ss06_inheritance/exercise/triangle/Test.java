package ss06_inheritance.exercise.triangle;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        double setSide1;
        double setSide2;
        double setSide3;
        double setHeight;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Nhap canh 1");
            setSide1 = input.nextDouble();
            triangle.setSide1(setSide1);
            System.out.println("Nhap canh 2");
            setSide2 = input.nextDouble();
            triangle.setSide2(setSide2);
            System.out.println("Nhap canh 3");
            setSide3 = input.nextDouble();
            triangle.setSide3(setSide3);
            System.out.println("Nhap chieu cao");
            setHeight = input.nextDouble();
            triangle.setHeight(setHeight);
            if (setSide1 <= 0 || setSide2 <= 0 || setSide3 <= 0 ||setHeight <= 0|| setSide1 + setSide2 < setSide3 || setSide1 + setSide3 < setSide2 || setSide2 + setSide3 < setSide1) {
                System.out.println("Khong hop le");
            }
        } while (setSide1 <= 0 || setSide2 <= 0 || setSide3 <= 0 ||setHeight<=0 || setSide1 + setSide2 < setSide3 || setSide1 + setSide3 < setSide2 || setSide2 + setSide3 < setSide1);
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao mau sac cua tam giac");
        String color = input.nextLine();
        triangle.setColor(color);
        System.out.println(triangle.toString());
    }
}

