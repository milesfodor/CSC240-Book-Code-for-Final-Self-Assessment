import java.util.Scanner;
import java.io.File;

public class WordFilter {
    /**
     * Prints lines from a text file that contain a specified string.
     *
     * @param filename The file to check
     * @param match The string to look for
     * @throws Exception If the file is not found
     */
    public void wordFilter(String filename, String match) throws Exception {
        File file = new File(filename);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String str = scanner.nextLine();
            if (str.contains(match)) {
                System.out.println(str);
            }
        }
    }
    public static void main(String args[]) throws Exception {
        String filename = "src/MinMaxIntField.java";
        WordFilter program = new WordFilter();
        program.wordFilter(filename, "String");
    }
}
