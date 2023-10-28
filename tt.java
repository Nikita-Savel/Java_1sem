package Task5;
public class Task5{
    public static void main(String[] args) {
        String login = "log";
        String password = "password";
        String confirmPassword = "pasword";
        try {
            boolean flag = cheacker(login, password, confirmPassword);
            System.out.println(flag);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e);
            System.out.println(false);        }
        }
    public static boolean cheacker (String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        String symbols = "^[a-zA-Z0-9_]+$";
        if (login.length() >= 20) {
            throw new WrongLoginException("Слишком длинный логин");
        }
        for (int i = 0; i < login.length(); ++i) {            if (!symbols.contains(login.substring(i, i + 1))) {
                throw new WrongLoginException();            }
        }        if (password.length() >= 20) {
            throw new WrongPasswordException("Слишком длинный пароль");        }
        for (int i = 0; i < login.length(); ++i) {            if (!symbols.contains(login.substring(i, i + 1))) {
                throw new WrongPasswordException();            }
        }        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают");        }
        return true;    }
}