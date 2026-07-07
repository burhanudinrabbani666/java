package marvel.app;

import marvel.base.Vehicle;
import marvel.vehicle.Car;

public class TestMethodHiding {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Car car = new Car();

        Vehicle.start();
        vehicle.start(); // vehicle starting

        Car.start();
        car.start(); // car starting

        ((Vehicle) car).start(); // car starting

        vehicle = car;
        vehicle.start();

    }

}
