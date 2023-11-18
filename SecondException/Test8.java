package SecondException;
public class Test8 {
    public static void main(String[] args) {
        try {
            String s = null;
            String m = s.toLowerCase();
        } catch (NullPointerException e) {
            System.out.println("Ошибка: Вы используете пустую строку!");
            String m = null;
        }
    }
}
