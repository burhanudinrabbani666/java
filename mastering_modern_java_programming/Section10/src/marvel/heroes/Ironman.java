package marvel.heroes;

import marvel.base.Person;

public class Ironman extends Person {

    public void usePower() {
        System.out.println("Ironman using his power");
    }

    @Override // annotation
    public void walk() {
        System.out.println("Ironman walking so fast with nitro shoes");
    }

}
