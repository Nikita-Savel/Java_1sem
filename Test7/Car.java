package Test7;
public class Car {


    private String colour;
    private int fuel;
    private final int maxFuel;
    private final String model;
    private final Engine engine;
    private int mileage;

    public Car(Builder builder) {
        this.colour = builder.colour;
        this.fuel = builder.fuel;
        this.maxFuel = builder.maxFuel;
        this.model = builder.model;
        this.engine = builder.engine;
        this.mileage = builder.mileage;
    }

    public static class Builder {
        private String colour;
        private int fuel;
        private int maxFuel;
        private String model;
        private Engine engine;
        private int mileage;
        public Builder colour(String val) {
        colour = val;
        return this;
    }
    public Builder fuel(int setfuel) {
        fuel = setfuel;
        return this;
    }
    public Builder maxFuel(int setmaxFuel) {
        maxFuel = setmaxFuel;
        return this;
    }
    public Builder model(String setmodel) {
        model = setmodel;
        return this;
    }
    public Builder engine(Engine setengine) {
        engine = setengine;
        return this;
    }
    public Builder mileage(int setmileage) {
        mileage = setmileage;
        return this;
    }
    public Car build() {
        return new Car(this);
    }
  }


    private class Engine {
        private boolean on;
        private int fuelConsumption;
        public Engine(int fuelConsumption) {
            this.on = false;
            this.fuelConsumption = fuelConsumption;
        }
        public void TurnOn() {
            on = true;
            System.out.println("Двигатель запущен.");
        }
        public void TurnOff() {
            on = false;
            System.out.println("Двигатель остановлен.");
        }
        public void TurnOffWithoutPrint() {
            on = false;
        }
        public int getFuelConsumption() {
            return fuelConsumption;
        }
        public boolean isOn() {
            return on;
        }
    }


    public void info() {
        System.out.println("Colour: " + colour);
        System.out.println("Fuel: " + fuel);
        System.out.println("Max Fuel: " + maxFuel);
        System.out.println("Model: " + model);
        System.out.println("Engine: " + engine);
        System.out.println("Mileage: " + mileage);
    }
    public void Refill() {
        fuel = maxFuel;
        System.out.println("Заправлен полный бак.");
    }
    public void Refill(int liter) {
        if (fuel + liter > maxFuel) {
        fuel = maxFuel;
        System.out.println("Вы залили слишком много топлива. Заправлен полный бак.");
        } else {
        fuel += liter;
        System.out.println("Заправлено " + liter + " литров топлива.");
        }
    }
    public void StartEngine() {
        engine.TurnOn();
        while (engine.isOn()) {
        int fuelConsumption = engine.getFuelConsumption();
            if (fuel >= fuelConsumption) {
                mileage += 100;
                fuel -= fuelConsumption;
            } else {
                mileage += (fuel % fuelConsumption) * 100 / 7;
                fuel = 0;
                engine.TurnOffWithoutPrint();
                System.out.println("Требуется дозаправка. Двигатель остановлен.");
            }
        }
    }
    public void StopEngine() {
        engine.TurnOff();
    }
}
