package ss04_class_and_object.exercise;

import java.util.Scanner;

public class QuadraticEquationTwo {
    // Trường dữ liệu a,b,c thuộc kiểu private double;
    private double a, b, c;
    // constructor không tham số;
    public QuadraticEquationTwo() {
    }
    // constructor có 3 tham số double a, double b, double c;
    private QuadraticEquationTwo(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    // Các phương thức getter, setter của 3 tham số a,b,c;
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }
    // Phương thức trả về delta của phương trình bậc 2;
    public double getDiscriminant() {
        return this.b * 2 - 4 * this.a * this.c;
    }
    // 2 phương thức trả về 2 nghiệm của phương trình bậc 2 nếu delta lớn hơn 0;
    public double getRoot1(){
            return (-(this.b) + Math.pow(Math.pow(this.b,2) - this.a * this.c *4,0.5))/ 2 * this.a;
    }
    public double getRoot2(){
            return (-(this.b) - Math.pow(Math.pow(this.b,2) - this.a * this.c * 4,0.5))/ 2 * this.a;
    }
    // Phương thức trả về một chuỗi nếu delta thỏa mãn 1 trong 3 điều kiện sau;
    public String getResultEquation(){
        if(this.getDiscriminant()> 0){
            return "The equation has two roots :" + getRoot1() + "," + getRoot2();
        } else if (this.getDiscriminant() == 0 ) {
           return  "The equation has one root :" + getRoot1();
        }
        else {
            return "The equation has no root";
        }
    }
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
