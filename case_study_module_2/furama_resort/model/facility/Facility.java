package case_study_module_2.furama_resort.model.facility;

public abstract class Facility {
    private String id;
    private String name;
    private double usableArea;
    private double rentalCost;
    private int capacity;
    private String rentalType;

    public Facility(String id){
        this.id = id;
    }

    public Facility(String id, String name, double usableArea, double rentalCost, int capacity, String rentalType) {
        this.id = id;
        this.name = name;
        this.usableArea = usableArea;
        this.rentalCost = rentalCost;
        this.capacity = capacity;
        this.rentalType = rentalType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUsableArea() {
        return usableArea;
    }

    public void setUsableArea (double usableArea) {
        this.usableArea = usableArea;
    }

    public double getRentalCost() {
        return rentalCost;
    }

    public void setRentalCost(double rentalCost) {
        this.rentalCost = rentalCost;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", usable area =" + usableArea +
                ", rentalCost=" + rentalCost +
                ", capacity=" + capacity +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }
}
