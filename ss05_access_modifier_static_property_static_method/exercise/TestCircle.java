package ss05_access_modifier_static_property_static_method.exercise;

public class TestCircle {
    public static void main(String[] args) {

        Circle circle = new Circle();  // Đối tượng được tạo bởi constructor mặc định;
        circle.setRadius(10);
        Circle circle1 = new Circle(8); // Đối tượng được tạo bởi constructor có 1 tham số radius;
        System.out.println("Radius of circle is: " + circle.getRadius() + "\n" + "Area is: " + circle.getArea() + " m²");
        System.out.println("Radius of circle1 is: " + circle1.getRadius() + "\n" + "Area is: " + circle1.getArea() + " m²");
    }
}
