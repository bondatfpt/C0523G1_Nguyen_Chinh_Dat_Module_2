package case_study_module_2.furama_resort.model.facility;

public class House extends Facility {
    private String roomStandard;
    private int numberFloor;

    public House(String id) {
        super(id);
    }

    public House(String id, String name, double usableArea, double rentalCost, int capacity, String rentalType) {
        super(id, name, usableArea, rentalCost, capacity, rentalType);
    }

    public House(String id, String name, double usableArea, double rentalCost, int capacity, String rentalType,
                 String roomStandard, int numberFloor) {
        super(id, name, usableArea, rentalCost, capacity, rentalType);
        this.roomStandard = roomStandard;
        this.numberFloor = numberFloor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(int numberFloor) {
        this.numberFloor = numberFloor;
    }

    @Override
    public String toString() {
        return "Id: " + this.getId() +", "+ "Name: " +this.getName() +", "+"Usable Area: " + this.getUsableArea()+"m²"+", "
                +"Rental Cost: " + this.getRentalCost()+"$" +", " + "Capacity: " + this.getCapacity()+" people"+", " +"Rental Type: " +
                this.getRentalType() +", " + "Room Standard: " + this.getRoomStandard() + ", " + " Number floor: " + this.getNumberFloor();
    }
}
