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
        Fraction f = new Fraction(4, 6);
        Fraction g = new Fraction(-6, 10);
        Fraction h = new Fraction(10, 15);

        System.out.println("F: " + f);
        System.out.println("G: " + g);
        System.out.println("H: " + h);

        System.out.println();
        System.out.println("Numerators");
        System.out.println("Numerator of F: " + f.getNumerator());
        System.out.println("Numerator of G: " + g.getNumerator());
        System.out.println("Numerator of H: " + h.getNumerator());

        System.out.println();
        System.out.println("Denominators");
        System.out.println("Denominators of F: " + f.getDenominator());
        System.out.println("Denominators of G: " + g.getDenominator());
        System.out.println("Denominators of H: " + h.getDenominator());


        // Test the multiply method
        System.out.println();
        System.out.println("multiply method:");
        System.out.println(f.multiply(g) + " expected: -24/60");
        System.out.println(f.multiply(h) + " expected: 40/90");
        System.out.println(g.multiply(g) + " expected: 36/100");
        System.out.println(g.multiply(h) + " expected: 60/150");

        // Test the divide method
        System.out.println();
        System.out.println("divide method:");

        System.out.println(f.divide(g) + " expected: 40/-36");
        System.out.println(f.divide(h) + " expected: -60/60");
        System.out.println(g.divide(g) + " expected: -60/-60");
        System.out.println(g.divide(h) + " expected: -90/100");

        // Test the add method
        System.out.println();
        System.out.println("add method:");
        System.out.println(f.add(g) + " expected: 4/60");
        System.out.println(f.add(h) + " expected: 120/90");
        System.out.println(g.add(h) + " expected: 10/150");

        // Test the subtract method
        System.out.println();
        System.out.println("subtract method:");
        System.out.println(f.subtract(g) + " expected: 76/60");
        System.out.println(f.subtract(h) + " expected: 0/90");
        System.out.println(g.subtract(h) + " expected:-190/150");

        // numbers as a decimal
        System.out.println();
        System.out.println("Numbers as a decimal");
        System.out.println("F: "+ f.toDouble());
        System.out.println("G: "+ g.toDouble());
        System.out.println("H: "+ h.toDouble());
    }
}
