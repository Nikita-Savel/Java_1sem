public class Test5 {
    public static void main(String[] args) {
        String login = "NewLogin";
        String password = "NewPassword";
        String confirmPassword = "NewPassword";
        try {
            boolean status = validate(login, password, confirmPassword);
            System.out.println(status);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e);
        }
    }
    

    public static boolean validate(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        
        boolean loginResult = true;
        for (int i = 0; i < login.length(); i++) {
            if (!((login.charAt(i) >= 48 && login.charAt(i) <= 57) || (login.charAt(i) >= 65 && login.charAt(i) <= 90) || (login.charAt(i) >= 97 && login.charAt(i) <= 122) || (login.charAt(i) == 95))) {
                loginResult = false;
            }
        }
        if (login.length() >= 20 || !loginResult) {
            throw new WrongLoginException("Неверный логин");
        }
        boolean passwordResult = true;
        for (int i = 0; i < password.length(); i++) {
            if (!((password.charAt(i) >= 48 && password.charAt(i) <= 57) || (password.charAt(i) >= 65 && password.charAt(i) <= 90) || (password.charAt(i) >= 97 && password.charAt(i) <= 122) || (password.charAt(i) == 95))) {
                passwordResult = false;
            }
        }
        if (password.length() >= 20 || !password.equals(confirmPassword) || !passwordResult) {
            throw new WrongPasswordException("Неверный пароль");
        }
        return true;
        
    }
}

class WrongLoginException extends Exception {
    public WrongLoginException() {
        super();
    }
    public WrongLoginException(String message) {
        super(message);
    }
}
class WrongPasswordException extends Exception {
    public WrongPasswordException() {
        super();
    }
    public WrongPasswordException(String message) {
        super(message);
    }
}