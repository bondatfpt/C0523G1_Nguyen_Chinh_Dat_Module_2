package ss06_inheritance.practice.system_of_geometric_object;

public class Rectangle extends Shape { // Tương tự class Circle;
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
    }
    private double width = 1.0;
    private double height = 1.0;

    public Rectangle(){}
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    public Rectangle(double width, double height, String color, boolean filled){
        super(color,filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString(){
        return "A rectangle with width:" + this.width + " height: " + this.height + ", which is subclass of" + super.toString();
    }
}
