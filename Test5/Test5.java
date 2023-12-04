package Test5;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Test5 {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Maria");
        names.add("Alexei");
        names.add("Ivan");
        List<Integer> lengthOfNames = map(names, x -> x.length());
        int n = lengthOfNames.size();
        for (int i = 0; i < n; i++) {
            System.out.print(lengthOfNames.remove(0) + " ");            
        }
    }

    static <R, T> List<R> map(List<T> list, Function<? super T, ? extends R> mapper) { 
        ArrayList<R> result = new ArrayList<>(); 
        for (T item : list) { 
            result.add(mapper.apply(item)); 
        } 
        return result; 
    }
}