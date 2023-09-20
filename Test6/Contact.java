package Test6;
record Contact (String name, String email) {
    public Contact (String name, String email) {
        if (name == null || email == null || name.length() == 0 || !(email.contains("@gmail.com"))) {
            throw new IllegalArgumentException("String can not be empty!");
        }
        this.name = name;
        this.email = email;
    }
    public Contact(String name) {
        this(name, "default@gmail.com");
    }
    public void sayHello() {
        System.out.println("Hello, " + name + "!");
    }
}