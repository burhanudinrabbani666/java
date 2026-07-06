package marvel.app;

import marvel.animal.Cat;
import marvel.animal.Dog;
import marvel.base.Animal;

public class DownCastingDemo {
    public static void main(String[] args) {
        Animal anm;
        Dog dog = new Dog();
        anm = dog; // upcasting

        // dog = anm; // error, downcasting is not allowed by default
        dog = (Dog) anm; // allowed downcasting

        AnimalUtility.performAction(dog);

        if (anm instanceof Cat) {
            Cat cat = (Cat) anm; // error clash class
            AnimalUtility.performAction(cat);
        }

    }
}
