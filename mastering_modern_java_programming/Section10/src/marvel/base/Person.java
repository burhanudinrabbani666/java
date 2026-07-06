package marvel.base;

public class Person {
    protected String name;
    protected int age;

    public void eat(String food) {
        System.out.printf("person is eating the food: %s\n", food);
    }

    public void walk() {
        System.out.println("person is walking");
    }

    public void sleep() {
        System.out.println("person is sleeping");
    }
}
