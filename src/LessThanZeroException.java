import java.util.Scanner;
public class LessThanZeroException {
    private static Scanner keyboard =
            new Scanner(System.in);
    public static void main(String args[]) {
        int x = keyboard.nextInt();
        // write try/catch block here.
        try {
            int[] arr = new int[x];
        } catch (NegativeArraySizeException e) {
            System.err.println("ERROR: Negative value in X coordinate.");
        }

    }
}
