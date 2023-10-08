package Test4;

public class Test4 {
    public static void main(String[] args) throws Exception {
        MyInterface MyInterface = (n) -> {
            if (n > 0) {
                return "Положительное число";
            } else if (n < 0) {
                return "Отрицательное число";
            } else {
                return "Ноль";
            }
        };
        System.out.println(MyInterface.numberSign(45));
    }

    @FunctionalInterface
    interface MyInterface {
        String numberSign(int n);
    }
}
