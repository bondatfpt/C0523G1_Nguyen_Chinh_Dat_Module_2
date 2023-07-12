package ss07_abstract_class_and_interface.practice.exe3;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        CircleComparator[] circles= new CircleComparator[3];
        circles[0] = new CircleComparator();
        circles[1] = new CircleComparator(15455,"black",true);
        circles[2] = new CircleComparator(96);
        System.out.println("Truoc khi sap xep");
        for (CircleComparator circle:circles) {
            System.out.println(circle);
        }
        Comparator circleCompator = new CircleComparator();
        Arrays.sort(circles,circleCompator);
        System.out.println("Sau khi sap xep");
        for (CircleComparator circle: circles) {
            System.out.println(circle);
        }
    }
}
