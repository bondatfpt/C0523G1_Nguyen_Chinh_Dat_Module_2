package Bai_1_introduction_to_java.practice;

import java.util.Scanner;

public class giaiPtBacNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Phương trình bậc nhất có dạng: ax + b = 0");
        double a,b;
        System.out.println("Nhập giá trị của a");
        a = sc.nextDouble();
        System.out.println("Nhập giá trị của b");
        b = sc.nextDouble();
        if (a == 0 && b == 0){
            System.out.println("Phương trình có vô số nghiệm");
        }
        else if (a == 0 && b != 0){
            System.out.println("Phương trình vô nghiệm");
        }
        else {
            System.out.println("Phương trình có một nghiệm duy nhất là: " + (-b/a));
        }
    }
}
