package ss06_inheritance.exercise.point2D_class_and_point3D_class;

import java.lang.annotation.Inherited;
import java.util.Arrays;

public class Point3D extends Point2D{   // kế thừa class Point2D;
    private float Z = 1.0F;         // có thêm 1 thuộc tính Z = 1.0, có access modifier là private vì đó là thuộc tính riêng của Point3D class;
    public Point3D(){}              // constructor mặc định mang giá trị mặc định;
    public Point3D(float X, float Y, float Z){      // constructor 3 tham số; 2 thuộc tính X,Y kế thừa từ Point2D class;
        super(X,Y);
        this.Z = Z;
    }
    // Các phương thức getter setter cho thuộc tính Z;
    public float getZ() {
        return Z;
    }
    public void setZ(float Z) {
        this.Z = Z;
    }
    public void setXYZ(float X, float Y, float Z){      // Phương thức sửa 1 lần 3 thuộc tính;
        this.setX(X);
        this.setY(Y);
        this.setZ(Z);
    }
    public float[]getXYZ(){         // Phương thức trả về 1 mảng chứa các giá trị của X,Y,Z;
        float[]getXYZ = new float[3];
        getXYZ[0] = getX();
        getXYZ[1] = getY();
        getXYZ[2] = getZ();
        return getXYZ;
    }
    // Ghi đè phương thức toString của Point2D;
    @Override
    public String toString(){
        return "Point3D:" + "\n" + "X: " + getX() + "\n" + "Y: " + getY() + "\n" + "Z: " + this.Z + "\n" + "Which is subclass of " + super.toString();
    }
}
