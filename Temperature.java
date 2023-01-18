/**
 * This class implements this cool idea: It asks the user to input a fahrenheit value
 * and it converts that fahrenheit value into celsius.
 * @author Vivaan Rajesh
 * @uId: u1445660
 * @version January 17, 2023
 */
package assignment02;
// create the scanner

import java.util.Scanner;

public class Temperature {
    // create the main method
    public static void main(String[] args) {
        // call the scanner from the circleArea class
        Scanner input = CircleArea.input;
        // ask the user for the fahrenheit value.
        System.out.println("Enter a fahrenheit value: ");
        double fahrenheit = input.nextDouble();
        // create a variable for the output, using the fahrenheit to celsius formula.
        double conversion = (fahrenheit - 32) * 5 / 9;
        System.out.println("Your converted celsius value is: " + conversion);
    }
}
