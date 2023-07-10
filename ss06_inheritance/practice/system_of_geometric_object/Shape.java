package ss06_inheritance.practice.system_of_geometric_object;

public class Shape {
     String color;      // Access modifier là default vì Shape là class cha, các class con phải lấy được 2 thuộc tính này;
     boolean filled;

    public Shape() {                    // constructor không tham số, có 2 thuộc tính mặc định mang giá trị green và true;
        this("green", true);
    }

    public Shape(String color, boolean filled) {        // constructor 2 tham số;
        this.color = color;
        this.filled = filled;
    }
    // Các phương thức getter setter cho 2 thuộc tính;
    public String getColor() {
        return color;
    }

    public String setColor(String color){
       return this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    // Phương thức toString trả về 1 chuỗi các thông tin của class Shape;
    @Override
    public String toString() {
        return " A shape with color:" + this.color + " and filled: " + this.filled;
    }
}

