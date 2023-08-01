package case_study_module_2.furama_resort.model.facility;

public class Room extends Facility {
    private String freeService;

    public Room(String id) {
        super(id);
    }

    public Room(String id, String name, double usableArea, double rentalCost, int capacity, String rentalType) {
        super(id, name, usableArea, rentalCost, capacity, rentalType);
    }

    public Room(String id, String name, double usableArea, double rentalCost, int capacity, String rentalType, String freeService) {
        super(id, name, usableArea, rentalCost, capacity, rentalType);
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
        return "Room : " + super.toString() +
                "freeService='" + freeService + '\'' +"---"
                ;
    }
}
