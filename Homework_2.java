public class Homework_2 {
    public static void main(String[] args) {
        System.out.println(equals("Привет", "привет"));
        System.out.println(replace("Hello world!", "Hello", "Good bye"));
        System.out.println(format("Олегов", 9, "Введение в программирование на Java"));
        System.out.println(isPalindrome("А роза упала на лапу азора"));

        Cat Murca = new Cat();
        Dog Ben = new Dog();
        Parrot Ivan = new Parrot();
        Murca.say();
        Ben.say();
        

    }


    // task 1
    static boolean equals(String firstString, String secondString) {
        // проверить, что строки совпадают без учета регистра
        if (firstString.toLowerCase().equals(secondString.toLowerCase())) {
            return true;
        }
        return false;
    }
    
    static String replace(String str, String oldStr, String newStr) {
        // в строке str все вхождения oldStr заменить на newStr
        String ans = "";
        ans = str.replace(oldStr, newStr);
        return ans;
    }
    
    static String format(String surname, int mark, String subject) {
        // вернуть строку, используя форматирование: Студент [Фамилия] получил [оценка] по [предмету]
        String str = "Cтудент" + " " + surname + " " + "получил" + " " + mark  + " " + "по" + " " + subject;
        return str;
    }
    
    static boolean isPalindrome(String str) {
        // проверить, является ли строка палиндромом
        String firstLineWithoutSpaces = "";
        String secondLineWithoutSpaces = "";
        StringBuilder st = new StringBuilder(str);
        st.reverse();
        String reverseStr = st.toString();
        firstLineWithoutSpaces = str.replace(" ", "");
        secondLineWithoutSpaces = reverseStr.replace(" ", "");
        if (firstLineWithoutSpaces.toLowerCase().equals(secondLineWithoutSpaces.toLowerCase())) {
            return true;
        }
        return false;
    }


    // task 2
    // task 3
    // task 4







    // task 5
    public class Pet {

        String name;
        int weight;
        int age;
        String owner;

        public void say() {
            System.out.println("Voice");
        }
    }

    public class Cat extends Pet {
        private String race;
        private String typeOfFeed;
        String walk() {
            return "The cat is walking with owner now";
        }
        String walk(String name) {
            return "The cat is walking with " + name + " now";
        }
        @Override
        public void say() {
            System.out.println("Meow-meow");
        }
    }

    public class Dog extends Pet {
        private String race;
        private String typeOfFeed;
        String walk() {
            return "The cat is walking with owner now";
        }
        String walk(String name) {
            return "The cat is walking with " + name + " now";
        }
        @Override
        public void say() {
            System.out.println("Woof-woof");
        }
    }

    public class Parrot extends Pet {
        private String country;
        private String documents;
        int randomValue = 1 + (int) (Math.random() * (60));
        String fly(String name) {
            return "The parrot flew away but promised to return in " + randomValue + " minutes";
        }
        @Override
        public void say() {
            System.out.println("Pirates-pirates");
        }
    }















    // task 6

    // task 7

    // task 8



}