package marvel.app;

import marvel.animal.Cat;
import marvel.animal.Dog;
import marvel.base.Animal;

public class AppCastingDemo {
    public static void main(String[] args) {
        Animal anm = new Animal();
        anm.setName("Scooby");
        AnimalUtility.printName(anm);

        anm = new Dog();
        anm.setName("Charlie");
        AnimalUtility.printName(anm);

        Cat cat = new Cat();
        cat.setName("Snoopy");
        AnimalUtility.printName(cat); // upcasting Cat -> Animal
    }
}
