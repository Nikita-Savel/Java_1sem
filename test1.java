public class test1 {
    public static void main(String[] args) {
        System.out.println(equals("Привет", "привет"));
        System.out.println(replace("Hello world!", "Hello", "Good bye"));
        System.out.println(format("Олегов", 9, "Введение в программирование на Java"));
        System.out.println(isPalindrome("А роза упала на лапу азора"));
        

    }

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
}
