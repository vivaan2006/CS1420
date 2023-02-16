/**
 * This class implements this cool idea: It asks the user to input a number and then
 * the program calculates and outputs the equivalent binary value.
 * @author Vivaan Rajesh
 * @uId: u1445660
 * @version January 17, 2023
 */
package assignment02;
// import the scanner

import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        // call the Scanner we made in the Circle Area class
        Scanner input = CircleArea.input;
        // create a variable for each number in the binary output, and another calc variable to use in the operations for the first number
        int firstNumber;
        int secondNumber;
        int thirdNumber;
        int fourthNumber;
        int fifthNumber;
        int sixthNumber;
        int seventhNumber;
        int eighthNumber;
        int calc;

        // ask the user what value they want to convert.
        System.out.print("Enter a number: ");
        int userInput = input.nextInt();
        // get the remainder of the value inputted divided by 2 and subtract the eight number from the input value, and divide by 2
        eighthNumber = userInput % 2;
        calc = userInput - eighthNumber;
        calc = calc / 2;
        // do the same for the seventh number, but this time take the calc variable because it is no longet the last digit
        seventhNumber = calc % 2;
        calc = calc - seventhNumber;
        calc = calc / 2;
        // same algorithm as 7th number
        sixthNumber = calc % 2;
        calc = calc - sixthNumber;
        calc = calc / 2;
        // same algorithm as 7th number
        fifthNumber = calc % 2;
        calc = calc - fifthNumber;
        calc = calc / 2;
        // same algorithm as 7th number
        fourthNumber = calc % 2;
        calc = calc - fourthNumber;
        calc = calc / 2;
        // same algorithm as 7th number
        thirdNumber = calc % 2;
        calc = calc - thirdNumber;
        calc = calc / 2;
        // same algorithm as 7th number
        secondNumber = calc % 2;
        calc = calc - secondNumber;
        calc = calc / 2;
        // to calculate the first number we just need to take the variable that we modified all along and divide by 2 and take remainder
        firstNumber = calc % 2;
        // print all the numbers using the + operator
        System.out.println("The decimal number " + userInput + " is " + firstNumber + secondNumber + thirdNumber + fourthNumber + fifthNumber +
                sixthNumber + seventhNumber + eighthNumber + " in binary.");
    }
}