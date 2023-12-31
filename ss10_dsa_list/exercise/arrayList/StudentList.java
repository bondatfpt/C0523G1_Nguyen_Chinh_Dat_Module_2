package ss10_dsa_list.exercise.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentList {
    private ArrayList<Student> list;
    public StudentList() {
        this.list = new ArrayList<>();
    }
    public StudentList(ArrayList<Student> list) {
        this.list = list;
    }
    //1. Thêm sinh viên vào danh sách;
    public void add (int index, Student student){
        this.list.add(index,student);
    }

    // 2. In danh sách sinh viên ra màn hình;
    public void printStudentList(){
        for (Student student:list) {
            System.out.println(student);
        }
    }
    // 3.Kiểm tra danh sách rỗng hay không?
    public boolean isEmpty(){
        return this.list.isEmpty();
    }

    // 4.Lấy ra số lượng sinh viên trong danh sách;
    public int getAmount(){
        return this.list.size();
    }

    //5. Làm rỗng danh sách sinh viên;
    public void makeListEmpty(){
        this.list.removeAll(list);
    }
    // 6. Xóa 1 sinh viên ra khỏi danh sách;
    public void remove(int id){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId() == id){
                list.remove(i);
            }
        }
    }
    //7. Tìm kiếm sinh viên dựa theo tên nhập từ bàn phím;
    public void findStudent(String name) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().contains(name)) {
                System.out.println(list.get(i));
            }
        }
    }
}

