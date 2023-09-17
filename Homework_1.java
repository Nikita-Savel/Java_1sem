import java.math.BigInteger;
import java.util.Arrays;

public class Homework_1 {

    public static void main(String[] args) {
        // тут можете тестировать ваш код

        convert(10);
        System.out.println(normalize(721));
        System.out.println(max(10, 12, -14));
        System.out.println(fact(12));
        System.out.println(fact(BigInteger.valueOf(30)));
        multiplTable();
        System.out.println(average(1, 2, 3, 4, 5, 6, 7));
        System.out.println(isMagicSquare(new int[][]{{16, 3, 2, 13}, {5, 10, 11, 8}, {9, 6, 7, 12}, {4, 15, 14, 1}}));
        System.out.println(Arrays.toString(reverse(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(sort(new int[]{2, 1, 45, 34, 12, 2})));
        System.out.println(Arrays.toString(removeExtra(new int[]{2, 1, 45, 2, 34, 1, 12, 2}, 2)));
    }

    // task 1
    static void convert(int arg) {
        int firstArg = arg;
        int secondArg = arg;
        String firstString = "";
        while (arg != 0) {
            if (arg % 16 >= 10) {
                int index = 55 + arg % 16;
                char letter = (char) index;
                firstString += letter;
            } else {
                firstString += firstArg % 16;
            }
            arg /= 16;
        }
        firstString += " ";
        while (firstArg != 0) {
            firstString += firstArg % 8;
            firstArg /= 8;
        }
        firstString += " ";
        while (secondArg != 0) {
            firstString += secondArg % 2;
            secondArg /= 2;
        }
        StringBuilder st = new StringBuilder(firstString);
        System.out.println(st.reverse());
    }


    // task 2
    static int normalize(int angle) {
        int module = (angle % 360);
        if (module < 0) {
            module += 360;
        }        
        return module;
    }


    // task 3
    static int max(int x, int y, int z) {
        if ((x > y) && (x > z)) {
            return x;
        } else if ((y > x) && (y > z)) {
            return y;
        } else {
            return z;
        }
    }


    // task 4
    static int fact(int n) {
        if ((n == 0) || (n == 1)) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }

    // task 5
    static BigInteger fact(BigInteger n) {
        if (BigInteger.ONE.compareTo(n) == 0 || BigInteger.ZERO.compareTo(n) == 0) {
            return BigInteger.ONE;
        } else {
            return n.multiply(fact(n.subtract(BigInteger.ONE)));
        }
    }

    // task 6
    static void multiplTable() {
        System.out.print("   ");
        for (int i = 1; i < 9; i++) {
            System.out.print(i);
            System.out.print("  ");
        }
        System.out.println(9);
        for (int i = 1; i < 10; i++) {
            System.out.print(i);
            System.out.print("  ");
            for (int j = 1; j < 9; j++) {
                System.out.print(j * i);
                if (i * j <= 9) {
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.println(9 * i);
        }
    }


    // task 7
    static double average(int... nums) {
        int len = nums.length;
        if (len == 0) {
            return 0;
        } else {
            double summ = 0;
            for (int i = 0; i < len; i++) {
                summ += nums[i];
            }
            return summ / len;
        }
    }


    // task 8
    static boolean isMagicSquare(int[][] square) {
        int len = square.length;
        if (len == 0) {
            return true;
        } else if (square.length != square[0].length) {
            return false;
        } else {
            int firstSum = 0;
            int sumMainDiagonal = 0;
            int sumSideDiagonal = 0;
            boolean status = true;
                for (int i = 0; i < len; i++) {
                    int currentLineAmount = 0;
                    int currentRowAmount = 0;
                    sumMainDiagonal += square[i][i];
                    sumSideDiagonal += square[i][len - i - 1];
                    for (int j = 0; j < len; j++) {
                        if (i == 0) {
                            firstSum += square[i][j];
                        }
                        currentLineAmount += square[i][j];
                        currentRowAmount += square[j][i];
                    }
                    if ((currentLineAmount != firstSum) || (currentRowAmount != firstSum)) {
                        status = false;
                    }
                }
                if ((sumMainDiagonal != firstSum) || (sumSideDiagonal != firstSum)) {
                    status = false;
                }
            return status;
        }
    }


    // task 9
    static int[] reverse(int[] arr) {
        int len = arr.length;
        int tmp = 0;
        for (int i = 0; i < len / 2; i++) {
            tmp = arr[i];
            arr[i] = arr[len - i - 1];
            arr[len - i - 1] = tmp;
        }
        return arr;
    }


    // task 10
    static int[] sort(int[] arr) {
        int len = arr.length;
        int tmp = 0;
        for (int i = len - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        return arr;
    }


    // task 11
    static int[] removeExtra(int[] arr, int n) {
        int len = arr.length;
        int quantity = 0;
        for (int i = 0; i < len; i++) {
            if (arr[i] != n) {
                quantity += 1;
            }
        }
        int[] newArr = new int[quantity];
        int current = 0;
        for (int i = 0; i < len; i++) {
            if (arr[i] != n) {
                newArr[current] = arr[i];
                current += 1;
            }
        }
        return newArr;
    }
}