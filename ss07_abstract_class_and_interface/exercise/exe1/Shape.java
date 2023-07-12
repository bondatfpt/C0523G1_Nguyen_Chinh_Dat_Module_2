package ss07_abstract_class_and_interface.exercise.exe1;

public abstract class Shape implements Resizeable {     // abstract class nhận nhiệm vụ hiện thực hóa các abstract method của interface Resizeable;
    private String color = "red";       // Thuộc tính có a.m là private để đảm bảo tính bao đóng;
    private boolean filled = true;
    public Shape() {}
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    @Override
    public abstract void resize(double percent);    // Lấy abstract method từ interface về nhưng không cụ thể hóa, để lớp con làm;
    public abstract String toString();              // Abstract method;
    public abstract double getArea();               // Abstract method;
}
