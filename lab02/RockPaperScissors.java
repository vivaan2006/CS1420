/**
 * This program plays a simple game of rock-paper-scissors (roshambo)
 * with the user.  (Students will complete this program as part of
 * lab #2.)  See the lab instructions.
 *
 * Peter Jensen and (student name here)
 * January 17, 2023
 */
package lab02;

import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        // Create a Scanner object.

        Scanner input = new Scanner(System.in);

        // Create two String variables.  Name them computerWord and userWord.
        // Initialize them to empty strings, i.e. "".

        String computerWord = "";
        String userWord = "";

        // Make a random integer between [0...2].  If the random integer is a
        //   0, set computerWord to "rock", if it's a 1, set computerWord
        //   to "paper", otherwise set computerWord to "scissors".

        int randomInteger = (int) (Math.random() * 3);
        if (randomInteger == 0) {
            computerWord = "rock";
        }
        if (randomInteger == 1) {
            computerWord = "paper";
        }
        if (randomInteger == 2) {
            computerWord = "scissors";
        }
      
        // Using a Boolean flag, create an input loop that asks the player to enter
        //   their guess.  Print reasonable instructions.  Do not allow the program
        //   to proceed until the player enters either "rock", "paper", or "scissors".
        //   Store it in userWord.

        boolean userInputIsOK = false;
        while ( ! userInputIsOK ) {
            System.out.println("Enter rock, paper or scissors");
            userWord = input.next();

            if (userWord.equals("rock")) {
                userInputIsOK = true;
            }
            if (userWord.equals("paper")) {
                userInputIsOK = true;
            }
            if (userWord.equals("scissors")) {
                userInputIsOK = true;
            }
        }
        System.out.println("you picked: " + userWord);
        System.out.println("Computer picked: " + randomInteger);
            /** Two lines go here **/


        if (userWord.equals("rock") && computerWord.equals("scissors"))
            System.out.println("You win.");

        if (userWord.equals("paper") && computerWord.equals("scissors"))
            System.out.println("You lose.");

        if (userWord.equals("scissor") && computerWord.equals("scissors"))
            System.out.println("Draw");

        if (userWord.equals("rock") && computerWord.equals("rock"))
            System.out.println("draw");

        if (userWord.equals("paper") && computerWord.equals("rock"))
            System.out.println("You win.");

        if (userWord.equals("scissor") && computerWord.equals("rock"))
            System.out.println("You lose.");

        if (userWord.equals("rock") && computerWord.equals("paper"))
            System.out.println("You lose.");

        if (userWord.equals("paper") && computerWord.equals("paper"))
            System.out.println("Draw");

        if (userWord.equals("Scissor") && computerWord.equals("paper"))
            System.out.println("You win.");

            // Write a few 'if' statements to determine the result of the game and
            //   print out the winner:  "I win",  "You win", "It's a tie"
            // If the strings contain equal text, its a tie.
            //  else if the player picks "rock" and the computer picks "scissors", the player wins,
            //  else if ... (etc.)

            /** Many lines go here.  Use the ideas from the lab instructions and from experiment #3 **/
    }
}