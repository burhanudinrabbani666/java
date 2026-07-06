package marvel.app;

import marvel.base.Person;
import marvel.heroes.Ironman;

public class Main {
    public static void main(String[] args) {
        Ironman ironMan = new Ironman();
        ironMan.walk();
        ironMan.eat("pasta");
        ironMan.sleep();
        ironMan.usePower();

        Person person = new Person();

        int hc = person.hashCode();
        String str = person.toString();

        System.out.println(hc);
        System.out.println(str);
    }
}
