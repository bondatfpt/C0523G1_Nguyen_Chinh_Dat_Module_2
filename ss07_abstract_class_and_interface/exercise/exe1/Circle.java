package ss07_abstract_class_and_interface.exercise.exe1;

public class Circle extends Shape {
    private double diameter = 10.0;
    public Circle(){}
    public Circle(double diameter){
        this.diameter = diameter;
    }
    public Circle(double diameter, String color, boolean filled){
        super(color, filled);
        this.diameter = diameter;
    }
    public double getDiameter() {
        return diameter;
    }
    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }
    @Override
    public void resize(double percent) {
        this.diameter  += this.diameter * percent / 100;
    }
    @Override
    public double getArea() {
        return this.diameter/2 * this.diameter/2 * Math.PI;
    }
    @Override
    public String toString(){
        return "A circle with diameter: " + this.diameter + " and area is: " + this.getArea() + " m²";
    }
}
