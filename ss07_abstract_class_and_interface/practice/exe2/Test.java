package ss07_abstract_class_and_interface.practice.exe2;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle();
        circles[1] = new ComparableCircle(2);
        circles[2] = new ComparableCircle(4,"black",true);
        System.out.println("Truoc khi sap xep");
        for (ComparableCircle circle:circles) {
            System.out.println(circle);
        }
        Arrays.sort(circles);
        System.out.println("Sau khi sap xep");
        for (ComparableCircle circle: circles) {
            System.out.println(circle);
        }
    }
}
