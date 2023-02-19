/**
 * this class implements this cool idea: This class gets the infromation from the fraction class
 * and puts input into those methods and prints the results.
 *
 * @author Vivaan Rajesh
 * @version 13 Feb. 2023
 */
package assignment06;

public class FractionTester {
    public static void main(String[] args) {
        System.out.println("Fraction Tester:");

        // Test the constructor
        System.out.println();
        System.out.println("Testing the constructor:");
        Fraction f = new Fraction(1, 5);
        Fraction g = new Fraction(-3, 4);
        Fraction h = new Fraction(5, 8);
        int errorCount = 0;

        // Testing the numerator
        if (f.getNumerator() != 1) {
            System.out.println("Error: Expected 1 and got " + f.getNumerator());
            errorCount++;
        }
        if (g.getNumerator() != -3) {
            System.out.println("Error: Expected -3 and got " + g.getNumerator());
            errorCount++;
        }
        if (h.getNumerator() != 5) {
            System.out.println("Error: Expected 5 and got " + h.getNumerator());
            errorCount++;
        }

        // testing the denominator

        if (f.getDenominator() != 5) {
            System.out.println("Error: Expected 5 and got " + f.getDenominator());
            errorCount++;
        }
        if (g.getDenominator() != 4) {
            System.out.println("Error: Expected 4 and got " + g.getDenominator());
            errorCount++;
        }
        if (h.getDenominator() != 8) {
            System.out.println("Error: Expected 8 and got " + h.getDenominator());
            errorCount++;
        }

        // Testing the add method
        Fraction fgSum = f.add(g);
        Fraction fhSum = f.add(h);
        Fraction ghSum = g.add(h);

        if (fgSum.getNumerator() != -11 || fgSum.getDenominator() != 20) {
            System.out.println("Error in the add method, expected -11/20, and got" + fgSum);
            errorCount++;
        }
        if (fhSum.getNumerator() != 33 || fhSum.getDenominator() != 40) {
            System.out.println("Error in the add method, expected 33/40, and got " + fhSum);
            errorCount++;
        }
        if (ghSum.getNumerator() != -1 || ghSum.getDenominator() != 8) {
            System.out.println("Error in the add method, expected -1/8, and got" + ghSum);
            errorCount++;
        }

        // Testing Subtract method
        Fraction fgDifference = f.subtract(g);
        Fraction fhDifference = f.subtract(h);
        Fraction ghDifference = g.subtract(h);

        if (fgDifference.getNumerator() != 19 || fgDifference.getDenominator() != 20) {
            System.out.println("Error in subtract method, expected 19/20, and got" + fgDifference);
            errorCount++;
        }
        if (fhDifference.getNumerator() != -17 || fhDifference.getDenominator() != 40) {
            System.out.println("Error in subtract method, expected -17/40, and got " + fhDifference);
            errorCount++;
        }
        if (ghDifference.getNumerator() != -11 || ghDifference.getDenominator() != 8) {
            System.out.println("Error in subtract method, expected -11/8, and got" + ghDifference);
            errorCount++;
        }

        // Testing the multiply method
        Fraction multiplyFg = f.multiply(g);
        Fraction multiplyFh = f.multiply(h);
        Fraction multiplyGh = g.multiply(h);

        if (multiplyFg.getNumerator() != -3 || multiplyFg.getDenominator() != 20) {
            System.out.println("Error in multiply method, expected 1/5, and got " + multiplyFg);
            errorCount++;
        }
        if (multiplyFh.getNumerator() != 1 || multiplyFh.getDenominator() != 8) {
            System.out.println("Error in multiply method, expected 3/8, got " + multiplyFh);
            errorCount++;
        }
        if (multiplyGh.getNumerator() != -15 || multiplyGh.getDenominator() != 32) {
            System.out.println("Error in multiply method, expected 1/2, got " + multiplyGh);
            errorCount++;
        }

        // Testing the divide method
        Fraction divideFg = f.divide(g);
        Fraction divideFh = f.divide(h);
        Fraction divideGh = g.divide(h);

        if (divideFg.getNumerator() != -4 || divideFg.getDenominator() != 15) {
            System.out.println("Error in divide method, expected -4/15, and got " + divideFg);
            errorCount++;
        }
        if (divideFh.getNumerator() != 8 || divideFh.getDenominator() != 25) {
            System.out.println("Error in divide method, expected 8/25, got " + divideFh);
            errorCount++;
        }
        if (divideGh.getNumerator() != -6 || divideGh.getDenominator() != 5) {
            System.out.println("Error in divide method, expected -6/5, got " + divideGh);
            errorCount++;
        }

        // ToDouble Method testing
        if (f.toDouble() != 0.2) {
            System.out.println("Error in toDouble, expected 0.2, got " + f.toDouble());
            errorCount++;
        }
        if (g.toDouble() != -0.75) {
            System.out.println("Error in toDouble, expected -0.75, got " + g.toDouble());
            errorCount++;
        }
        if (h.toDouble() != 0.625) {
            System.out.println("Error in toDouble, expected 0.625, got " + h.toDouble());
            errorCount++;
        }

        // ToString Method Testing
        if (!f.toString().equals("1/5")) {
            System.out.println("ToString error, expected 1/5, got " + f);
            errorCount++;
        }
        if (!g.toString().equals("-3/4")) {
            System.out.println("ToString error,  expected -3/4, got " + g);
            errorCount++;
        }
        if (!h.toString().equals("5/8")) {
            System.out.println("ToString error, expected 5/8, got " + h);
            errorCount++;
        }

        if (errorCount == 0) {
            System.out.println("All tests completed, no errors.");
        } else {
            System.out.println("All tests completed, errors found.");
        }

        System.out.println("Fraction Tester Finished");
    }

}

