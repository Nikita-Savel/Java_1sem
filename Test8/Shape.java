package Test8;
public sealed class Shape permits Ball, Cylinder, Pyramid {

    private double volume;

    public Shape (double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void print() {
        System.out.println("Это фигура");
        System.out.println("Её объём равен: " + volume);
    }
}
