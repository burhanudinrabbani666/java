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

    // Instance initialization block
    {
        this.model = "Tesla";
        this.color = "Blue";
        this.horsePower = 1000;

        System.out.println("Car object is created");
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