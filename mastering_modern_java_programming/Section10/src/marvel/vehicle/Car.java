package marvel.vehicle;

import marvel.base.Vehicle;

public class Car extends Vehicle {

    // field hiding
    public Integer horsePower;
    public String color;
    public Double turningRadius;
    public Boolean isMatic;

    public Car() {
        super("Water");
        System.out.println("Inside car deafult constructor");
        this.horsePower = 150;
        this.color = "black";
        this.turningRadius = 150.00;
        this.isMatic = true;

    }

    // method hidding
    public static void start() {
        System.out.println("Car starting....");
    }

    public void getCarDetail() {
        System.out.println(this.color);
        System.out.println(super.color);
    }

}
