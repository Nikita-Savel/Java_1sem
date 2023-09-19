public class Parrot extends Pet {

    private final String country;
    private boolean documents;

    public Parrot(String name, int weight, int age, String owner, String country, boolean documents) {
        super(name, weight, age, owner);
        this.country = country;
        this.documents = documents;
    }

    @Override
    public void sayHello() {
        System.out.println("Hello, I am parrot " + getName() + "!");
    }

    public void fly() {
        int randomValue = 1 + (int) (Math.random() * (60));
        System.out.println("Parrot " + getName() + " flew away but promised to return in " + randomValue + " minutes");
    }

    
}