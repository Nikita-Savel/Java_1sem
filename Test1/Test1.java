package Test1;


public class Test1 {
    public static void main(String[] args) {
        
        IntSequence firstSequence = IntSequence.of(1, 2, 3);
        IntSequence secondSequence = IntSequence.constant(1);
        System.out.println(firstSequence.next());
        System.out.println(firstSequence.next());
        System.out.println(firstSequence.next());
        System.out.println(firstSequence.next());
        System.out.println(secondSequence.next());
    }

    interface IntSequence {
        int next();

        static IntSequence of(int... values) {
            return new IntSequence() {
                int index = 0;
                @Override
                public int next() {
                    try {
                        return values[index++];
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("Ошибка: Выход за границы массива");
                        return 0;
                    }
                }
            };

        }

        static IntSequence constant(int value) {
            return new IntSequence() {
                @Override
                public int next() {
                    return value;
                }
            };
        }
    }
}
