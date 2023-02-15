/**
 * this class implements this cool idea: This class provides the program with the necessary methods
 * and operations in them, and takes in values from the other class and returns the results.
 *
 * @author Vivaan Rajesh
 * @version 13 Feb. 2023
 */
package assignment06;

public class Fraction {
    private long numerator;
    private long denominator;

    /**
     * creating the constructor that takes in the n and d values
     *
     * @param n is the numerator of the fraction supplied.
     * @param d is the denominator of the fraction supplied.
     */
    public Fraction(long n, long d) {  // consists of the constructor.
        long gcd = getGcd(2, 3);
        this.numerator = n / gcd;
        this.denominator = d / gcd;

        if (d < 0) {
            d = d * -1;
            n = n * -1;
        }
    }

    /**
     * second constructor that takes in a long as an argument
     *
     * @param param it takes input 12 into the Fraction object, and output is used elsewhere.
     */
    public Fraction(long param) {
        new Fraction(12);
    }

    /**
     * add method
     *
     * @param rightHandSide
     * @return the result of the addition
     */

    public Fraction subtract(Fraction rightHandSide) {
        // Create a variable to hold the result
        long numerator = this.numerator * rightHandSide.denominator - rightHandSide.numerator * this.denominator;
        long denominator = this.denominator * rightHandSide.denominator;

        return new Fraction(numerator, denominator);
    }

    /**
     * subtract fraction method.
     *
     * @param rightHandSide
     * @return
     */
    public Fraction add(Fraction rightHandSide) {
        // Create a variable to hold the result

        long numerator = this.numerator * rightHandSide.denominator + rightHandSide.numerator * this.denominator;
        long denominator = this.denominator * rightHandSide.denominator;

        return new Fraction(numerator, denominator);
    }

    /**
     * makes the value a decimal equivalent
     *
     * @return the decimal value of the fraction.
     */
    public double toDouble() {
        return ((double) numerator / denominator);
    }

    public long getGcd(long x, long y) {
        long gcd = x;
        long remainder = y;

        while (remainder != 0) {
            long temp = remainder;
            remainder = gcd % remainder;
            gcd = temp;
        }
        return gcd;
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
    public long getNumerator() {
        return numerator; // returns the numerator only
    }

    /**
     * gets the denominator of the fraction provided.
     *
     * @return the value of the denominator of the fraction.
     */
    public long getDenominator() {
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
        result = new Fraction(this.numerator * rightHandSide.denominator,
                this.denominator * rightHandSide.numerator);

        // Pass the resulting fraction back to the caller.
        return result;
    }
}
