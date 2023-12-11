package homework_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Test3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String greeting = reader.readLine();
        String name = reader.readLine();
        Function<String, Function<String, String>> sayHello = saySmth(name);
        System.out.println(sayHello.apply(greeting).apply(name));
    }

    public static Function<String, Function<String, String>> saySmth(String word) {
        Function<String, Function<String, String>> say = curry((a, b) -> a + ", " + b + "!");
        return say;
    }

    static <A, B, C> Function<A, Function<B, C>> curry(BiFunction<A, B, C> fn) {
        return a -> b -> fn.apply(a, b);
    }
}
