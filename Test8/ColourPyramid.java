package Test8;
final class ColourPyramid extends Pyramid {
    private String colour;


    public ColourPyramid(double height, double area, String colour) {
        super(height, area);
        this.colour = colour;
    }

    @Override 
    public void print() {
      System.out.println("Это пирамида");
      System.out.println("Её цвет" + colour);
      System.out.println("Её высота равна: " + getHeight());
      System.out.println("Её площадь основания равна: " + getArea());
      System.out.println("Её объём равен: " + getVolume());
    }
}