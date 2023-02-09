/**
 * This lab consists of a try catch statement that creates the 5 letter text file and reads the text and populates the 5 letter
 * text file.
 * @author Vivaan Rajesh
 * @version 2 february 2023
 */
package lab05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FilterWords {
    public static void main(String[] args) {
        String word;
        try (Scanner in = new Scanner(new File("words.txt")); PrintWriter out = new PrintWriter(new File("five.txt"));)
        {
            while (in.hasNext()) {
                word = in.next();
                if(word.length() == 5) {
                    out.println(word);
                }
            }
        }
        catch (Exception e) {
            System.out.println("Could not read the words: " + e.getMessage());
            return;
        }
    }
}
