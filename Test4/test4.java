package Test4;
public class test4 {
    public static void main(String[] args) {
        Car myCar = new Car("Зелёный", 26, 60, "Mercedes", 7, 12);
        myCar.Refill(11);
        myCar.GetDistance();
        myCar.Info();
        myCar.StartEngine();
        myCar.GetDistance();


    }
}
