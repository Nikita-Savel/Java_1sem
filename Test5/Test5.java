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
        try {
            boolean loginResult = false;
            for (int i = 0; i < login.length(); i++) {
                if (!(((int) login.charAt(i) >= 48 && (int) login.charAt(i) <= 57) || ((int) login.charAt(i) >= 65 && (int) login.charAt(i) <= 90) || ((int) login.charAt(i) >= 97 && (int) login.charAt(i) <= 122) || ((int) login.charAt(i) == 95))) {
                    loginResult = true;
                }
            }
            if (login.length() >= 20 || loginResult) {
                throw new WrongLoginException("Неверный логин");
            }

            boolean passwordResult = false;
            for (int i = 0; i < password.length(); i++) {
                if (!(((int) password.charAt(i) >= 48 && (int) password.charAt(i) <= 57) || ((int) password.charAt(i) >= 65 && (int) password.charAt(i) <= 90) || ((int) password.charAt(i) >= 97 && (int) password.charAt(i) <= 122) || ((int) password.charAt(i) == 95))) {
                    passwordResult = true;
                }
            }
            if (password.length() >= 20 || password.equals(confirmPassword) || passwordResult) {
                throw new WrongPasswordException("Неверный пароль");
            }
            return true;
        } catch (WrongLoginException e) {
            throw e;
        } catch (WrongPasswordException e) {
            throw e;
        }
        
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