package set;

import java.util.HashSet;
import java.util.Set;

public class SetUtils {

    public static <E> Set<E> union(Set<? extends E> s1, Set<? extends E> s2) {
        HashSet<E> result = new HashSet<>(s1);
        result.addAll(s2);
        return result;
    }

    public static <E> Set<E> intersection(Set<? extends E> s1, Set<? extends E> s2) {
        HashSet<E> result = new HashSet<>(s1);
        result.retainAll(s2);
        return result;
    }

    public static <E> Set<E> difference(Set<? extends E> s1, Set<? extends E> s2) {
        HashSet<E> result = new HashSet<>(s1);
        result.removeAll(s2);
        return result;
    }

    public static <E> Set<E> symmetricDifference(Set<? extends E> s1, Set<? extends E> s2) {
        HashSet<E> union = (HashSet<E>) union(s1, s2);
        HashSet<E> intersection = (HashSet<E>) intersection(s1, s2);
        return difference(union, intersection);
    }
}
