/**
 * This application plays a wordle-like game with the user.
 * A list of five letter words must exist in "five.txt" for this
 * application to run correctly.
 * <p>
 * Note that students will complete this application as part of
 * assignment #5.
 *
 * @author Peter Jensen and ---Vivaan Rajesh---
 * @version February 6, 2023
 */
package assignment05;
// create the necessary imports

import java.io.File;
import java.util.Scanner;

/**
 * My wordle clone application.
 */
public class WordleClone {
    /**
     * Application entry point
     *
     * @param args unused
     */
    public static void main(String[] args) {
        // Prepare the console scanner (note the variable name)

        Scanner console = new Scanner(System.in);

        // Print a nice welcome message.

        System.out.println("Welcome to my Wordle clone.");
        System.out.println("You have six guesses to guess the secret word.");
        System.out.println("Each guess is scored and printed back to you:");
        System.out.println("  Incorrect letters are replaced with -,");
        System.out.println("  Correctly placed letters are capitalized,");
        System.out.println("  Correct but misplaced letters are lowercase.");

        // Choose the winning, secret word from a text file of words.

        String secretWord = pickRandomWord("five.txt");  /* TODO:  Write this function below. Done  */
        System.out.println(secretWord);
        // For debugging you can uncomment and change the next line
        //   to force the answer to be something you can predict.
        // You may also want to uncomment the line that shows the
        //   answer (for testing).

        //secretWord = "shine";
        //System.out.println(secretWord);

        // Loop, allow the user to make guesses.

        int guessCount = 1;  // Which guess they're on.

        while (guessCount <= 6) {
            // Give prompt, input a guess.  For input robustness, take the first word
            //   on each line.  (Input a line, then scan the first word from that line.)

            System.out.print("Enter guess #" + guessCount + ": ");
            String line = console.nextLine();
            if (line.trim().length() == 0)  // Skip blank lines (remove whitespace from ends, check length)
                continue;
            Scanner lineScanner = new Scanner(line);  // A second, temporary Scanner
            String guess = lineScanner.next();
            lineScanner.close();

            // Validate the guess. (Check the word against the list of words.)
            // If the guess is not a valid word, restart the loop.

            /* TODO: Write the logic that validates the user's guess.  (One simple 'if' statement and a few controlled statements.  done) */
            if (!isValidWord(guess, "five.txt")) {
                System.out.println("invalid guess, try again");
                continue;
            }
            guessCount++;
            // They've made a guess, count it. Inside the loop

            // Score it and display the results.

            String scoredGuess = scoreGuess(guess, secretWord);
            System.out.println("Guess: " + guess);
            System.out.println("Score: " + scoredGuess);

            // Check for a win.  If the scoredGuess is all uppercase and
            //   matches the secret word, it's a win.  Display a message and
            //   end the program.
            // Hint:  Use .toUpperCase() to make an uppercase copy of a string.

            /* TODO: Write the logic that checks for a win.  (A few statements total, including one 'if' statement.) */
            // created an upper case copy of the word
            String upperGuess = guess.toUpperCase();
            // if the guess is the scored guess, print win message.
            if (guess.equals(scoredGuess) || upperGuess.equals(scoredGuess)) { //is this it?
                System.out.println("You Win." + " The correct word was " + secretWord + ".");
                console.close();
                return;
            }
        }

        //losing message, so if the user uses the guesses, the program ends.
        if (guessCount > 6) {
            System.out.println("You have used up all your guesses.");
        }
        // If the guess loop ends, they've used all their guesses
        //   (and not won).  Inform them of that.

        System.out.println("You lost.  The word was " + secretWord + ".");
        console.close();
    }

    /**
     * This function generates the random word from the txt file.
     *
     * @param fileName is used to refer to the file we use that contains the words
     * @return the random word picked from the .txt file.
     */
    public static String pickRandomWord(String fileName) { //write contract and method header not printing a variety of words
        String next = "";
        int count = countWords(fileName);
        int random = (int) (Math.random() * count);
        try (Scanner in = new Scanner(new File(fileName))) {
            int i = 0;
            while (i < count) {
                if (i == random) {
                    next = in.next();
                    break;
                }
                in.next();
                i++;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        //return input;
        return next;
    }

    /**
     * Given a filename, this method returns a count of the number of
     * words in the file.  (Note that word length is not checked here.)
     *
     * @param filename the name of an existing text file
     * @return the count of words in the file
     */
    public static int countWords(String filename) {
        //initializing variable count.
        int count = 0;
        // declaring a scanner and making it read the .txt file in the try.
        try (Scanner in = new Scanner(new File(filename))) {
            // while there is another word, increment count and ask for input again.
            while (in.hasNext()) {
                in.next();
                count++;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return count;
    }

    /* TODO: Write the contract, function header, and function that picks a random
     * word.  You'll need to know how many words are in the file, make a call
     * to countWords above for that step.  Look in 'main' to figure out
     * the function name, parameters, and return type.  This function is static.
     */

    /**
     * Given a word and a filename, this method determines if the word
     * is in the file.  True is returned if the word is in the file,
     * and false is returned otherwise.
     * <p>
     * Note that the word should not have any whitespace in it, or it
     * won't match anything scanned from the file.  (No special check
     * is done here for that case.)  The reason is that this function
     * uses the .next() function from the Scanner class, and this
     * strips away whitespace.
     *
     * @param word     a String without whitespace
     * @param filename the name of an existing text file
     * @return true iff the word was found in the file.
     */
    public static boolean isValidWord(String word, String filename) {
        /* TODO: Complete this function */
        boolean returnValue = false;
        try (Scanner scan = new Scanner(new File(filename))) {

            while (scan.hasNext()) {
                if (scan.next().equals(word)) {
                    return true;
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return returnValue; //fix later.
    }

    /**
     * This method returns a copy of the input String, but with the
     * character at the specified position changed to the given letter.
     * Position must be a valid position in the String or the results
     * are undefined.
     * <p>
     * Note that this function does not alter the original String, it
     * just returns a copy with a letter replaced.  Here is an example
     * of how this method can be used.
     * <p>
     * word = replaceLetter(word, 1, 'a');
     * <p>
     * If word originally contained "put", the word would now contain
     * "pat".
     *
     * @param s        any non-empty string
     * @param position a valid position in the string
     * @param letter   a letter to put in the string
     * @return a copy of the original string, with a letter replaced
     */
    public static String replaceLetter(String s, int position, char letter) {
        return s.substring(0, position) + letter + s.substring(position + 1, s.length());
    }

    /**
     * Given a user's guess and a Wordle answer, this method 'scores' the guess.
     * It returns something that looks like a copy of the guess:  Guess characters
     * appear to be replaced with a '-' if they do not exist in the answer.  They
     * remain unchanged if they exist in the answer but are in the wrong spot.
     * They are changed to uppercase if they're in the correct spot.
     * <p>
     * This function requires five character strings of letters.
     * <p>
     * For example:
     * answer: miter
     * guess:  timid
     * score:  tIm--
     * <p>
     * Note that each letter in the guess or answer is only scored once.  Thus,
     * even though there were multiple i's in the guess, only one was scored.
     *
     * @param guess  a five letter string
     * @param answer a five letter string
     * @return the wordle score for that guess
     */
    public static String scoreGuess(String guess, String answer) {
        // The score (before we start) is a five character string of dashes.
        // (Create a score variable, initialize it to five dashes.)

        String score = "-----";


        // Score the correct letters first.  If there is a match,
        // put a capital letter in the score, then 'remove' the matching
        // letter in the answer.  For example:
        //    answer:                  abcde
        //    guess:                   ecccc
        //    adjust score like this:              --C--
        //    remove matching letter from answer:  ab-de
        //    remove matching letter from guess:   ec-cc
        // This way, that letter cannot be matched again later.
        // Notes:  We'll loop and do this for each position.  Also,
        // the replaceLetter helper function will be very useful here.
        // Finally, Character.toUpperCase(someChar) returns an
        // uppercase version of a character.

        /* TODO: Complete this scoring step. */
        for (int i = 0; i < 5; i++) {
            if (guess.charAt(i) == answer.charAt(i)) {
                score = replaceLetter(score, i, Character.toUpperCase(answer.charAt(i)));
                answer = replaceLetter(answer, i, '-');
                guess = replaceLetter(guess, i, '-');
            }
        }

        // Next score misplaced letters.  If there is a match,
        // put a capital letter in the score, then 'remove' the matching
        // letter in the answer.  For example:
        //    answer:                  ab-de
        //    guess:                   ec-cc
        //    adjust score like this:              e-C--
        //    remove matching letter from answer:  ab-d-
        //    remove matching letter from guess:   -c-cc
        // Again, every time an answer letter matches, remove it by
        // replacing it with a dash so that it won't match again.
        // Notes:  You'll need a doubly-nested loop for this.  One loop
        // loops on the answer position, the other loops on the guess
        // position.  (It doesn't matter which is the inner loop.)
        // You'll also want to skip any positions that have a '-' in them.
        // (Just 'continue' in that case.)

        /* TODO: Complete this scoring step. */
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (guess.charAt(i) == '-') {
                    continue;
                }
                if (answer.charAt(j) == '-') {
                    continue;
                }

                if (guess.charAt(i) == answer.charAt(j)) {
                    score = replaceLetter(score, i, guess.charAt(i));
                    answer = replaceLetter(answer, j, '-');
                    guess = replaceLetter(guess, i, '-');
                }

            }
        }
        // Done with scoring.  Return the score string.
        return score;
    }

}
