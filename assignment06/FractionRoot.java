package assignment06;

import java.util.Scanner;

public class FractionRoot {
    public static void main(String[] args) {
        Fraction fraction = new Fraction(5, 10);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Numerator: ");
        long userNumerator = input.nextLong();
        System.out.println("Enter a denominator: ");
        long userDenominator = input.nextLong();
        System.out.println("Enter an approximation count");
        int approximationCount = input.nextInt();
        Fraction S = new Fraction(userNumerator,userDenominator);
        int Z = approximationCount;

    }
}
