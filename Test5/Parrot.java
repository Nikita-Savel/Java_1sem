public class Parrot extends Pet {

    private final String country;
    private boolean documents;

    public Parrot(String name, int weight, int age, String owner, String country, boolean documents) {
        super(name, weight, age, owner);
        this.country = country;
        this.documents = documents;
    }

    @Override
    public String say() {
        return"Hello, I am parrot " + getName() + "!";
    }

    public String fly() {
        int randomValue = 1 + (int) (Math.random() * (60));
        return "Parrot " + getName() + " flew away but promised to return in " + randomValue + " minutes";
    }

    
}