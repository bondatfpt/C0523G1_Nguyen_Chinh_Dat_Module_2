package ss05_access_modifier_static_property_static_method.exercise.bai1;
public class Circle {
     double radius = 1.0;
     String color = "red";

    public Circle() {}

    public Circle(double radius) {
        this.radius = radius;
    }

    public double setRadius(double radius) {
        return this.radius = radius;
    }

    public double getRadius() {
        return this.radius = radius;
    }

    public double getArea() {
        return Math.pow(this.radius, 2) * 3.14;
    }
}
