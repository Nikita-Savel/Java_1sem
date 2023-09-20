package Test8;
class Ball extends Shape {
    private double radius;
    
    public Ball(double radius) {
      super();
      this.radius = radius;
    }
    double volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);

    @Override 
    void print() {
      System.out.println("Это шар. Его объём равен " + volume + ". Его радиус равен " + radius + " .");
    }
}