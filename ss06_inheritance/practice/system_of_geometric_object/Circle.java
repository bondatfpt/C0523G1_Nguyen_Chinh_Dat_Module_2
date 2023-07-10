package ss06_inheritance.practice.system_of_geometric_object;

public class Circle extends Shape {    // class Circle kế thừa các thuộc tính, phương thức của class Shape(có thể mở rộng thêm);
   public static void main(String[] args) {
      Circle circle = new Circle();
//      System.out.println(circle);
//      System.out.println(circle.radius);
//      System.out.println(circle.color);
//      System.out.println(circle.filled);
      System.out.println(circle.setColor("black"));
   }
   private double radius = 1.0;     // Có thêm 1 thuộc tính radius; để private vì chỉ mỗi class Circle mới cần thuộc tính radius;
   public Circle(){};               // constructor không tham số; có 1 thuộc tính mặc định radius = 1.0;
   public Circle (double radius){
      this.radius = radius;
   }     // contructor 1 tham số;
   public Circle(double radius, String color, boolean filled){    // constructor 3 tham số; có 2 thuộc tính đuợc kế thừa từ Shape là color và filled;
      super(color,filled);          // kế thừa constructor từ class: dùng từ khóa super(property),viết ở đầu thân constructor; từ khóa super đại diện cho class cha.
      this.radius = radius;
   }
   // Các phương thức getter setter cho thuộc tính radius;
   public double getRadius() {
      return radius;
   }

   public void setRadius(double radius) {
      this.radius = radius;
   }
   public double getArea(){
      return Math.pow(radius,2) * Math.PI;
   }
   public double getPerimeter(){
      return radius * 2 * Math.PI;
   }

   // Ghi đè phương thức toString của class Shape trả về 1 chuỗi khác; cùng 1 tên phương thức, cùng 1 kiểu trả về;
   @Override
   public String toString(){
      return "A circle with radius:" + this.radius + " which is a subclass of " + super.toString();
   }
}
