package Test7;

import Test7.Car.Engine;

public class Test7 {
    public static void main(String[] args) {
        
        // Если я убираю static, то выдаёт ошибку "No enclosing instance of type Car is accessible. Must qualify the allocation with an enclosing instance of type Car (e.g. x.new A() where x is an instance of Car).Java(16777237)"
        // Подскажи, пожалуйста, как это исправить. Компилятор просит ставить и 10 строку, и 11 строку первой, поэтому непонятно, как действовать
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