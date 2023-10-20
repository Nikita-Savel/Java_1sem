package Test2;
import java.util.Objects;
public class IntHolder {

    private int value;

    public static IntHolder of(int value) {
        return new IntHolder(value);
    }

    public IntHolder(int value) {
            this.value = value;
    }
    

    public int getValue() {
        return value;
    }

    public static void swap(IntHolder firstNum, IntHolder secondNum) {
        int tmp = secondNum.value;
        secondNum.value = firstNum.value;
        firstNum.value = tmp;
    }

    public static void sum(IntHolder argument, IntHolder other) {
        argument.value += other.value;
    }

    public static void dif(IntHolder argument, IntHolder other) {
        argument.value -= other.value;
    }

    public static void multiply(IntHolder argument, IntHolder other) {
        argument.value *= other.value;
    }

    public static void div(IntHolder argument, IntHolder other) {
        argument.value += other.value;
    }

    public static void mod(IntHolder argument, IntHolder other) {
        argument.value += other.value;
    }


    @Override
    public boolean equals(Object number) {
        if (this == number) {
            return true;
        }
        if (number == null || getClass() != number.getClass()) {
            return false;
        }
        IntHolder myIntHolder = (IntHolder) number;
        return value == myIntHolder.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
