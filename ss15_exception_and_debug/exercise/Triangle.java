package ss15_exception_and_debug.exercise;

import java.text.NumberFormat;

public class Triangle {
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) throws IllegalTriangleException {
        if (a <= 0|| b <= 0|| c <= 0){
            throw  new IllegalTriangleException("Cạnh tam giác phải lớn hơn 0");
        } else if( a + b <= c || a + c <= b || c + b <= a){
            throw  new IllegalTriangleException("a + b <= c, không phải cạnh 3 của tam giác");
        }
        else {
            this.a = a;
            this.b = b;
            this.c = c;
            this.toString();
        }
    }
    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
