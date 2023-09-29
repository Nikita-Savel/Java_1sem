package Test3;
public final class Point {
    private final double x;
    private final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public Point() {
        this.x = 0;
        this.y = 0;
    }
    
    public double getX() {
        return x;
    }
        
    public double getY() {
        return y;
    }
            
    public Point translate(double x0, double y0) {
        return new Point(x + x0, y + y0);
    }
    
    public Point scale(double scale) {
        return new Point(x * scale, y * scale);
    }

    @Override
    public String toString() {
        return "Point {" +
            "x = " + x +
            ", y = " + y +
            '}';
    }

}

