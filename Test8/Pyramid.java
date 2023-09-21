package Test8;
class Pyramid extends Shape {
    private double height;
    private double area;
    
    public Pyramid(double height, double area) {
      super(height * area / 3.0);
      this.height = height;
      this.area = area;
    }

    public double getHeight() {
      return height;
    }

    public double getArea() {
      return area;
    }

    @Override 
    public void print() {
      System.out.println("Это пирамида");
      System.out.println("Её высота равна: " + height);
      System.out.println("Её площадь основания равна: " + area);
      System.out.println("Её объём равен: " + getVolume());
    }
}
