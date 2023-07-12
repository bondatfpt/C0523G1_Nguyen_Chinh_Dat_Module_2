package ss07_abstract_class_and_interface.exercise.exe2;

import ss07_abstract_class_and_interface.exercise.exe1.Resizeable;

public abstract class Shape {
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
