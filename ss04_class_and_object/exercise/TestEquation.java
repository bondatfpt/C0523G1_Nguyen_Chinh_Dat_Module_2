package ss04_class_and_object.exercise;

import java.util.Scanner;

public class TestEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Khai báo và khởi tạo 3 biến a,b,c có giá trị được nhập từ bàn phím;
        System.out.println("Equation: ax² + bx + c = 0");
        System.out.println("Enter value of a");
        double a = input.nextDouble();
        System.out.println("Enter value of b");
        double b = input.nextDouble();
        System.out.println("Enter value of c");
        double c = input.nextDouble();
        // Khởi tạo 1 đối tượng qua class trên;
        QuadraticEquationTwo quadraticEquationTwo = new QuadraticEquationTwo(a,b,c);
        // Lấy ra phương thức tính delta của class trên;
        System.out.println("Delta of equation is: " + quadraticEquationTwo.getDiscriminant());
        // Lấy ra phương thức in ra kết quả của class trên;
        System.out.println(quadraticEquationTwo.getResultEquation());
    }
}
