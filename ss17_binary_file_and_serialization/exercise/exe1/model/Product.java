package ss17_binary_file_and_serialization.exercise.exe1.model;

import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private String name;
    private double price;
    private  String manufacturer;
    private static final long serialVersionUID = 74L;
    public Product() {}
    public Product(int id, String name, double price, String manufacturer) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
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
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
