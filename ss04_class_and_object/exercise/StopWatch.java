package ss04_class_and_object.exercise;


import java.util.Arrays;

public class StopWatch {
    // 2 thuộc tính ở chế độ private;
    private double startTime;
    private double endTime;

    public double getStartTime() {
        return startTime;
    }

    public void setStartTime(double startTime) {
        this.startTime = startTime;
    }

    public double getEndTime() {
        return endTime;
    }

    public void setEndTime(double endTime) {
        this.endTime = endTime;
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }
    public double  getElapsedTime(){
        return this.endTime - this.startTime;
    }
}
