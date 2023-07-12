package ss07_abstract_class_and_interface.exercise.exe1;

public abstract class Shape implements Resizeable {
    private String color = "red";
    private boolean filled = true;

    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    @Override
    public abstract void resize(double percent);

    public abstract String toString();

    public abstract double getArea();
}
