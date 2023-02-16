/**
 * This class implements this cool idea: This program allows the user to enter the number of
 * digits in a hailstone sequence, and calculates the starting number.
 *
 * @author Vivaan Rajesh
 * @uId: u1445660
 * @version January 22, 2023
 */
package assignment03;

import java.util.Scanner;

public class HailstoneSearch {
    public static void main(String[] args) {
        int count = 0; //set the loop count to 0 initially
        int N = 2; // give a value for the hailstone sequence minimum
        int secondN = 2; // create a second N

        Scanner input = new Scanner(System.in); // create a scanner
        System.out.println("Enter the length X");  // ask user for length
        int X = input.nextInt(); // this reads the input

        while (X < 1) {  // make a while loop that rejects an illegal value aka negatives and 0
            System.out.println("Incorrect input, Try Again: ");
            X = input.nextInt();  // reads input again and again till it's positive
        }

        while (N != 1000) {  // create while loop with max amount, and as long it hasn't reached that, it executes code below.
            secondN = N; //3
            count = 0;
            while (secondN != 1) { // second while loop that computes the hailstone sequence.
                if (secondN % 2 == 0) {
                    secondN = secondN / 2;
                } else {  // tests for the odd number situation
                    secondN = (secondN * 3) + 1;
                }
                count++;  // increasing the loop count
            }
            if (count == X) { // once the number of iterations is same as user input, program is finally over, and prints details
                break;
            }
            N++;
        }
        System.out.println("The Hailstone sequence starting at " + N + " takes " + X + " steps to converge to 1.");
    }

}
