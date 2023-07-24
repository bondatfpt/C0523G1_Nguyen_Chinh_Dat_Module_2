package ss15_exception_and_debug.exercise;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        int b;
        int c;
        boolean falg;
        Triangle triangle = null;
        do {
            try {
                System.out.println("Enter a");
                a = Integer.parseInt(input.nextLine());
                System.out.println("Enter b");
                b = Integer.parseInt(input.nextLine());
                System.out.println("Enter c");
                c = Integer.parseInt(input.nextLine());
                falg = false;
                try {
                    triangle = new Triangle(a, b, c);
                } catch (IllegalTriangleException e) {
                    System.out.println(e.getMessage());
                    falg = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Lỗi nhập số thành chữ");
                falg = true;
            }
        } while (falg);
        System.out.println("Khởi tạo thành công đối tượng hình tam giác: " + "\n" + triangle);
    }
}

