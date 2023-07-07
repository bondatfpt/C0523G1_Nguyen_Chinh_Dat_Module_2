package ss04_class_and_object.practice;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao chieu rong hcn");
        double width = input.nextDouble();
        System.out.println("Nhap vao chieu dai hcn");
        double height = input.nextDouble();
        Rectangle hinhChuNhat = new Rectangle(width, height);
        Rectangle hinhChuNhat1 = new Rectangle(10,20);
        Rectangle hinhChuNhat2 = new Rectangle(50,60);
        Rectangle arrHinhChuNhat[] = new Rectangle[3];
        arrHinhChuNhat[0] = hinhChuNhat;
        arrHinhChuNhat[1] = hinhChuNhat1;
        arrHinhChuNhat[2] = hinhChuNhat2;
        for (Rectangle value:arrHinhChuNhat) {
            System.out.println(value.display());
            System.out.println("Dien tich hcn la: " + value.getArea() + " m²");
            System.out.println("Chu vi hcn la: " + value.getPerimeter() + " m");
        }

    }
    double width, height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width =width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.height + this.width) * 2;
    }

    public String display() {
        return "Hinh Chu Nhat {width = " + this.width + ",height = " + this.height + "}";
    }

}

