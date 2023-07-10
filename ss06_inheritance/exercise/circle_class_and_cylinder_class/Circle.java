package ss06_inheritance.exercise.circle_class_and_cylinder_class;

public class Circle {
    private double radius = 1.0;          // 2 thuộc tính có access modifier private;
    private String color = "Red";         // Có giá trị mặc định: radius = 1.0; color: "Red";

    public Circle (){}          // constructor mặc định;
    public Circle (double radius, String color){        // constructor 2 tham số;
        this.radius = radius;
        this.color = color;
    }
    // Các phương thức getter setter cho 2 thuộc tính;
    public double getRadius() {
        return radius;
    }

    public double setRadius(double radius) {
       return this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public String setColor(String color) {
       return this.color = color;
    }
    // 2 phương thức tính diện tích và chu vi;
    public double getArea(){
        return Math.pow(this.radius,2) * Math.PI;
    }
    public double getPerimeter(){
        return this.radius * 2 * Math.PI;
    }
    // Phương thức toString trả về 1 chuỗi các thông tin của lớp Circle;
    @Override
    public String toString(){
        return "A Circle with radius: " + this.radius + " and color: " + this.color;
    }
}
