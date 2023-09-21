package Test8;
final class Cylinder extends Shape {
    private double height;

    public Cylinder(double volume, double height) {
        super(volume);
        this.height = height;
    }

    @Override 
    public void print() {
        System.out.println("Это цилиндр");
        System.out.println("Его радиус равен: " + Math.pow(getVolume() / Math.PI / height, 0.5));
        System.out.println("Его высота равна: " + height);
        System.out.println("Его площадь основания равна: " + getVolume() / height);
        System.out.println("Его площадь боковой поверхности равна: " + 2 * getVolume() / (Math.pow(getVolume() / Math.PI / height, 0.5)));
        System.out.println("Его объём равен: " + getVolume());
    }

}