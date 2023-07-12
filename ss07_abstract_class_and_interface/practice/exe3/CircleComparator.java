package ss07_abstract_class_and_interface.practice.exe3;
import java.util.Comparator;

public class CircleComparator extends Circle implements Comparator<Circle>{
    public CircleComparator() {}
    public CircleComparator(double diameter) {
        super(diameter);
    }
    public CircleComparator(double diameter, String color, boolean filled) {
        super(diameter, color, filled);
    }
    @Override
    public int compare(Circle c1, Circle c2) {
        if (c1.getDiameter() > c2.getDiameter()) return 1;
        else if (c1.getDiameter() < c2.getDiameter()) return -1;
        else return 0;
    }
}
