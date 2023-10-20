public class Parrot extends Pet {

    private final String country;
    private boolean hasDocs;

    public Parrot(String name, int weight, int age, String owner, String country, boolean hasDocs) {
        super(name, weight, age, owner);
        this.country = country;
        this.hasDocs = hasDocs;
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