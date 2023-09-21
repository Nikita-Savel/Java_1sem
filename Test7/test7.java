package Test7;

public class test7 {
    public static void main(String[] args) {
    Engine myEngine = new Engine(10);

    Car myCar = new Car.Builder()
      .colour("Red")
      .fuel(50)
      .maxFuel(92)
      .model("Audi")
      .engine(myEngine)
      .mileage(10000)
      .build();

    myCar.Refill(19);
    myCar.info();
    myCar.StartEngine();
  }
}
