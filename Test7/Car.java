package Test7;
public class Car {

  private final String colour;
  private final int fuel;
  private final int maxFuel;
  private final String model;
  private final Engine engine;
  private final int mileage;

  private Car(Builder builder) {
    this.colour = builder.colour;
    this.fuel = builder.fuel;
    this.maxFuel = builder.maxFuel;
    this.model = builder.model;
    this.engine = builder.engine;
    this.mileage = builder.mileage;
  }

  public String getColour() {
    return colour;
  }
  public int getFuel() {
    return fuel;
  }

  public int getMaxFuel() {
    return maxFuel;
  }

  public String getModel() {
    return model;
  }

  public Engine getEngine() {
    return engine;
  }

  public int getMileage() {
    return mileage;
  }

  public void info() {
    System.out.println("Colour: " + colour);
    System.out.println("Fuel: " + fuel);
    System.out.println("Max Fuel: " + maxFuel);
    System.out.println("Model: " + model);
    System.out.println("Engine: " + engine);
    System.out.println("Mileage: " + mileage);
  }

  public static class Builder {
    private String colour;
    private int fuel;
    private int maxFuel;
    private String model;
    private Engine engine;
    private int mileage;

    public Builder() {
      // set default values if needed
    }

    public Builder setColour(String colour) {
      this.colour = colour;
      return this;
    }

    public Builder setFuel(int fuel) {
      this.fuel = fuel;
      return this;
    }

    public Builder setMaxFuel(int maxFuel) {
      this.maxFuel = maxFuel;
      return this;
    }

    public Builder setModel(String model) {
      this.model = model;
      return this;
    }

    public Builder setEngine(Engine engine) {
      this.engine = engine;
      return this;
    }

    public Builder setMileage(int mileage) {
      this.mileage = mileage;
      return this;
    }

    public Car build() {
      return new Car(this);
    }
  }

}

class Engine {
  private int fuelConsumption;

  public void setFuelConsumption(int fuelConsumption) {
    this.fuelConsumption = fuelConsumption;
  }

  public int getFuelConsumption() {
    return fuelConsumption;
  }

  @Override
  public String toString() {
    return "Fuel Consumption: " + fuelConsumption;
  }
}