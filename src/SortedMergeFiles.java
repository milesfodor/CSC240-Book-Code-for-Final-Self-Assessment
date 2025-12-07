import java.io.*;
import java.util.*;

/**
 * Purpose: Read two sorted files of ints, then merge the files
 * and resort
 */
public class SortedMergeFiles {
    public static void main(String args[]) throws IOException {
        String sortedfile1 = "jfex_sorted_a.txt";
        String sortedfile2 = "jfex_sorted_b.txt";

        File file1 = new File(sortedfile1);
        File file2 = new File(sortedfile2);

        Scanner scanner1 = new Scanner(file1);
        Scanner scanner2 = new Scanner(file2);

        ArrayList<Integer> list = new ArrayList<>();

        while (scanner1.hasNextLine()) {
            list.add(Integer.parseInt(scanner1.nextLine()));
        }

        while (scanner2.hasNextLine()) {
            list.add(Integer.parseInt(scanner2.nextLine()));
        }

        Collections.sort(list);

        PrintWriter writer = new PrintWriter(new FileWriter("jfex_merge_sorted.txt"));

        for (int i: list) {
            writer.println(i);
        }

        writer.close();

        System.out.println("File created!");
    }
}
