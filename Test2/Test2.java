package Test2;

public class Test2 {
    public static void main(String[] args) {
        Tuple<Integer> myTuple = new Tuple<>(5);
        System.out.println(myTuple.isEmpty());
        myTuple.add(23);
        myTuple.add(34);
        myTuple.add(123);
        myTuple.add(11);
        myTuple.add(9);

        Tuple<Integer> forRemote = new Tuple<>(1);
        forRemote.add(23);


        System.out.println(myTuple.get(2));
        myTuple.remove(3);
        myTuple.remove(10); // Выкинет исключение
        myTuple.remove(forRemote.get(0));
        
        myTuple.add(445);
        myTuple.add(22, 8); // Выкинет исключение
        System.out.println("---------------");
        for (int i = 0; i < myTuple.getLen(); i++) {
            System.out.print(myTuple.get(i) + " ");
        }
        System.out.println("---------------");
        System.out.println(myTuple.isEmpty());

        Tuple<Integer> defaultValue = new Tuple<>(1);
        defaultValue.add(null);
        System.out.println(myTuple.orElse(3, defaultValue.get(0)));
        System.out.println(myTuple.orElse(9, defaultValue.get(0))); // Выкинет исключение

        myTuple.add(15);
        myTuple.add(64);
        myTuple.add(73);
        myTuple.add(27); // Выкинет исключение
    }
}
