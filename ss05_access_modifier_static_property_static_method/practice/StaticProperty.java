package ss05_access_modifier_static_property_static_method.practice;

public class StaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Ben",1);
        Car car2 = new Car("Mez",1);
        Car car3 = new Car("Maz",1);
        System.out.println(Car.numberOfCars);
    }
    public static class Car {
        private String name;
        private int id;
        public static int numberOfCars;

        public  Car (String name, int id){
            this.name = name;
            this.id = id;
            numberOfCars++;
        }

    }
}
