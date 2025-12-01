/**
 * Purpose: Write my own equalsIgnoreCase() method using only other String methods except for isLowerCase()
 */
public class WriteEqualsIgnoreCase {
    /**
     * Compares the case-insensitive equality of two strings.
     *
     * @param str the given string
     * @param other the string to compare to
     * @return {@code true} if the two strings are case-insensitively equal, {@code false} otherwise
     */
    public static boolean equalsIgnoreCase(String str, String other) {

        // If the memory addresses match, then the strings are equal, and we don't need to do any work
        if (str == other) {
            return true;
        }

        // If the strings have different lengths, then the strings are not equal, and we don't need to do any work
        if (str.length() != other.length()) {
            return false;
        }


        for (int i = 0; i < str.length(); i++) {
            char cStr = str.charAt(i);
            char cOther = other.charAt(i);

            // We first check if the two characters are equal to one another
            if (cStr != cOther) {
                /*
                 * We will now check if the character is a letter.
                 * If it is, we check if the absolute value of the difference between the two characters == 32.
                 * The difference between an uppercase letter and its lowercase equivalent is always 32 in ASCII.
                 */
                if (!((cStr >= 'A' && cStr <= 'Z' || cStr >= 'a' && cStr <= 'z') &&
                        Math.abs(cStr - cOther) == 32)) {
                    return false;
                }
            }
        }

        // If the loop finishes, that means the two strings are case-insensitively equal
        return true;
    }

    public static void main(String[] args) {
        // same case equality
        System.out.println(equalsIgnoreCase("hello", "hello"));  // true
        System.out.println(equalsIgnoreCase("HELLO", "HELLO"));  // true

        // different case equality
        System.out.println(equalsIgnoreCase("hello", "HELLO"));  // true
        System.out.println(equalsIgnoreCase("HeLlO", "hElLo"));  // true

        // different lengths
        System.out.println(equalsIgnoreCase("hello", "hell"));   // false
        System.out.println(equalsIgnoreCase("", " "));           // false

        // non-letter characters
        System.out.println(equalsIgnoreCase("hello!", "HELLO!"));  // true
        System.out.println(equalsIgnoreCase("123", "123"));        // true
        System.out.println(equalsIgnoreCase("a1b2", "A1B2"));      // true

        // edge cases
        System.out.println(equalsIgnoreCase(null, null));         // true
        System.out.println(equalsIgnoreCase("", ""));             // true
        System.out.println(equalsIgnoreCase(" ", " "));           // true
        System.out.println(equalsIgnoreCase("a", "A"));           // true
        System.out.println(equalsIgnoreCase("a", "b"));           // false
        System.out.println(equalsIgnoreCase("a", "A" + 1));       // false

    }
}
