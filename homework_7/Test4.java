package homework_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Test4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] list = reader.readLine().split(" ");
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < list.length; i++) {
            numbers.add(Integer.parseInt(list[i]));
        }
        
        Predicate<Integer> predicate = n -> (n % 2023) == 1;
        Function<Integer, String> mapper = n -> "Number: " + n;
        BinaryOperator<String> operator = (firstString, secondString) -> firstString + ", " + secondString;
        Optional<String> result = processElements(numbers, predicate, mapper, operator);
        System.out.println(result.orElse("No numbers found"));
    }

    public static <T, R> Optional<R> processElements(List<T> elements, Predicate<T> predicate, Function<T, R> mapper, BinaryOperator<R> operator) {
        return elements.stream()
                .filter(predicate)
                .map(mapper)
                .reduce(operator);
    }
}