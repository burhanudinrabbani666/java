package marvel.app;

import marvel.base.Vehicle;
import marvel.vehicle.Car;

public class TestMethodHiding {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Car car = new Car();

        System.out.println(vehicle.color);
        System.out.println(car.color);
        car.getCarDetail();

    }

}
