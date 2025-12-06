/**
 * Purpose: Write a program that will read a file of ints into memory,
 * sort them in ascending order, and output the sorted data to a second file.
 */
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;
import java.util.Collections;

public class IntSort {
    public static void main(String args[]) throws Exception {
        String filename = "jfex_sort_me.txt"; // file to sort
        ArrayList<Integer> list = new ArrayList<>();
        File file = new File(filename);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            try {
                list.add(Integer.parseInt(scanner.nextLine()));
            } catch (NumberFormatException e) {
                throw new Exception("Line is not a valid int");
            }
        }

        Collections.sort(list);

        PrintWriter writer = new PrintWriter(new FileWriter("jfex_sorted.txt"));
        for (int i: list) {
            writer.println(i);
        }

        writer.close();

        System.out.println("File created!");
    }
}

