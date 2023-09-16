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
        int arg1 = arg;
        int arg2 = arg;
        String str1 = "";
        while (arg != 0) {
            if (arg % 16 >= 10) {
                int m = 55 + arg % 16;
                char c = (char) m;
                str1 = str1 + c;
            } else {
                str1 = str1 + Integer.toString(arg1 % 16);
            }
            arg = (arg / 16);
        }
        str1 = str1 + " ";
        while (arg1 != 0) {
            str1 = str1 + Integer.toString(arg1 % 8);
            arg1 = (arg1 / 8);
        }
        str1 = str1 + " ";
        while (arg2 != 0) {
            str1 = str1 + arg2 % 2;
            arg2 = (arg2 / 2);
        }
        StringBuilder st = new StringBuilder(str1);
        st.reverse();
        System.out.println(st);
    }


    // task 2
    static int normalize(int angle) {
        int n = (angle % 360);
        if (n < 0) {
            n += 360;
        }        
        return n;
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
        if ((n == 1) || (n == 2)) {
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
            int firstsum = 0;
            int summaindiagonal = 0;
            int sumsidediagonal = 0;
            boolean status = true;
                for (int i = 0; i < len; i++) {
                    int currentlineamount = 0;
                    int currentrowamount = 0;
                    summaindiagonal += square[i][i];
                    sumsidediagonal += square[i][len - i - 1];
                    for (int j = 0; j < len; j++) {
                        if (i == 0) {
                            firstsum += square[i][j];
                        }
                        currentlineamount += square[i][j];
                        currentrowamount += square[j][i];
                    }
                    if ((currentlineamount != firstsum) || (currentrowamount != firstsum)) {
                        status = false;
                    }
                }
                if ((summaindiagonal != firstsum) || (sumsidediagonal != firstsum)) {
                    status = false;
                }
            return status;
        }
    }


    // task 9
    static int[] reverse(int[] arr) {
        int len = arr.length;
        int empty = 0;
        for (int i = 0; i < len / 2; i++) {
            empty = arr[i];
            arr[i] = arr[len - i - 1];
            arr[len - i - 1] = empty;
        }
        return arr;
    }


    // task 10
    static int[] sort(int[] arr) {
        int len = arr.length;
        int s = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    s = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = s;
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
        int[] newarr = new int[quantity];
        int current = 0;
        for (int i = 0; i < len; i++) {
            if (arr[i] != n) {
                newarr[current] = arr[i];
                current += 1;
            }
        }
        return newarr;
    }
}