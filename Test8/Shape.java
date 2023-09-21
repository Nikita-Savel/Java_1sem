package Test8;
public class Shape {

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
