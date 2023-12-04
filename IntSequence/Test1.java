package IntSequence;


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
                    return values[index++];
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