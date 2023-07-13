package model_view_controller.counter_application.model;

public class CounterModel {
    private int value;
    public CounterModel() {}
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public void increase(){
        this.value++;
    }
    public void  decrement(){
        this.value--;
    }
    public void reset(){
        this.value = 0;
    }

}
