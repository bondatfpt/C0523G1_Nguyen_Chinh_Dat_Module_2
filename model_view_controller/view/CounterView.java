package model_view_controller.view;

import model_view_controller.controller.CounterListener;
import model_view_controller.model.CounterModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CounterView extends JFrame {
    private CounterModel counterModel;
    private JButton jButton_up;
    private JButton jButton_down;
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
       jLabel_value = new JLabel(this.counterModel.getValue()+"", JLabel.CENTER);

       JPanel jPanel = new JPanel();
       jPanel.setLayout(new BorderLayout());
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
}
