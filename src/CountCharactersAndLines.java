import java.util.Scanner;
import java.io.File;

/**
 * Purpose: Print out number of characters and lines in a text file.
 */
public class CountCharactersAndLines {
    public static void main(String args[]) throws Exception {
        // HtmlImageUtil.java is available to this program
        String filename = "src/MinMaxIntField.java";
        int lineCount = 0;
        int charCount = 0;
        File file = new File(filename);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String str = scanner.nextLine();
            charCount += str.length();
            lineCount++;
        }
        System.out.println("No. of characters: " + charCount);
        System.out.println("No. of lines: " + lineCount);
    }
}
