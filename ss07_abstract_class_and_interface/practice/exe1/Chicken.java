package ss07_abstract_class_and_interface.practice.exe1;

import ss07_abstract_class_and_interface.practice.exe1.Animal;

public class Chicken extends Animal {
    @Override
    public String makeSound() {
        return "Quac quac";
    }
}
