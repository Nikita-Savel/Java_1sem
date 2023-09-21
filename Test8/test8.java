package Test8;
public class test8 {
    public static void main(String[] args) {
        Shape myShape = new Shape(12.399);
        myShape.print();
        System.out.println();
        Ball myBall = new Ball(3.56);
        myBall.print();
        System.out.println();
        Cylinder myCylinder = new Cylinder(21.12, 6.5);
        myCylinder.print();
        System.out.println();
        Pyramid myPyramid = new Pyramid(1.1, 0.99);
        myPyramid.print();
        System.out.println();
        ColourPyramid myColourPyramid = new ColourPyramid(18.99, 0.22, "Grey");
        myColourPyramid.print();

        /*ColourPyramid myColourPyramid = new ColourPyramid("жёлтый");
        myColourPyramid.print();*/
    }
}
