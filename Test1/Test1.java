package Test1;
public class Test1 {
    public static void main(String[] args) {
        System.out.println(equals("Привет", "привет"));
        System.out.println(replace("Hello world!", "Hello", "Good bye"));
        System.out.println(format("Олегов", 9, "Введение в программирование на Java"));
        System.out.println(isPalindrome("А роза упала на лапу азора"));
        

    }

    static boolean equals(String firstString, String secondString) {
        // проверить, что строки совпадают без учета регистра
        return firstString.toLowerCase().equals(secondString.toLowerCase());
    }
    
    static String replace(String str, String oldStr, String newStr) {
        // в строке str все вхождения oldStr заменить на newStr
        String ans = "";
        ans = str.replace(oldStr, newStr);
        return ans;
    }
    
    static String format(String surname, int mark, String subject) {
        // вернуть строку, используя форматирование: Студент [Фамилия] получил [оценка] по [предмету]
        return String.format("Студент %s получил %d по %s", surname, mark, subject);
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
