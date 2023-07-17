package ss12_java_collection_frame_work.practice.exe3;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Student student = new Student("Dat",20,"QT");
        Student student1 = new Student("Duc",24,"QT");
        Student student2 = new Student("Mac",21,"QT");

        List<Student> myList = new ArrayList<Student>();
        myList.add(student);
        myList.add(student1);
        myList.add(student2);

        for (Student st: myList) {
            System.out.println(st.toString());
        }

        AgeComparator ageComparator =new AgeComparator();
        Collections.sort(myList,ageComparator);
        System.out.println("So sanh theo tuoi");
        for (Student student3:myList) {
            System.out.println(student3);
        }
    }
}
