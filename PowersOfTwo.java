/**
 * This class implements this cool idea: It calculates the powers of 2 from 2^0 to 2^16 inclusive
 * @author Vivaan Rajesh
 * @uId: u1445660
 * @version January 22, 2023
 */
package assignment03;

public class PowersOfTwo {
    public static void main(String[] args) {
        // create the index, and the power of the 2's
        int i = 0;
        int power = 1;
        // while index is less than power, and power is greater than 2^17 it prints the powers of 2
        while (i< power && power< 131072) {
            System.out.println(power);
            power=power*2;
            i++;
        }
    }
}
