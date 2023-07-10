package ss06_inheritance.exercise.point_class_and_moveable_class;

public class Point {
    private float X = 0.0F;
    private float Y = 0.0F;
    public Point(){};
    public Point(float X, float Y){
        this.X = X;
        this.Y = Y;
    }

    public float getX() {
        return this.X;
    }

    public void setX(float X) {
        this.X = X;
    }

    public float getY() {
        return this.Y;
    }

    public void setY(float Y) {
        this.Y = Y;
    }
    public void setXY(float X, float Y){
        this.X = X;
        this.Y = Y;
    }
    public float[] getXY(){
        float array[] = new float[2];
        array[0] = X;
        array[1] = Y;
        return array;
    }
    @Override
    public String toString(){
        return "Point: " + "\n" + "X: " + this.X +"\n" + "Y: " + this.Y;
    }
}
