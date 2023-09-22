package Test7;

import Test7.Car.Engine;

public class test7 {
    public static void main(String[] args) {
        Engine engine = new Engine(5);
        Car myCar = new Car.Builder("Audi", 79, engine)
            .SetColour("Grey")
            .SetFuel(50)
            .SetMileage(2636)
            .Build();

        myCar.Refill(17);
        myCar.GetDistance();
        myCar.Info();
        myCar.StartEngine();
        myCar.GetDistance();
    }
}
