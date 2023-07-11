package ss05_access_modifier_static_property_static_method.exercise;


import java.awt.*;

public class Circle {
    public static void main(String[] args) {

        Circle circle = new Circle();  // Đối tượng được tạo bởi constructor mặc định;
        circle.setRadius(10);
        Circle circle1 = new Circle(8); // Đối tượng được tạo bởi constructor có 1 tham số radius;
        System.out.println("Radius of circle is: " + circle.getRadius() + "\n" + "Area is: " + circle.getArea() + " m²");
        System.out.println("Radius of circle1 is: " + circle1.getRadius() + "\n" + "Area is: " + circle1.getArea() + " m²");
    }
    // Thuộc tính, constructor, phương thức, getter, setter để private vì khởi tạo đối tượng trong method main trong cùng class;
    private double radius = 1.0;
    private String color = "red";

    private Circle() {
    }

    private Circle(double radius) {
        this.radius = radius;
    }

    private double setRadius(double radius) {
        return this.radius = radius;
    }

    private double getRadius() {
        return this.radius = radius;
    }

    private double getArea() {
        return Math.pow(this.radius, 2) * 3.14;
    }
}
