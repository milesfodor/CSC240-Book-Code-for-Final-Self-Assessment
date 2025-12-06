/**
 *  IntOutOfRangeException reports an exception when
 *    an integer exceeds its bound.
 */
public class IntOutOfRangeException extends Exception {
    public IntOutOfRangeException (int Bound) {
        super("The input value exceeds the bound " + Bound);
    }
}
