public class Test5 {
    public static void main(String[] args) {
        String login = "NewLogin";
        String password = "Password";
        String confirmPassword = "Password";

        try {
            boolean result = validate(login, password, confirmPassword);
            System.out.println(result);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean validate(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        try {
            boolean loginResult = false;
            for (int i = 0; i < login.length(); i++) {
                if (!((48 <= (int) login.charAt(i) && (int) login.charAt(i) <= 57) || (65 <= (int) login.charAt(i) && (int) login.charAt(i) <= 90) || (97 <= (int) login.charAt(i) && (int) login.charAt(i) <= 122) || (95 == (int) login.charAt(i)))) {
                    loginResult = true;
                }
            }
            if (login.length() >= 20 || loginResult) {
                throw new WrongLoginException("Invalid login");
            }

            boolean passwordResult = false;
            for (int i = 0; i < password.length(); i++) {
                if (!((48 <= (int) password.charAt(i) && (int) password.charAt(i) <= 57) || (65 <= (int) password.charAt(i) && (int) password.charAt(i) <= 90) || (97 <= (int) password.charAt(i) && (int) password.charAt(i) <= 122) || (95 == (int) password.charAt(i)))) {
                    passwordResult = true;
                }
            }
            if (password.length() >= 20 || !password.equals(confirmPassword) || passwordResult) {
                throw new WrongPasswordException("Invalid password");
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