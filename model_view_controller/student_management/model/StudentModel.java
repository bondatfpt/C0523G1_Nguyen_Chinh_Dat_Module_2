package model_view_controller.student_management.model;

public class StudentModel {
    private int id ;
    private String name = "Nguyễn Chính Đạt";

    public StudentModel(){}
    public StudentModel(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
