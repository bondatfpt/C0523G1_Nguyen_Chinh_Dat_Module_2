package ss07_abstract_class_and_interface.exercise.exe2;

public class Square implements Colorable {
    private double side = 5.0;
    public Square(){}
    public Square(double side) {
        this.side = side;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
