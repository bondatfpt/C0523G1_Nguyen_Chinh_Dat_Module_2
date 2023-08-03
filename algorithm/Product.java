package algorithm;

public class Product {
    private int id;
    private String name;
    private double price;
    private String place;

    public Product(int id, String name, double price, String place) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.place = place;
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

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
    public String getInforToCsv (){
        return this.id +"," +this.name+","+this.price+","+this.place;
    }
}
