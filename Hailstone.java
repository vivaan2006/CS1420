/**
 * This class implements this cool idea: It computes the hailstone sequence given a starting number.
 * It also prints the number of iterations to get to 1.
 * @author Vivaan Rajesh
 * @uId: u1445660
 * @version January 22, 2023
 */
package assignment03;
import java.util.Scanner;
public class Hailstone {
    public static void main(String[] args) {
        // create boolean and other variables with N having a value of -1
        boolean isValid = false;
        boolean complete = false;
        int numbers=0;
        int N = -1;
        //create scanner
        Scanner input = new Scanner(System.in);
        // while the input is not valid it loops the question again and again
        while (!isValid) {
            System.out.println("Enter a positive number");
             N = input.nextInt();
             // if the input is positive, it gets out of the while loop
            if (N>0) {
                isValid = true;
                input.close();
            }
            else{
                System.out.println(N + " is incorrect");
                isValid = false;
            }
        }
        System.out.print(N + " ");
        // while the program is not complete it does these calculations
        while(!complete){
            if(N%2 ==0){
                N = N/2;
                numbers++;
                System.out.print(N+" ");
            }
            // if the input is 1 it prints only one and the program finishes
            else if(N ==1){
                complete = true;
            }
            else if(N%2 != 0){
                N = (N*3) +1;
                numbers++;
                System.out.print(N + " " );
            }
        }
        // printing the number of iterations
        System.out.println("The number of iterations are: " + numbers);
        }
    }
