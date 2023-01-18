/**
 * This class implements this cool idea: It asks the user to input a radius and it
 * calculates the area of the circle with the radius they inputted.
 * @author Vivaan Rajesh
 * @uId: u1445660
 * @version January 17, 2023
 */
package assignment02;
// import the scanner
import java.util.Scanner;
public class CircleArea {
    // make the scanner final in order to call the scanner in other classes without making a new one.
    public static final Scanner input = new Scanner(System.in);

    // create the main method.
    public static void main(String[] args) {
        // ask the user to enter the radius.
        System.out.println("Enter a radius");
        double radiusInput = input.nextDouble();
        // calculate the area of the circle using pi r^2 and print the final area.
        double area = radiusInput * radiusInput * Math.PI;
        System.out.println("The area is: " + area);
    }
}