package ss06_inheritance.exercise.circle_class_and_cylinder_class;

public class Cylinder extends Circle {    // class Cylinder kế thừa class Circle bằng từ khóa extends;
    private double height = 1.0;        // có thêm 1 thuộc tính với giá trị mặc định height = 1.0;

    public Cylinder(){}                 // constructor mặc định;

    public Cylinder(double height) {    // constructor 1 tham số height;
        this.height = height;
    }

    public Cylinder(double height, double radius, String color) {       // constructor 3 tham số, 2 thuộc tính radius và color kế thừa từ lớp cha;
        super(radius, color);             // từ khóa super đại diện cho lớp cha(Circle), viết ở đầu thân constructor, super(property inheritance);
        this.height = height;
    }
    // Các phương thức getter setter cho thuộc tính height;
    public double getHeight() {
        return height;
    }

    public double setHeight(double height) {
        return this.height = height;
    }
    // Phương thức trả về thể tích;
    public double getVolume() {
        return Math.PI * Math.pow(super.getRadius(), 2) * this.height;
    }
    // Ghi đè phương thức toString của lớp Circle(cùng kiểu trả về, cùng tên, nhưng trả về mô tả hình trụ => tính đa hình);
    @Override
    public String toString() {
        return "A Cylinder with height: " + this.height + " and radius: " + super.getRadius() + " which is a subclass of " + super.toString();
    }
}
