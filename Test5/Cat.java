

public class Cat extends Pet {

    private final String breed;
    private TypeOfFeed TypeOfFeed;

    public Cat(String name, int weight, int age, String owner, String breed, TypeOfFeed typeOfFeed) {
        super(name, weight, age, owner);
        this.breed = breed;
        this.TypeOfFeed = typeOfFeed;
    }

    public void walk() {
        System.out.println("The cat is walking with owner now");
    }
    
    public void walk(String name) {
        System.out.println("The cat is walking with " + name + " now");
    }

    @Override
    public void sayHello() {
        System.out.println("Hello, I am cat " + getName() + "!");
    }

    
}