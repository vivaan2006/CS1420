/**
 * this class implements this cool idea: This class provides the program with the necessary methods
 * and operations in them, and takes in values from the other class and returns the results.
 *
 * @author Vivaan Rajesh
 * @version 13 Feb. 2023
 */
package assignment06;

public class Fraction {
    private int numerator;
    private int denominator;

    /**
     * creating the constructor that takes in the n and d values
     *
     * @param n is the numerator of the fraction supplied.
     * @param d is the denominator of the fraction supplied.
     */
    public Fraction(int n, int d) {  // consists of the constructor.
        this.numerator = n;
        this.denominator = d;
    }

    /**
     * returns the fraction in the traditional fractional form rather than in a string.
     */
    public String toString() {
        return this.numerator + "/" + this.denominator; // computes the fraction in fractional form.
    }

    /**
     * gets the numerator.
     *
     * @return the numerator of the fraction supplied in the tester.
     */
    public int getNumerator() {
        return numerator; // returns the numerator only
    }

    /**
     * gets the denominator of the fraction provided.
     *
     * @return the value of the denominator of the fraction.
     */
    public int getDenominator() {
        return denominator; // returns the denominator only
    }

    /**
     * multiplies the fractions together
     *
     * @param rightHandSide is used to call the right side of the fraction.
     * @return the result of the multiplication.
     */
    public Fraction multiply(Fraction rightHandSide) {
        // Create a variable to hold the result
        Fraction result;

        // Build a new Fraction object - send the products to the constructor.
        result = new Fraction(this.numerator * rightHandSide.numerator,
                this.denominator * rightHandSide.denominator);

        // Pass the resulting fraction back to the caller.
        return result;
    }

    /**
     * divides the numbers in the fraction.
     *
     * @param rightHandSide takes the right value of the fraction and divides it.
     * @return the result of the division.
     */
    public Fraction divide(Fraction rightHandSide) {
        // Create a variable to hold the result
        Fraction result;

        // Build a new Fraction object - send the products to the constructor.
        result = new Fraction(this.numerator * rightHandSide.numerator,
                this.denominator * rightHandSide.denominator);

        // Pass the resulting fraction back to the caller.
        return result;
    }
}
