package marvel.app;

import marvel.animal.Cat;
import marvel.animal.Dog;
import marvel.base.Animal;

public class AnimalUtility {
    public static void printName(Animal animal) {
        System.out.println("\n" + animal.getName());
        animal.eat();
    }

    public static void performAction(Animal animal) {
        animal.eat();

        if (animal instanceof Dog) { // old syntax
            Dog dog = (Dog) animal;
            dog.bark();
        } else if (animal instanceof Cat cat) { // new syntax. java 16 ^
            cat.meow();
        }

    }
}
