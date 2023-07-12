package ss07_abstract_class_and_interface.exercise.exe2;


public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Rectangle();
        shapes[1] = new Circle();
        shapes[2] = new Square();
        for (int i = 0; i < shapes.length; i++){
            System.out.println(shapes[i].toString());
            if(shapes[i] instanceof Square){
                ((Square)shapes[i]).howToColor();
            }
        }
    }
}
