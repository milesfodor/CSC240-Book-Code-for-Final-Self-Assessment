import java.util.Scanner;


public class MinMaxIntField extends IntField {

    private static Scanner keyboard =
            new Scanner(System.in);
    public static void main(String args[]) {
        String fieldEntry = keyboard.nextLine();
        if(checkField(fieldEntry)) {
            System.out.println("In Range");
        } else {
            System.out.println("Maybe next time...");
        }
    }
    public static boolean checkField(String field) {
        // create a MinMaxIntField
        MinMaxIntField minMax = new MinMaxIntField(5, 0, 100);
        // call setText on the MinMaxIntField using the field parameter
        minMax.setText(field);
        // call getInt() to make sure that the field paramater is valid.
        try {
            minMax.getInt();
        } catch (IntOutOfRangeException e) {
            return false; // return false when there is an exception.
        }
        // return true when there is not an exception.
        return true;
    }
    // add the single field you need for MinMaxIntField here
    private int lowerBound;
    // write the constructor for MinMaxIntField here
    public MinMaxIntField(int size, int min, int max) {
        super(size, max);
        lowerBound = min;
    }
    // write the overloaded getInt() method here
    @Override
    public int getInt() throws NumberFormatException, IntOutOfRangeException {
        int num = super.getInt();  // check upper bound
        if (num < lowerBound) {
            throw new IntOutOfRangeException(lowerBound);
        }
        return num;
    }
}
