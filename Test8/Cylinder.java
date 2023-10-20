package Test8;
non-sealed class Cylinder extends Shape {
    private double height;
    private double radius;

    public Cylinder(double height, double radius) {
        super(height * Math.PI * Math.pow(radius, 2));
        this.height = height;
        this.radius = radius;
    }
    
    public double getRadius() {
        return radius;
    }

    @Override 
    public void print() {
        System.out.println("Это цилиндр");
        System.out.println("Его радиус равен: " + radius);
        System.out.println("Его высота равна: " + height);
        System.out.println("Его площадь основания равна: " + Math.PI * Math.pow(radius, 2));
        System.out.println("Его площадь боковой поверхности равна: " + 2 * Math.PI * radius * height);
        System.out.println("Его объём равен: " + height * Math.PI * Math.pow(radius, 2));
    }

}