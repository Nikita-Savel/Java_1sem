package Test7;
public class Car {
    private String colour;
    private static int fuel;
    private final int maxFuel;
    private final String model;
    private final Engine engine;
    private static int mileage;
    private static int distance;

    private Car(Builder builder) {
        this.colour = builder.colour;
        this.fuel = builder.fuel;
        this.maxFuel = builder.maxFuel;
        this.model = builder.model;
        this.engine = builder.engine;
        this.mileage = builder.mileage;
        this.distance = builder.mileage;
    }

    public void refill() {
        fuel = maxFuel;
        System.out.println("Заправлен полный бак.");
    }

    public void refill(int liter) {
        if (fuel + liter > maxFuel) {
            fuel = maxFuel;
            System.out.println("Вы залили слишком много топлива. Заправлен полный бак.");
        } else {
            fuel += liter;
            System.out.println("Заправлено " + liter + " литров топлива.");
        }
    }

    public void info() {
        int spacing = mileage - distance;
        System.out.println("Цвет: " + colour);
        System.out.println("Осталось топлива: " + fuel + " литров");
        System.out.println("Вместимость бензобака: " + maxFuel + " литров");
        System.out.println("Модель: " + model);
        System.out.println("Расход топлива: " + engine.getFuelConsumption()+ " литров на 100 км");
        System.out.println("Автомобиль проехал " + mileage + " км. Из них с последнего запуска программы " + spacing + " км.");
    }

    public void getDistance() {
        int spacing = mileage - distance;
        System.out.println("Автомобиль проехал " + mileage + " км. Из них с последнего запуска программы " + spacing + " км.");
    }


    public static class Builder {
        private String colour;
        private int fuel;
        private final int maxFuel;
        private final String model;
        private final Engine engine;
        private int mileage;

        public Builder(String model, int maxFuel, Engine engine) {
            this.model = model;
            this.maxFuel = maxFuel;
            this.engine = engine;
        }

        public Builder setColour(String colour) {
            this.colour = colour;
            return this;
        }

        public Builder setFuel(int fuel) {
            this.fuel = fuel;
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


    public static class Engine {
        
        private int fuelConsumption;
        private boolean on;

        public Engine(int fuelConsumption) {
            this.on = false;
            this.fuelConsumption = fuelConsumption;

        }
        public void turnOn() {
            on = true;
            System.out.println("Двигатель запущен.");
        }
        public void turnOff() {
            on = false;
            System.out.println("Двигатель остановлен.");
        }
        public void turnOffWithoutPrint() {
            on = false;
        }
        public int getFuelConsumption() {
            return fuelConsumption;
        }
        public boolean isOn() {
            return on;
        }
    }

    
    public void startEngine() {
        engine.turnOn();
        while (engine.isOn()) {
            int fuelConsumption = engine.getFuelConsumption();
            if (fuel >= fuelConsumption) {
                mileage += 100;
                fuel -= fuelConsumption;
            } else {
                mileage += fuel * 100 / fuelConsumption;
                fuel = 0;
                engine.turnOffWithoutPrint();
                System.out.println("Требуется дозаправка. Двигатель остановлен.");
            }
        }
    }
    public void stopEngine() {
        engine.turnOff();
    }
}