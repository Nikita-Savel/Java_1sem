package Test8;
public class test8 {
    public static void main(String[] args) {
        Shape myShape = new Shape();
        myShape.print();

        Ball myBall = new Ball(4);
        myBall.print();

        Cylinder myCylinder = new Cylinder(7.1, 5.8);
        myCylinder.print();

        Pyramid myPyramid = new Pyramid(1.1, 0.99);
        myPyramid.print();

        ColourPyramid myColourPyramid = new ColourPyramid("жёлтый");
        myColourPyramid.print();
    }
}
