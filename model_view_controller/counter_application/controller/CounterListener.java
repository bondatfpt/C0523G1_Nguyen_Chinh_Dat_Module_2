package model_view_controller.counter_application.controller;

import model_view_controller.counter_application.view.CounterView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterListener implements ActionListener {
    private CounterView counterView;
    public CounterListener(CounterView counterView) {
        this.counterView = counterView;
    }

    @Override
    public void actionPerformed(ActionEvent e){
        String src = e.getActionCommand();
        if(src.equals("UP")){
            this.counterView.increment();
        }
        else if(src.equals("DOWN")){
            this.counterView.decrement();
        }
        else {
            this.counterView.reset();
        }
    }
}
