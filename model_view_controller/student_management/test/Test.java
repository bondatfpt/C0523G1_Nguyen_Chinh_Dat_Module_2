package model_view_controller.student_management.test;

import model_view_controller.student_management.model.StudentModel;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        StudentModel[]students = new StudentModel[5];
        students[0] = new StudentModel(1,"Mac");
        students[1] = new StudentModel(4,"Duc");
        students[2] = new StudentModel(2,"Phom");
        students[3] = new StudentModel(9,"Heo");
        students[4] = new StudentModel(0,"Beo");
        System.out.println(Arrays.toString(students));
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

    }
}
