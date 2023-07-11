package ss06_inheritance.exercise.point_class_and_moveable_class;

import java.util.Arrays;

public class Movable extends Point {
    private float XSpeed = 0.0F;
    private float YSpeed = 0.0F;

    public Movable(){}
    public Movable(float XSpeed, float YSpeed ){
        this.XSpeed = XSpeed;
        this.YSpeed = YSpeed;
    }
    public Movable(float XSpeed, float YSpeed, float X, float Y){
        super(X,Y);
        this.XSpeed = XSpeed;
        this.YSpeed = YSpeed;
    }

    public float getXSpeed() {
        return XSpeed;
    }

    public void setXSpeed(float XSpeed) {
        this.XSpeed = XSpeed;
    }

    public float getYSpeed() {
        return YSpeed;
    }

    public void setYSpeed(float YSpeed) {
        this.YSpeed = YSpeed;
    }

    public void setSpeed(float XSpeed, float YSpeed){
        this.XSpeed = XSpeed;
        this.YSpeed = YSpeed;
    }
    public float[] getSpeed(){
        float array[] = new float[2];
        array[0] = XSpeed;
        array[1] = YSpeed;
        return array;
    }
    public void move(){
        this.X += this.XSpeed;
        this.Y += this.YSpeed;
    }
    public String toString(){
        return "MovablePoint: " + "\n" + "X: " + getX() + "\n" + "Y: " + getY() + "\n" + "Speed: " + "\n" + "XSpeed: " + getSpeed()[0] +"\n" + "YSpeed: "+ getSpeed()[1]+ "\n";
    }
}
