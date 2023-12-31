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
    }   // Hiện thức hóa phương thức resize bằng cách ghi đè;
    @Override
    public double getArea() {
        return this.diameter/2 * this.diameter/2 * Math.PI;
    }
    // Hiện thức hóa phương thức getArea bằng cách ghi đè;
    @Override
    public String toString(){
        return "A circle with diameter: " + this.diameter + " and area is: " + this.getArea() + " m²";
    }
    // Hiện thức hóa phương thức toString bằng cách ghi đè;
}
