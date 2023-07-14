package ss10_dsa_list.exercise.exe1;

import model_view_controller.student_management.model.StudentModel;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Double> myList = new MyList();
        myList.add(5d);
        System.out.println(myList.get(0));
//        myList.ensureCapacity();
        System.out.println(myList.toString());
    }
}
