package ss07_abstract_class_and_interface.practice.exe1;

public class Test {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i].makeSound());
            if (animals[i] instanceof Chicken){
                System.out.println(((Chicken)animals[i]).howToEat());
            }
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i].howToEat());
        }
    }
}
