package test_map;

import ss17_binary_file_and_serialization.practice.exe2.Student;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

public class Map {
    public static void main(String[] args) {
        Student student = new Student(1,"Dat","QT");
        Student student1 = new Student(2,"Dat1","QT");
        Student student2 = new Student(3,"Dat2","QT");
        LinkedHashMap <Student,Integer> students = new LinkedHashMap<>();
        students.put(student,1);
        students.put(student1,1);
        students.put(student2,1);
        Set<Student> studentSet = students.keySet();
        System.out.println(studentSet);

    }
}
