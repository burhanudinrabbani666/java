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

    @Override
    public void eat(String food) {
        super.eat("ketoprak");
        System.out.printf("Ironman eating %s\n", food);
    }

    public void callOverideEatMethod() {
        super.eat("ketoprak");
    }

    // overloaded method 1
    public void eat() {
        System.out.println("ironman ear method overloaded 1");
    }

    // overloaded method 2
    public String eat(String food, int quantity) {
        return String.format("""
                Ironman eat method overloaded 2. food: %s, quantity: %d\n
                """, food, quantity);

    }

}
