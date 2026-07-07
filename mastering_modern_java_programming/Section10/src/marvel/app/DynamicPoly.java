package marvel.app;

import marvel.base.Person;
import marvel.heroes.Ironman;

public class DynamicPoly {
    public static void main(String[] args) {
        Person person = new Ironman(); // upcasting
        person.walk(); // Ironman walk method is going to be invoked
        person.eat("bakso");

        Ironman ironman = new Ironman();
        ironman.callOverideEatMethod();
    }
}
