public class Pet {
    private final String name;
    private int weight;
    private int age;
    private String owner;
    
    public Pet(String name, int weight, int age, String owner) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.owner = owner;
    }
    
    public void sayHello() {
        System.out.println("Hello, I am " + name + "!");
    }
    
    public String getName() {
        return name;
    }

}

enum TypeOfFeed {
    CHEAP,
    EXPENSIVE
}