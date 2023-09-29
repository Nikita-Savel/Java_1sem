public class Test5 {
    public static void main(String[] args) {
        
        Cat myCat = new Cat("Murca", 9, 3, "Tom", "Abyssinian cat", TypeOfFeed.CHEAP);
        System.out.println(myCat.say());
        System.out.println(myCat.walk());
        System.out.println(myCat.walk("Vitaly"));

        Dog myDog = new Dog("Ben", 45, 11, "Mike", "Alabai", TypeOfFeed.EXPENSIVE);
        System.out.println(myDog.say());
        System.out.println(myDog.walk());
        System.out.println(myDog.walk("Rebecca"));

        Parrot myParrot = new Parrot("Robert", 1, 7, "Igor", "Zimbabwe", true);
        System.out.println(myParrot.say());
        System.out.println(myParrot.fly());
        System.out.println();


        Pet[] animals = {myCat, myDog, myParrot};

        for (int i = 0; i < 3; i++) {
            if (animals[i].say() instanceof String realString) {
                System.out.println(animals[i].say());
            }

        }
    }
}