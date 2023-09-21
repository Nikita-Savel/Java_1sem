package Test8;
final class Ball extends Shape {
  private double radius;
    
  public Ball (double radius) {
    super(4.0 / 3.0 * Math.PI * Math.pow(radius, 3));
    this.radius = radius;
  }

  @Override
  public void print() {
    System.out.println("Это шар");
    System.out.println("Его радиус равен: " + radius);
    System.out.println("Его площадь поверхности равна: " + 4.0 * Math.PI * Math.pow(radius, 2));
    System.out.println("Его объём равен: " + getVolume());
  }
}