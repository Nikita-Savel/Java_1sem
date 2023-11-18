package Lambda;

public class Test4 {
    public static void main(String[] args) throws Exception {
        lambda();
    }

    static void lambda() {
        MyInterface MyInterface = (n) -> {
            if (n > 0) {
                System.out.println("Положительное число");
            } else if (n < 0) {
                System.out.println("Отрицательное число");
            } else {
                System.out.println("Ноль");
            }
        };
        MyInterface.numberSign(45);
        
    }

    @FunctionalInterface
    interface MyInterface {
        void numberSign(int n);
    }
}
