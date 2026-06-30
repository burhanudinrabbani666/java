import java.text.MessageFormat;

public class CommentMain {

    // main method is used to start the Java program
    public static void main(String[] args) {

        Car mycar = new Car("Zoro", "Turbo");
        mycar.modifingCar("super rocker");
    }

    /**
     * Car
     * 
     * @version 1.0.0
     * @author burhanudin rabbani
     */

    /*
     * This class represent a car in CommentMain app.
     * have name (String) and engine (String) property
     */
    public static class Car {
        private String name;
        private String engine;

        public Car(String name, String engine) {
            this.name = name;
            this.engine = engine;
        }

        public void modifingCar(String engine) {
            this.engine = engine;
            System.out.println(
                    MessageFormat.format(
                            "{0} success modify. new engine: {1}.",
                            this.name,
                            this.engine));
        }
    }
}
