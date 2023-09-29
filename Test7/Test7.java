package Test7;

import Test7.Car.Engine;

public class Test7 {
    public static void main(String[] args) {
        Engine engine = new Engine(5);
        Car myCar = new Car.Builder("Audi", 79, engine)
            .setColour("Grey")
            .setFuel(50)
            .setMileage(2636)
            .build();

        myCar.refill(17);
        myCar.getDistance();
        myCar.info();
        myCar.startEngine();
        myCar.getDistance();
    }
}
