package FirstException;
public class Test7 {
    public static void main(String[] args) {
        try {
            int a = 42 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: Нельзя делить на ноль!");
            int a = 0;
        }
    }
}
