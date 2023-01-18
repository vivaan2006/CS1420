/**
 * This class implements this cool idea: It asks the user to input 2 side lengths that are used
 * as legs, and it uses the pythagorean theorem to calculate the Hypotenuse.
 * @author Vivaan Rajesh
 * @uId: u1445660
 * @version January 17, 2023
 */
package assignment02;
// import the scanner

import java.util.Scanner;

public class Hypotenuse {
    // create the main method
    public static void main(String[] args) {
        // call the scanner from the circle area class
        Scanner input = CircleArea.input;
        // ask user for length of  leg 1.
        System.out.println("Enter the length of side a: ");
        double sideA = input.nextDouble();
        // ask the user to enter the length of leg 2
        System.out.println("Enter the length of side b: ");
        double sideB = input.nextDouble();
        // use the pythagorean theorem to calculate the hypotenuse length
        System.out.println("The Hypotenuse for this triangle would be: " + Math.sqrt((sideA * sideA) + (sideB * sideB)));
    }
}
