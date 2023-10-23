package Test3;
public class Test3 {
    public static void main(String[] args) {
        lambda();
    }

    static void lambda() {
        Printable printable = () -> System.out.println("Hello, world!");
        printable.print();
    }

    @FunctionalInterface
    interface Printable {
        void print();
    }
}
