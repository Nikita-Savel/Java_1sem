public class Test4 {
    public static void main(String[] args) {
        Integer[] firstArr = {1, 4, 32, 45, 213};
        String[] secondArr = {"son", "mum", "dad"};
        Pair<Integer> firstAnswerPair = minMax(firstArr);
        Pair<String> secondAnswerPair = minMax(secondArr);
        System.out.println(firstAnswerPair.getLeft());
        System.out.println(firstAnswerPair.getRight());
        System.out.println(secondAnswerPair.getLeft());
        System.out.println(secondAnswerPair.getRight());
    }

    public static <T extends Comparable<T>> Pair<T> minMax(T[] arr) {
        if (arr.length == 0) {
            return null;
        } else {
            T left = arr[0];
            T right = arr[0];
            for (T element : arr) {
                if (element.compareTo(left) < 0) {
                    left = element;
                }
                if (element.compareTo(right) > 0) {
                    right = element;
                }
            }
            return new Pair<>(left, right);
        }
    }
}