package ss06_inheritance.exercise.point_class_and_moveable_class;

public class main {
    public static void main(String[] args) {
        Movable movable = new Movable();
        movable.setSpeed(5,5);
        movable.move();
        System.out.println(movable);
    }
}
