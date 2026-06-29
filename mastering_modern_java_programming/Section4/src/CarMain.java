public class CarMain {
    static {
        System.out.println("Static in the same class with main");
        System.exit(0); // This is make program not working.
    }

    public static void main(String[] args) {
        Car car1 = new Car("Nissan Skyline", "Blue", 1000);
        System.out.println(car1.model);

        System.out.println(Car.NO_OF_ENGINES);
    }
}
