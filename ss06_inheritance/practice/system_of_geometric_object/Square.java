package ss06_inheritance.practice.system_of_geometric_object;

public class Square extends Rectangle {         // class Square kế thừa class Rectangle;
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);
    }
    public Square() {
    }
    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
    }
    @Override
    public void setWidth (double width){
        setWidth(width);
    }
    @Override
    public String toString(){
        return "A square width side: " + super.getWidth() + " which is a subclass of " + super.toString();
    }
}
