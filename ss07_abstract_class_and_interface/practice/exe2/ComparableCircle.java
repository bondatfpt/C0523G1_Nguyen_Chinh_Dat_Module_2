package ss07_abstract_class_and_interface.practice.exe2;

import java.util.Comparator;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
    public ComparableCircle() {}
    public ComparableCircle(double diameter) {
        super(diameter);
    }
    public ComparableCircle(double diameter, String color, boolean filled) {
        super(diameter, color, filled);
    }
    @Override
    public int compareTo(ComparableCircle o) {
        if (getDiameter() > o.getDiameter()) return 1;
        else if (getDiameter() < o.getDiameter()) return -1;
        else return 1;
    }
}
