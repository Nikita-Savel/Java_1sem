package Test7;
public class test7 {
    public static void main(String[] args) {
        Car myCar = new Car("Зелёный", 26, 60, "Mercedes", 7, 12);
        myCar.Refill(11);
        myCar.Info();
        myCar.GetDistance();
        myCar.StartEngine();
        myCar.GetDistance();


    }
}
