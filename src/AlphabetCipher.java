public class AlphabetCipher extends Cipher {

    private Alphabet alphabet;

    public AlphabetCipher(String keyword) {
        alphabet = new Alphabet(keyword);
    }

    @Override
    public String encode(String word) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < word.length(); i++) { // For each character in word
            char ch = word.charAt(i); // Character at index i
            int index = (alphabet.toString().indexOf(ch) + 3) % 26; // Index of our character in our alphabet shifted to the right 3 times
            result.append(alphabet.toString().charAt(index));
        }
        return result.toString();
    }

    @Override
    public String decode(String word) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < word.length(); i++) { // For each character in word
            char ch = word.charAt(i); // Character at index i
            int index = (alphabet.toString().indexOf(ch) + 23) % 26; // Index of our character in our alphabet shifted to the left 3 times
            result.append(alphabet.toString().charAt(index));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        testCipher();
    }

    private static void testCipher() {
        // Basic Test
        AlphabetCipher cipher1 = new AlphabetCipher("zebra");
        System.out.println("===== TEST: encode & decode \"hello\" using Alphabet \"zebra\" (zebracdfghijklmnopqstuvwxy)");
        System.out.println("Expected: kaoos");
        String result = cipher1.encode("hello");
        System.out.println("Actual: " + result);
        System.out.println("Decoded: " + cipher1.decode(result));

        // All Unique Letters
        System.out.println("\n===== TEST: encode & decode \"abcdef\" using alphabet \"quick\" (quickabdefghjlmoprstvwxyz)");
        AlphabetCipher cipher2 = new AlphabetCipher("quick");
        System.out.println("Expected: efbghj");
        result = cipher2.encode("abcdef");
        System.out.println("Actual: " + result);
        System.out.println("Decoded: " + cipher2.decode(result));

        // With Duplicates
        AlphabetCipher cipher3 = new AlphabetCipher("mississippi");
        System.out.println("\n===== TEST: encode & decode \"apple\" using alphabet \"mississippi\" (mispabcdefghjklnoqrtuvwxyz)");
        System.out.println("Expected: dccqh");
        result = cipher3.encode("apple");
        System.out.println("Actual: " + result);
        System.out.println("Decoded: " + cipher3.decode(result));

        // Standard Alphabet
        System.out.println("\n===== TEST: encode & decode \"xyz\" using standard alphabet");
        System.out.println("Expected: abc");
        AlphabetCipher cipher4 = new AlphabetCipher("");
        result = cipher4.encode("xyz");
        System.out.println("Actual: " + result);
        System.out.println("Decoded: " + cipher4.decode(result));

        // Single Character
        AlphabetCipher cipher5 = new AlphabetCipher("a");
        System.out.println("\n===== TEST: encode & decode \"hello\" using alphabet \"a\" (standard alphabet)");
        System.out.println("Expected: khoor");
        result = cipher5.encode("hello");
        System.out.println("Actual: " + result);
        System.out.println("Decoded: " + cipher5.decode(result));
    }
}
