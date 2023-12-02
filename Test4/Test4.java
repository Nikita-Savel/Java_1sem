package Test4;
public class Test4 {
    public static void main(String[] args) {
        Car myCar = new Car("Зелёный", 26, 60, "Mercedes", 7, 12);
        myCar.refill(11);
        myCar.getDistance();
        myCar.info();
        myCar.startEngine();
        myCar.getDistance();


    }
}
