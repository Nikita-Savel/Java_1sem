package Checking;
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
            System.out.println(false);
        }
    }
    
    public static boolean validate(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {

        int maxLength = 20;
        int AsciiCode0 = 48;
        int AsciiCode9 = 57;
        int AsciiCodeA = 65;
        int AsciiCodeZ = 90;
        int AsciiCodea = 97;
        int AsciiCodez = 122;
        int AsciiCode_ = 95;

        boolean loginResult = true;
        for (int i = 0; i < login.length(); i++) {
            if (!((login.charAt(i) >= AsciiCode0 && login.charAt(i) <= AsciiCode9) || (login.charAt(i) >= AsciiCodeA && login.charAt(i) <= AsciiCodeZ) || (login.charAt(i) >= AsciiCodea && login.charAt(i) <= AsciiCodez) || (login.charAt(i) == AsciiCode_))) {
                loginResult = false;
            }
        }
        if (login.length() >= maxLength || !loginResult) {
            throw new WrongLoginException("Неверный логин");
        }
        boolean passwordResult = true;
        for (int i = 0; i < password.length(); i++) {
            if (!((password.charAt(i) >= AsciiCode0 && password.charAt(i) <= AsciiCode9) || (password.charAt(i) >= AsciiCodeA && password.charAt(i) <= AsciiCodeZ) || (password.charAt(i) >= AsciiCodea && password.charAt(i) <= AsciiCodez) || (password.charAt(i) == AsciiCode_))) {
                passwordResult = false;
            }
        }
        if (password.length() >= maxLength || !password.equals(confirmPassword) || !passwordResult) {
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