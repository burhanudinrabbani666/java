package marvel.base;

public class Vehicle {

    public Engine engine;
    public Integer horsePower;
    public String color;
    public Double turningRadius;
    public String madeFor;

    // constructor
    public Vehicle(String madeFor) {

        System.out.println("Inside vehicle deafult constructor");
        this.horsePower = 120;
        this.color = "white";
        this.turningRadius = 123.00;
        this.madeFor = madeFor;

    }

    public static void start() {
        System.out.println("Vehicle starting");
    }

}
