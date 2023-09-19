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
        public int GetFuelConsumption() {
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

    public void Info() {
        System.out.println("Это " + colour + " автомобиль модели " + model + ". Его вместимость бензобака составляет " + maxFuel + " литров. На данный момент расход топлива " + engine.GetFuelConsumption() + " литров на 100 км, а в баке осталось " + fuel + " литров топлива.");
    }

    public void StartEngine() {
        engine.TurnOn();
        while (engine.isOn()) {
            int fuelConsumption = engine.GetFuelConsumption();
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

    public void GetDistance() {
        int spacing = mileage - distance;
        System.out.println("Автомобиль проехал " + mileage + " км. Из них с последнего запуска программы " + spacing + " км.");
    }
}