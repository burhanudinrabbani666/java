public class Car {

    /**
     * ---------------------------------------------------------------
     * VARIABLE
     * ---------------------------------------------------------------
     */
    String model;
    String color;
    Integer horsePower;

    static final byte NO_OF_WHEELS = 4; // <- Cannot be change. constant
    static byte NO_OF_ENGINES;

    // Instance initialization block
    {
        this.model = "Tesla";
        this.color = "Blue";
        this.horsePower = 1000;

        System.out.println("Car object is created");
    }

    // Static Initialization block
    static {
        NO_OF_ENGINES = 4;

        System.out.println("Static blocking is created");
    }

    /**
     * ---------------------------------------------------------------
     * CONSTRUCTOR
     * ---------------------------------------------------------------
     */
    public Car(String model, String color, Integer horsePower) {
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
    }

    public Car() {
    }

    /**
     * ---------------------------------------------------------------
     * METHOD
     * ---------------------------------------------------------------
     */
    public void startCar() {
        System.out.println("Car started...");
    }

    public String stopCar() {
        return "Car stopped";
    }

}