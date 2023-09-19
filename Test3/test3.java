package Test3;
public class test3 {
    public static void main(String[] args) {
        Point myPoint = new Point(2, 4);

        System.out.println(myPoint.GetX());
        System.out.println(myPoint.GetY());

        System.out.println(myPoint.Translate(3.2, 5.7));
        System.out.println(myPoint.Scale(3.4));
    }
    
}
