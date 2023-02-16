package lab03;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Experiments {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("forest.txt");
        Scanner scan = new Scanner(file);
        int count = 0;
        double total = 0;
        while (scan.hasNextInt()) {
            int numbers = scan.nextInt();
            count++;
            total = total + numbers;
        }
        double average = total / count;
        System.out.println(count + " " + average);
    }
}
