package ss07_abstract_class_and_interface.exercise.exe2;

public class Rectangle extends Shape {
    private double height = 10;
    private double width = 5;
    public Rectangle() {}
    public Rectangle(double width, double height) {
        this.height = height;
        this.width = width;
    }
    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.height = height;
        this.width = width;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    @Override
    public double getArea() {
        return this.height * this.width;
    }
    @Override
    public String toString() {
        return "A rectangle with height: " + this.height + " and width:" + this.width + " and area is: " + this.getArea() + " m²";
    }
}
