package ss06_inheritance.exercise.point_class_and_moveable_class;

public class main {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);
        Movable movable = new Movable();
        System.out.println(movable);
        movable.setSpeed(5.0F,5);
    }

}
