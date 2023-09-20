package Test8;
class Pyramid extends Shape {
    private double height;
    private double area;
    
    public Pyramid(double height, double area) {
        super();
        this.height = height;
        this.area = area;
    }
    double volume = height * area / 3;

    @Override 
    void print() {
      System.out.println("Это пирамида. Её объём равен " + volume + ". Её  высота равна " + height + ", а площадь основания " + area + " .");
    }
}
