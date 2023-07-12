package ss07_abstract_class_and_interface.exercise.exe2;

public class Square extends Shape implements Colorable {
    private double side = 5.0;
    public Square(){}
    public Square(double side){
        this.side = side;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
    public Square(double side, String color, boolean filled){
        super(color, filled);
        this.side = side;
    }
    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }
    @Override
    public double getArea() {
        return this.side * this.side;
    }
    @Override
    public String toString(){
        return "A square with side: " + this.side + " and area is: " + this.getArea() + " m²";
    }
}
