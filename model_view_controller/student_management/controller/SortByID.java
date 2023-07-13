package model_view_controller.student_management.controller;
import model_view_controller.student_management.model.StudentModel;

import java.util.Comparator;
public class SortByID implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        StudentModel student1 = (StudentModel) o1;
        StudentModel student2 = (StudentModel) o2;
        return student1.getId() - student2.getId();
    }
}
