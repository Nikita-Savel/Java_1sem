public class test5 {
    public static void main(String[] args) {
        
        Cat myCat = new Cat("Murca", 9, 3, "Tom", "Abyssinian cat", TypeOfFeed.CHEAP);
        myCat.sayHello();
        myCat.walk();
        myCat.walk("Vitaly");

        Dog myDog = new Dog("Ben", 45, 11, "Mike", "Alabai", TypeOfFeed.EXPENSIVE);
        myDog.sayHello();
        myDog.walk();
        myDog.walk("Rebecca");

        Parrot myParrot = new Parrot("Robert", 1, 7, "Igor", "Zimbabwe", true);
        myParrot.sayHello();
        myParrot.fly();

        System.out.println();

        Pet[] animals = {myCat, myDog, myParrot};

        for (int i = 0; i < 3; i ++) {
            animals[i].sayHello();
        }
    }

}