package model_view_controller.customer_management.model;

public class Customer {
    private int id;
    private String name;
    private int age;
    private String typeCustomer;

    public Customer(int id, String name, int age, String typeCustomer){
        this.id = id;
        this.name = name;
        this.age = age;
        this.typeCustomer = typeCustomer;
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
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getTypeCustomer() {
        return typeCustomer;
    }
    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }
    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", typeCustomer='" + typeCustomer + '\'' +
                '}';
    }
}
