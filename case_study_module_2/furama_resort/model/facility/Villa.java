package case_study_module_2.furama_resort.model.facility;

public class Villa extends Facility {
    private String roomStandard;
    private double poolArea;
    private int numberFloors;

    public Villa(String id) {
        super(id);
    }

    public Villa(String id, String name, double usableArea, double rentalCost, int capacity, String rentalType) {
        super(id, name, usableArea, rentalCost, capacity, rentalType);
    }

    public Villa(String id, String name, double usableArea, double rentalCost, int capacity, String rentalType, String roomStandard, double poolArea, int numberFloors) {
        super(id, name, usableArea, rentalCost, capacity, rentalType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numberFloors = numberFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberFloors() {
        return numberFloors;
    }

    public void setNumberFloors(int numberFloors) {
        this.numberFloors = numberFloors;
    }
    public String getInforToCsv (){
        return this.getId() + "," + this.getName() + "," + this.getUsableArea() + "," + this.getRentalCost() + "," + this.getCapacity() + "," + this.getRentalType() + "," + roomStandard + "," + poolArea + "," + numberFloors;
    }

    @Override
    public String toString() {
        return  super.toString() + "Villa{" +
                "roomStandard='" + roomStandard + '\'' +
                ", poolArea=" + poolArea +
                ", numberFloors=" + numberFloors +
                "} ";
    }
}
