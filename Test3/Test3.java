package Test3;
public class Test3 {
    public static void main(String[] args) {
        Point myPoint = new Point(2, 4);

        System.out.println(myPoint.getX());
        System.out.println(myPoint.getY());

        System.out.println(myPoint.translate(3.2, 5.7));
        System.out.println(myPoint.scale(3.4));
    }
    
}
