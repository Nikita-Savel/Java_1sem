package homework_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Test2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        substring(string);
    }

    public static void substring(String num) {
        Function<String, String> strFunction = bind((a, b) -> b.substring(0, a), 5);
        System.out.println("substring: " + strFunction.apply(num));
    }

    static <A, B, C> Function<B, C> bind(BiFunction<A, B, C> fn, A a) {
        return b -> fn.apply(a, b);
    }
}
