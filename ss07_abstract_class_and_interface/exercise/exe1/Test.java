package ss07_abstract_class_and_interface.exercise.exe1;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];    // Khai báo và khởi tạo 1 mảng mang KDL Shape có tên shapes với độ dài là 3;
        shapes[0] = new Rectangle();      // Gán cho shapes[0] 1 đối tượng mang KDL Rectangle;
        shapes[1] = new Circle();         // Gán cho shapes[1] 1 đối tượng mang KDL Circle;
        shapes[2] = new Square();         // Gán cho shapes[2] 1 đối tượng mang KDL Square;
        // Vòng lặp duyệt mảng shapes, lần lượt tăng kích thước cho các phần tử bằng method resize đã định nghĩa từ trước;
        for (int i = 0; i < shapes.length; i++) {
            shapes[i].resize(Math.round(Math.random()*100));
        }
        // Vòng lặp duyệt mảng, in ra chuỗi thông tin của các phần tử;
        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i].toString());
        }
    }
}
