package case_study_module_2.model;

import java.util.Date;

public class Employee extends Person{
    private String level;
    private String position;
    private double salary;
    public Employee(int id, String name, Date date, boolean gender, String phoneNumber, String identityNumber, String email) {
        super(id, name, date, gender, phoneNumber, identityNumber, email);
    }
    public Employee(int id, String name, Date date, boolean gender, String phoneNumber, String identityNumber, String email, String level, String position, double salary) {
        super(id, name, date, gender, phoneNumber, identityNumber, email);
        this.level = level;
        this.position = position;
        this.salary = salary;
    }
    public String getLevel() {
        return level;
    }
    public void setLevel(String level) {
        this.level = level;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString()+"Employee{" +
                "level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                "} ";
    }
}
