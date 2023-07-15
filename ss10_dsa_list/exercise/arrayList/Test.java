package ss10_dsa_list.exercise.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentList studentList = new StudentList();
        int choice = 0;
        do {
            System.out.println("Menu-------------------");
            System.out.println("Vui lòng chọn chức năng: ");
            System.out.println(
                            "1.Thêm sinh viên" + "\n" +
                            "2.In danh sách sinh viên ra màn hình" + "\n" +
                            "3.Kiểm tra danh sách sinh viên có rỗng hay không" + "\n" +
                            "4.Lấy ra số lượng sinh viên trong danh sách" + "\n" +
                            "5.Làm rỗng danh sách sinh viên" + "\n" +
                            "6.Xóa sinh viên theo id" + "\n" +
                            "7.Tìm sinh viên theo tên" + "\n" +
                            "0.Kết thúc");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Nhập mã sinh viên: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.println("Nhập họ và tên: ");
                String name = sc.nextLine();
                System.out.println("Nhập năm sinh: ");
                int date = sc.nextInt();
                System.out.println("Nhập điểm trung bình: ");
                float mediumScore = sc.nextFloat();
                Student student = new Student(id, name, date, mediumScore);
                studentList.add(0, student);
            }
            if (choice == 2) {
                studentList.printStudentList();
            }
            if (choice == 3) {
                System.out.println("Danh sách hiện tại có rỗng không? - " + studentList.isEmpty());
            }
            if (choice == 4) {
                System.out.println("Số lượng sinh viên có trong danh sách là: " + studentList.getAmount());
            }
            if (choice == 5) {
                studentList.makeListEmpty();
                System.out.println("Đã xóa tất cả sinh viên có trong danh sách");
            }
            if (choice == 6) {
                System.out.println("Nhập mã sinh viên");
                int id = sc.nextInt();
                studentList.remove(id);
            }
            if (choice == 7) {
                System.out.println("Nhập tên sinh viên");
                sc.nextLine();
                String name = sc.nextLine();
                studentList.findStudent(name);
            }
        }
        while (choice != 0);
    }
}
