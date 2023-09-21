package Test7;

public class test7 {

  public static void main(String[] args) {
    Car myCar = new Car.Builder(96, "Audi")
        .colour("Black")
        .fuel(8)
        .mileage(14)
        .build();
    System.out.println(myCar);
  }
}