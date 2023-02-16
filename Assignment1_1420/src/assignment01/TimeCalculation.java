/**
 * This class implements this cool idea: This program can convert my Unid into hours and minutes, when my unid is in seconds
 *
 * @author  Vivaan Rajesh
 * @version January 11, 2023
 */
package assignment01;

public class TimeCalculation {
    public static void main(String[] args) {
        int uID = 1445660;
        int seconds = uID % 60;
        int hours = uID / 60;
        int minutes = hours% 60;
        hours = hours/60;
        System.out.print("My uID number is u");
        System.out.print(uID);
        System.out.println(".");
        System.out.println(uID + " seconds is " + hours + " hour(s), " + minutes + " minute(s), and " + seconds + " second(s).");
    }
}
