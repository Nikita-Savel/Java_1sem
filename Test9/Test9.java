package Test9;
public class Test9 {
    public static void main(String[] args) {
        try {
            int[] m = new int[2];
            m[8] = 5;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Ошибка: Выход за границы массива!");
        }
    }
}
