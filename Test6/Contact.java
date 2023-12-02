package Test6;
record Contact (String name, String email) {
    public Contact (String name, String email) {
        if (name == null || name.length() == 0 || !(email.endsWith("@gmail.com"))) {
            throw new IllegalArgumentException("Имя пользователя не задано или его длина равна 0");
        } else if (email == null || !(email.endsWith("@gmail.com"))) {
            throw new IllegalArgumentException("Email не задан или не оканчивается на gmail.com");
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