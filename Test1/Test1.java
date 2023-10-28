package Test1;
public class Test1 {
    public static void main(String[] args) {
        Matrix<Integer> myMatrix = new GenMatrix<>(2, 3);
        myMatrix.set(0, 1, 23);
        myMatrix.set(1, 1, 21);
        myMatrix.set(1, 2, 4);
        myMatrix.pop(1, 2);
        System.out.println(myMatrix.get(1, 1));
        System.out.println(myMatrix.getLine());
        System.out.println(myMatrix.getColumn());

        Matrix<Integer> myMatrix1 = new GenMatrix<>(myMatrix);
        for (int i = 0; i < myMatrix1.getLine(); i++) {
            for (int j = 0; j < myMatrix1.getColumn(); j++) {
                System.out.print(myMatrix1.get(i, j) + " ");
            }
            System.out.println();
        }
    }
}