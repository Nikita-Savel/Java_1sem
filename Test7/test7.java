package Test7;

public class test7 {
  public static void main(String[] args) {
    Engine engine = new Engine();
    engine.setFuelConsumption(10);

    Car car = new Car.Builder()
      .setColour("Red")
        .setFuel(50)
        .setMaxFuel(92)
        .setModel("Audi")
        .setEngine(engine)
        .setMileage(10000)
        .build();

    car.info();
  }
}