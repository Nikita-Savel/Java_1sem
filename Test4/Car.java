package Test4;
public class Car {

    private String colour;
    private int fuel;
    private final int maxFuel;
    private final String model;
    private final Engine engine;
    private int mileage;
    private int distance;
    

    private class Engine {
        private boolean on;
        private int fuelConsumption;
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


    public Car(String colour, int fuel, int maxFuel, String model, int fuelConsumption, int mileage) {
        this.colour = colour;
        this.fuel = fuel;
        this.maxFuel = maxFuel;
        this.model = model;
        this.engine =  new Engine(fuelConsumption);
        this.mileage = mileage;
        this.distance = mileage;
        
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

    public void getDistance() {
        int spacing = mileage - distance;
        System.out.println("Автомобиль проехал " + mileage + " км. Из них с последнего запуска программы " + spacing + " км.");
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

    public void startEngine() {
        engine.turnOn();
        while (engine.isOn()) {
            int fuelConsumption = engine.getFuelConsumption();
            if (fuel >= fuelConsumption) {
                mileage += 100;
                fuel -= fuelConsumption;
            } else {
                mileage += (fuel % fuelConsumption) * 100 / 7;
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