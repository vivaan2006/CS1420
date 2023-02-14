/**
 * this class implements this cool idea: This class gets the infromation from the fraction class
 * and puts input into those methods and prints the results.
 * @author Vivaan Rajesh
 * @version 13 Feb. 2023
 */
package assignment06;

public class FractionTester {
    public static void main(String[] args) {
        System.out.println ("Fraction tester:"); // start of the program

        Fraction f = new Fraction (2, 3); // values for f
        Fraction g = new Fraction (1, 4); // values for g
        Fraction h = new Fraction (5, 1); // values for h

        System.out.println ("Fraction f contains: " + f); // tells user f contains what
        System.out.println ("Fraction g contains: " + g); // tells user g contains what
        System.out.println ("Fraction h contains: " + h); // tells user h contains what


        System.out.println ("F's numerator is: " + f.getNumerator()); // tells user the numerator of f
        System.out.println ("F's denominator is: " + f.getDenominator()); // tells user the denominator of f

        System.out.println ("G's numerator is: " + g.getNumerator());  // tells user the numerator of g
        System.out.println ("G's denominator is: " + g.getDenominator()); // tells user the denominator of g

        System.out.println ("H's numerator is: " + h.getNumerator());  // tells user the numerator of h
        System.out.println ("H's denominator is: " + h.getDenominator()); // tells user the denominator of h


        System.out.println ("Fraction tester end."); // end of program
    }
}
