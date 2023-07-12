package ss07_abstract_class_and_interface.practice.exe3;

public abstract class Shape  {
    private String color = "red";
    private boolean filled = true;
    public Shape() {}
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public abstract String toString();
    public abstract double getArea();
}
