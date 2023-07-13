package model_view_controller.test;

import model_view_controller.model.CounterModel;
import model_view_controller.view.CounterView;

public class Test {
    public static void main(String[] args) {
        CounterModel counterModel = new CounterModel();
        counterModel.increase();
        System.out.println(counterModel.getValue());
        counterModel.reset();
        System.out.println(counterModel.getValue());
        counterModel.setValue(5);
        System.out.println(counterModel.getValue());
        CounterView counterView = new CounterView();

    }
}
