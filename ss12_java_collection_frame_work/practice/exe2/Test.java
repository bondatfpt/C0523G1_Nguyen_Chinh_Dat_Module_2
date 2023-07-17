package ss12_java_collection_frame_work.practice.exe2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        // Khởi tạo đối tượng;
        Student student1 = new Student("Dat",20,"QT");
        Student student2 = new Student("Mac",19,"QT");
        Student student3 = new Student("Duc",22,"QT");
        // Lưu đối tượng vào hashMap;
        Map<Integer,Student> myHashMap = new HashMap<>();
        myHashMap.put(1,student1);
        myHashMap.put(2,student2);
        myHashMap.put(3,student3);
        myHashMap.put(4,student1);


        for (Map.Entry<Integer,Student> studentMap:myHashMap.entrySet()) {
            System.out.println(studentMap.toString());
        }

        // Lưu đối tượng vào HashSet;
        System.out.println("............Set");
        Set<Student>students = new HashSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student1);
        for (Student student:students) {
            System.out.println(student.toString());
        }
    }
}
