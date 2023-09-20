

public class Cat extends Pet {

    private final String breed;
    private TypeOfFeed TypeOfFeed;

    public Cat(String name, int weight, int age, String owner, String breed, TypeOfFeed typeOfFeed) {
        super(name, weight, age, owner);
        this.breed = breed;
        this.TypeOfFeed = typeOfFeed;
    }

    public String walk() {
        return "The cat is walking with owner now";
    }
    
    public String walk(String name) {
        return "The cat is walking with " + name + " now";
    }

    @Override
    public String say() {
        return "Hello, I am cat " + getName() + "!";
    }

    
}