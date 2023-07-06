package ss04_class_and_object.exercise;

public class QuadraticEquationTwo {
     private double a,b,c;
    public QuadraticEquationTwo(){
    }
    private QuadraticEquationTwo(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }
    public double getDiscriminant(){
        return this.b * 2 - 4 * this.a * this.c;
    }
}
