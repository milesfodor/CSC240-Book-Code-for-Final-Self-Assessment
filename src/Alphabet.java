/**
 * Purpose: Use a keyword to define an alphabet.
 * Example: keyword "zebra" would construct the following alphabet:
 * "zebracdfghijklmnopqstuvwxy"
 */
public class Alphabet {
    private String alphabet;

    /**
     * Creates a new alphabet with the keyword at the beginning and no
     * duplicate characters
     *
     * @param keyword The keyword that our alphabet starts with
     */
    public Alphabet(String keyword) {
        // StringBuilder to generate alphabet from
        StringBuilder sb = new StringBuilder(keyword.toLowerCase());

        // Each index in this array represents a character used in keyword.
        boolean[] arr = new boolean[26]; // Creates a new boolean array with 26 indexes containing "false"

        // Iterate through keyword to ensure no duplicate characters
        for (int i = 0; i < sb.length(); i++) {
            int charIndex = Character.toLowerCase(sb.charAt(i)) - 97;

            // If the character is already in the string
            if (arr[charIndex]) {
                sb.deleteCharAt(i);
                i--;
            }
            // If this is the first occurrence of character
            else {
                arr[charIndex] = true;
            }
        }

        String originalAlphabet = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < 26; i++) {
            int charIndex = originalAlphabet.charAt(i) - 97;

            // If the character is not already in the string
            if (!arr[charIndex]) {
                sb.append(originalAlphabet.charAt(i));
                arr[charIndex] = true;
            }
        }

        alphabet = sb.toString();
    }

    @Override
    public String toString() {
        return alphabet;
    }

    public static void main(String[] args) {
        System.out.println(new Alphabet("Hellol"));
        System.out.println(new Alphabet("aabbccbbaa"));
        System.out.println(new Alphabet("zebra"));
    }
}
