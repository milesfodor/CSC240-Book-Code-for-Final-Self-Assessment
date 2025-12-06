import javax.swing.*;
public class IntField extends JTextField {
    private int bound = Integer.MAX_VALUE;
    public IntField (int size) {
        super(size);
    }
    public IntField(int size, int max) {
        super(size);
        bound = max;
    }
    public int getInt() throws NumberFormatException,
            IntOutOfRangeException {
        int num = Integer.parseInt(getText());
        if (num > bound)
            throw new IntOutOfRangeException(bound);
        return num;
    } // getInt()
} // IntField
