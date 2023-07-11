package ss04_class_and_object.exercise;

public class TestFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan(); // Khởi tạo fan1 bởi constructor không có tham số;
        Fan fan2 = new Fan(8, true,10,"yellow"); // Khởi tạo fan2 bởi constructor có tham số;
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
