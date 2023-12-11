package homework_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Test1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String num = reader.readLine();
        multiply(Integer.parseInt(num));
    }

    public static void multiply(int num) {
        Function<Integer, Integer> mulFunction = bind((a, b) -> a * b, 2);
        System.out.println("MultiplyBy2: " + mulFunction.apply(num));
    }

    static <A, B, C> Function<B, C> bind(BiFunction<A, B, C> fn, A a) {
        return b -> fn.apply(a, b);
    }
}
