public class Caesar extends Cipher {

    public String encode(String word) {
        StringBuffer result = new StringBuffer(); // Initialize a string buffer
        for (int k = 0; k < word.length(); k++) { // For each character in word
            char ch = word.charAt(k);               //  Get the character
            ch = (char)('a' + (ch -'a'+ 3) % 26);   //  Perform caesar shift
            result.append(ch);                   //  Append it to new string
        }
        return result.toString();              // Return the result as a string
    } // encode()

    public String decode(String word) {
        StringBuffer result = new StringBuffer(); // Initialize a string buffer
        for (int k = 0; k < word.length(); k++) { // For each character in word
            char ch = word.charAt(k);                 //  Get the character
            ch = (char)('a' + (ch - 'a' + 23) % 26); //  Perform reverse shift
            result.append(ch);                     //  Append it to new string
        }
        return result.toString();            // Return the result as a string
    } // decode()
} // Caesar
