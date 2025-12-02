import java.util.Scanner;
public class InvalidPasswordException extends RuntimeException {
    private static Scanner keyboard =
            new Scanner(System.in);
    public static void main(String args[]) {
        String attempt = keyboard.nextLine();
        if(validPassword(attempt)) {
            System.out.println("You're in!");
        } else {
            System.out.println("Go away!");
        }
    }
    public static boolean validPassword(String guess) {
        if(guess.equals("When you know you know.")){
            return true;
        } else {
            // change the constructor to add your own message
            throw new InvalidPasswordException("incorrect");
        }
    }

    // Add default constructor here
    public InvalidPasswordException() {
        super("ERROR: Invalid password");
    }
    // Add second constructor here
    public InvalidPasswordException(String s) {
        super(s);
    }

}