package Test7;

public class Car {

    private final String colour;
    private final int fuel;
    private final int maxFuel;
    private final String model;
    private final int mileage;

  public static class Builder {

    private String colour;
    private int fuel;
    private final int maxFuel;
    private final String model;
    private int mileage;

    public Builder(int maxFuel, String model) {
      this.maxFuel = maxFuel;
      this.model = model;
    }

    public Builder colour(String col) {
      colour = col;
      return this;
    }

    public Builder fuel(int val) {
      fuel = val;
      return this;
    }

    public Builder mileage(int val) {
      mileage = val;
      return this;
    }

    public Car build() {
      return new Car(this);
    }
  }

  private Car (Builder builder) {
    this.maxFuel = builder.maxFuel;
    this.model = builder.model;
    this.colour = builder.colour;
    this.fuel = builder.fuel;
    this.mileage = builder.mileage;
  }

  @Override
  public String toString() {
    return "Car {" +
        "maxFuel = " + maxFuel +
        ", model = " + model +
        ", colour = " + colour +
        ", fuel = " + fuel +
        ", mileage = " + mileage +
        '}';
  }
}