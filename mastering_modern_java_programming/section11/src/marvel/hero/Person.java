package marvel.hero;

public interface Person {

    // allowed to make main method in interface
    static void main(String[] args) {
        System.out.println("Hello world from interfaces");
    }

    default void walk() {
        System.out.println("Person walk");
    }

}
