package case_study_module_2.model;

public class Room extends Facility{
    private String freeService;
    public Room(int id, String name, double area, double rentalCost, int capacity, String rentalType) {
        super(id, name, area, rentalCost, capacity, rentalType);
    }
    public Room(int id, String name, double area, double rentalCost, int capacity, String rentalType, String freeService) {
        super(id, name, area, rentalCost, capacity, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }
    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return super.toString()+"Room{" +
                "freeService='" + freeService + '\'' +
                "} ";
    }
}
