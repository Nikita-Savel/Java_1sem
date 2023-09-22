package Test2;
import java.util.Objects;
public class IntHolder {
    private int value;

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

    public IntHolder summation(IntHolder other) {
        return new IntHolder(value + other.value);
    }

    public IntHolder difference(IntHolder other) {
        return new IntHolder(value - other.value);
    }

    public IntHolder composition(IntHolder other) {
        return new IntHolder(value * other.value);
    }

    public IntHolder integerDivision(IntHolder other) {
        return new IntHolder(value / other.value);
    }

    public IntHolder divisionWithRemainder(IntHolder other) {
        return new IntHolder(value % other.value);
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
