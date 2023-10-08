package Test3;
public class Test3 {
    public static void main(String[] args) {
        lambda();
    }

    public static void lambda() {
        Printable Printable = () -> {
            System.out.println("Hello, world!");
        };
        Printable.print();
    }

    @FunctionalInterface
    interface Printable {
        void print();
    }
}
