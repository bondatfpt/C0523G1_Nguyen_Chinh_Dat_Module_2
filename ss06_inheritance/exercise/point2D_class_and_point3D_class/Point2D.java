package ss06_inheritance.exercise.point2D_class_and_point3D_class;

import java.util.Arrays;

public class Point2D {
    private float X = 1.0F;             // 2 thuộc tính có access modifier private;
    private float Y = 1.0F;             // có giá trị mặc định là X = 1.0; Y = 1.0;

    public Point2D() {}          // constructor mặc định có giá trị mặc định;

    public Point2D(float X, float Y) {      // constructor 2 tham số;
        this.X = X;
        this.Y = Y;
    }

    // Các phương thức getter setter cho 2 thuộc tính;
    public float getX() {
        return X;
    }

    public void setX(float X) {
        this.X = X;
    }

    public float getY() {
        return Y;
    }

    public void setY(float Y) {
        this.Y = Y;
    }

    public void setXY(float X, float Y) {         // Phương thức setXY => sửa 1 lần 2 thuộc tính;
        this.X = X;
        this.Y = Y;
    }

    public float[] getXY() {                     // Phương thức getXY => lấy 1 lần 2 thuộc tính;
        float array[] = new float[2];
        array[0] = this.X;
        array[1] = this.Y;
        return array;
    }

    // Phương thức toString trả về 1 chuỗi mô tả class Point2D;
    @Override
    public String toString() {
        return "Point2D:" + "\n" + "X: " + this.X + "\n" + "Y: " + this.Y;
    }
}
