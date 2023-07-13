package model_view_controller.counter_application.view;

import model_view_controller.counter_application.controller.CounterListener;
import model_view_controller.counter_application.model.CounterModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CounterView extends JFrame {
    private CounterModel counterModel;
    private JButton jButton_up;
    private JButton jButton_down;
    private JButton jButton_reset;
    private JLabel jLabel_value;
    public CounterView() {
        this.counterModel = new CounterModel();
        this.init();
        this.setVisible(true);
    }
    public void init(){
       this.setTitle("Counter Application");
       this.setSize(300,300);
       this.setLocationRelativeTo(null);
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ActionListener actionListener =new CounterListener(this);

       this.jButton_up = new JButton("UP");
       jButton_up.addActionListener(actionListener);
       this.jButton_down = new JButton("DOWN");
       jButton_down.addActionListener(actionListener);
       this.jButton_reset = new JButton("RESET");
       jButton_reset.addActionListener(actionListener);
       jLabel_value = new JLabel(this.counterModel.getValue()+"", JLabel.CENTER);

       JPanel jPanel = new JPanel();
       jPanel.setLayout(new BorderLayout());
       jPanel.add(jButton_reset,BorderLayout.SOUTH);
       jPanel.add(jButton_up, BorderLayout.WEST);
       jPanel.add(jLabel_value, BorderLayout.CENTER);
       jPanel.add(jButton_down, BorderLayout.EAST);

       this.setLayout(new BorderLayout());
       this.add(jPanel, BorderLayout.CENTER);
    }
    public void increment(){
        this.counterModel.increase();
        this.jLabel_value.setText(this.counterModel.getValue()+"");
    }
    public void decrement(){
        this.counterModel.decrement();
        this.jLabel_value.setText(this.counterModel.getValue()+"");
    }
    public void reset(){
        this.counterModel.reset();
        this.jLabel_value.setText(this.counterModel.getValue()+"");
    }
}
