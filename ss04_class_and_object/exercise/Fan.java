package ss04_class_and_object.exercise;

public class Fan {
    public static void main(String[] args) {
        Fan fan1 = new Fan(); // Khởi tạo fan1 bởi constructor không có tham số;
        Fan fan2 = new Fan(8, true,10,"yellow"); // Khởi tạo fan2 bởi constructor có tham số;
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color="blue";

    public Fan(){
    }
    public Fan(int speed, boolean on, double radius, String color){
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSlow() {
        return SLOW;
    }

    public int getMedium() {
        return MEDIUM;
    }

    public int getFast() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String toString(){
        if (isOn()){
            return "Speed: " + this.getSpeed() + "\n" + "Color: " + this.getColor() + "\n" + "Radius: " + this.getRadius() + "\n" + "Fan is on ";
        }
        else {
            return "Color: " + this.color + "\n" + "Radius: " + this.radius + "\n" + "Fan is off" ;

        }
    }
}
