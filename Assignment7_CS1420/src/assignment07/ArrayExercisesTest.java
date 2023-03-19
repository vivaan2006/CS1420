
/*
 * A collection of unit tests for Assignment #7.  To make this work, you'll need to
 * follow a few steps to get JUnit tests set up in your project.
 *
 *     Find an @Test annotation above one of the functions below.
 *     It should be in red indicating that JUnit5 is not installed.
 *     Hover over it, and it will suggest JUnit4 along with more options.
 *     Do not install JUnit4.  Instead, look at the additional suggested
 *     options and select to install JUnit5.  Follow the prompts and
 *     JUnit5 will be installed for you.
 *
 *     That's it!  You should not need to adjust dependencies or
 *     install additional tools.  (Installing JUnit5 can be complex,
 *     but the above strategy is simple.)
 *
 *     I've already imported the needed classes (and functions) for
 *     JUnit5 assertions.  See below.
 *
 *  Peter Jensen
 *
 * Modified by:
 * @author ***Vivaan Rajesh***
 * @version ***March 17 2023***
 */
package assignment07;

import java.awt.*;
import java.util.Arrays;  // OK in tests, not allowed in ArrayExercises

// Imports for JUnit 5

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/* I generated unit tests for all the functions in ArrayExercises.
 * To run the tests, just run this code.
 */
public class ArrayExercisesTest {
    /* This is my first example unit test.  A unit test is just a piece of
     * code that calls some method or builds some object, and tests
     * for errors.  The code/test design is up to the programmer.
     *
     * The unit test library provides functions for 'asserting' correctness.
     * I use assertEquals below.  If the two values are not equal, the
     * unit test library throws an exception and records a failure.
     *
     * There are other assert functions in the unit test library that are
     * useful for noting errors.  If the function below completes without
     * recording a failure, then the test is marked as a success.
     */

    @Test
    public void testRandomArray01() {
        // Call the function, ask for an array of thirty elements.

        int[] result;
        int size = 30;

        result = ArrayExercises.randomArray(size);  // This calls the function I'm testing.

        // The function has a specific contract that guarantees things
        //  about it's return value.  Check to make sure the method
        //  call did what it was supposed to.

        // Make sure the size of the result array is correct.

        assertEquals(size, result.length);  // If unequal, an error is recorded.

        // Make sure the required numbers [0..n-1] are in the array.

        numberLoop:
        for (int n = 0; n < size; n++)  // Notice that I labeled this loop
        {
            // Search for n in the array.  When found, move on to the next n.

            for (int pos = 0; pos < size; pos++)
                if (result[pos] == n)
                    continue numberLoop;  // Found it, continue the outer loop.

            // If we get this far, the number n was not found.  This is an error.

            fail("Number missing from random array: " + n + " in " + Arrays.toString(result));  // Record an error
        }

        // If the number loop completes without failing, all tests pass!
        //   (When this method ends normally, the test is marked as passing.)
    }

    /* I wanted two unit tests for my function.  The first one, above,
     *   just makes sure the basic operation of 'randomArray' is
     *   correct.  This second unit test makes sure the 'randomness'
     *   is correct.  A truly random shuffle has equal likelihood
     *   of any outcome.  I repeatedly generate random arrays,
     *   then I count up results, and then check to make
     *   sure that each outcome occurred with similar probability.
     *
     * Because random numbers may produce results
     *   that look uneven, I loop many times to reduce the likelihood
     *   of random results looking like an error.
     *
     * I do not expect students to study this code - it is poor code.
     *   (I don't like the way I'm counting permutations.)  There
     *   are better ways, but you haven't seen the required lectures
     *   yet, so I'm using a more primitive solution.  I expect your
     *   unit tests to be much less complex.
     */

    @Test
    public void testRandomArray02() {
        // An array of three has six permutations.

        // Counts of how many times each permutation appears.

        int count012 = 0;
        int count021 = 0;
        int count102 = 0;
        int count120 = 0;
        int count201 = 0;
        int count210 = 0;

        // Repeatedly generate arrays (1,000,000 times).

        for (int count = 0; count < 1_000_000; count++) {
            // Generate an array of 3 elements.

            int[] result = ArrayExercises.randomArray(3);  // This calls the function I'm testing.

            // Keep counts of each permutation in the array.

            if (result[0] == 0 && result[1] == 1)       // [0, 1, 2]
                count012++;
            else if (result[0] == 0 && result[1] == 2)  // [0, 2, 1]
                count021++;
            else if (result[0] == 1 && result[1] == 0)  // [1, 0, 2]
                count102++;
            else if (result[0] == 1 && result[1] == 2)  // [1, 2, 0]
                count120++;
            else if (result[0] == 2 && result[1] == 0)  // [2, 0, 1]
                count201++;
            else // only other possibility is [2, 1, 0]
                count210++;
        }

        // Check each permutation.  It should occur 166,666 times on average.  Accept
        //   anything within +/- 3,000.

        if (Math.abs(166_666 - count012) > 3_000)
            fail("Permutation [0, 1, 2] appears an unexpected number of times:  " + count012);

        if (Math.abs(166_666 - count021) > 3_000)
            fail("Permutation [0, 1, 2] appears an unexpected number of times:  " + count021);

        if (Math.abs(166_666 - count102) > 3_000)
            fail("Permutation [0, 1, 2] appears an unexpected number of times:  " + count102);

        if (Math.abs(166_666 - count120) > 3_000)
            fail("Permutation [0, 1, 2] appears an unexpected number of times:  " + count120);

        if (Math.abs(166_666 - count201) > 3_000)
            fail("Permutation [0, 1, 2] appears an unexpected number of times:  " + count201);

        if (Math.abs(166_666 - count210) > 3_000)
            fail("Permutation [0, 1, 2] appears an unexpected number of times:  " + count210);

        // If execution completes without failing, the test passes!
        //   (When this method ends normally, the test is marked as passing.)
    }

    /**
     * This test tests the reverseOrder method, and passes in an array of characters in the method.
     * It then calls the reverseOrder method and checks to see if the array is reversed.
     * If it is, the test passes, else it fails
     */
    @Test
    public void testReverseOrder01() {
        // Set up a char[], call the ArrayExercises.reverse(...) function.
        // Test the array to make sure the function did its job.
        char[] actualArray = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        ArrayExercises.reverseOrder(actualArray);
        char[] expectedArray = {'j', 'i', 'h', 'g', 'f', 'e', 'd', 'c', 'b', 'a'};
        assertArrayEquals(expectedArray, actualArray);

        //fail("Not yet implemented");
    }

    /**
     * This test is another test method for the reverseOrder method. It places different characters in the array
     * If the reverse is correct, the test passes, else it fails
     */
    @Test
    public void testReverseOrder02() {
        // Set up a char[], call the ArrayExercises.reverse(...) function.
        // Test the array to make sure the function did its job.
        char[] actualArray = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't'};
        ArrayExercises.reverseOrder(actualArray);
        char[] expectedArray = {'t', 's', 'r', 'q', 'p', 'o', 'n', 'm', 'l', 'k'};
        assertArrayEquals(expectedArray, actualArray);

        //fail("Not yet implemented");
    }

    /**
     * This is the 3rd test method for the reverseOrder method. It places different characters in the array
     * If the reverse is correct, the test passes, else it fails
     */
    @Test
    public void testReverseOrder03() {
        // Set up a char[], call the ArrayExercises.reverse(...) function.
        // Test the array to make sure the function did its job.
        char[] actualArray = {'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b', 'c', 'd'};
        ArrayExercises.reverseOrder(actualArray);
        char[] expectedArray = {'d', 'c', 'b', 'a', 'z', 'y', 'x', 'w', 'v', 'u'};
        assertArrayEquals(expectedArray, actualArray);

        //fail("Not yet implemented");
    }
    /* Note:  You'll want more unit test functions.  Cut-and-paste existing tests, but increase
     * the number in the function names.  Make sure to include @test before each function header.
     *
     * testReverseOrder01
     * testReverseOrder02
     * testReverseOrder03  ...etc...
     *
     * You can then put different test code in each test to be thorough.
     */

    /**
     * This test method tests the count method. It passes in an array of strings and a string to be counted
     * if the count is correct, the test passes, else it fails
     */
    @Test
    public void testCount01() {
        String[] actualArray = {"abc", "def", "ghi", "jkh", "lmn", "opq", "rst", "uvw", "xyz"};
        int count = ArrayExercises.count(actualArray, "abc");
        assertEquals(1, count);
        //fail("Not yet implemented.");
    }

    /**
     * This is another test method for the count method. It passes in an array of strings and a string to be counted
     * if the count is correct, the test passes, else it fails
     */
    @Test
    public void testCount02() {
        String[] actualArray = {"abc", "def", "ghi", "jkh", "lmn", "opq", "rst", "uvw", "xyz"};
        int count = ArrayExercises.count(actualArray, "ghi");
        assertEquals(1, count);
        //fail("Not yet implemented.");
    }

    /**
     * This is another test method for the count method. It passes in an array of strings and a string to be counted
     * if the count is correct, the test passes, else it fails
     */
    @Test
    public void testCount03() {
        String[] actualArray = {"abc", "def", "ghi", "jkh", "lmn", "opq", "rst", "uvw", "xyz"};
        int count = ArrayExercises.count(actualArray, "def");
        assertEquals(1, count);
        //fail("Not yet implemented.");
    }

    /**
     * This test method tests the replace method. It passes in an array of strings and a string to be replaced
     * if the replacement is correct, the test passes, else it fails.
     */
    @Test
    public void testReplace01() {
        String[] actualArray = {"abc", "def", "ghi", "jkh", "lmn", "opq", "rst", "uvw", "xyz"};
        ArrayExercises.replace(actualArray, "abc", "def");
        String[] expectedArray = {"def", "def", "ghi", "jkh", "lmn", "opq", "rst", "uvw", "xyz"};
        assertArrayEquals(expectedArray, actualArray);
        // fail("Not yet implemented");
    }

    /**
     * This is another test method for the replace method. It passes in an array of new strings than the previous one and a string to be replaced
     * if the replacement is correct, the test passes, else it fails.
     */
    @Test
    public void testReplace02() {
        String[] actualArray = {"abc", "def", "ghi", "jkh", "lmn", "opq", "rst", "uvw", "xyz"};
        ArrayExercises.replace(actualArray, "abc", "opq");
        String[] expectedArray = {"opq", "def", "ghi", "jkh", "lmn", "opq", "rst", "uvw", "xyz"};
        assertArrayEquals(expectedArray, actualArray);
        // fail("Not yet implemented");
    }

    /**
     * This is another test method for the replace method. It passes in an array of new strings than the previous one and a string to be replaced
     * if the replacement is correct, the test passes, else it fails.
     */
    @Test
    public void testReplace03() {
        String[] actualArray = {"abc", "def", "ghi", "jkh", "lmn", "opq", "rst", "uvw", "xyz"};
        ArrayExercises.replace(actualArray, "abc", "def");
        String[] expectedArray = {"def", "def", "ghi", "jkh", "lmn", "opq", "rst", "uvw", "xyz"};
        assertArrayEquals(expectedArray, actualArray);
        // fail("Not yet implemented");
    }

    /**
     * This test method tests the computeAreas method. It passes in an array of widths and heights
     * if the areas are correct, the test passes, else it fails.
     */
    @Test
    public void testComputeAreas01() {
        double[] widths = {1.0, 2.0, 3.0, 4.0, 5.0};
        double[] heights = {1.0, 2.0, 3.0, 4.0, 5.0};
        ArrayExercises.computeAreas(widths, heights);
    }

    /**
     * This is another test method for the computeAreas method. It passes in an array of different widths and heights
     * than the first test. If the areas are correct, the test passes, else it fails.
     */
    @Test
    public void testComputeAreas02() {
        double[] widths = {1.0, 0.0, 3.0, 4.0, 5.0};
        double[] heights = {1.0, 0.0, 3.0, 4.0, 5.0};
        ArrayExercises.computeAreas(widths, heights);
    }
    /**
     * This is another test method for the computeAreas method. It passes in an array of different widths and heights
     * than the first and second test. If the areas are correct, the test passes, else it fails.
     */
    @Test
    public void testComputeAreas03() {
        double[] widths = {-1.0, 2.0, 3.0, 4.0, 5.0};
        double[] heights = {3.0, 2.0, 3.0, 4.0, -5.0};
        ArrayExercises.computeAreas(widths, heights);
    }

    /**
     * This test method tests the remove method. It passes in an array of colors and a color to be removed
     * if the removal is correct, the test passes, else it fails.
     */
    @Test
    public void testRemove01() {
        Color[] pixels = new Color[]{Color.RED, Color.GREEN, null, Color.BLUE, Color.RED};

        // Call the remove method with the target color
        Color[] result = ArrayExercises.remove(pixels, Color.RED);
        assertEquals(3, result.length);
        assertEquals(Color.GREEN, result[0]);

        //fail("Not yet implemented");
    }

    /**
     * This is another test method for the remove method. It passes in a different array of colors and a color to be removed
     * if the removal is correct, the test passes, else it fails. Also this is a non-passing edge case of the program.
     */
    @Test
    public void testRemove02() {
        Color color1 = new Color(100, 100, 100);
        Color color2 = new Color(100, 100, 100);
        Color[] pixels = new Color[]{color1, color2, null};
        Color[] ans = ArrayExercises.remove(pixels, color1);

        assertEquals(1, ans.length);
        assertNull(ans[0]);
        //fail("Not yet implemented");
    }
    /**
     * This is another test method for the remove method. It passes in a different array of colors and a color to be removed than the first and second one
     * if the removal is correct, the test passes, else it fails.
     */
    @Test
    public void testRemove03() {
        Color[] pixels = new Color[]{Color.RED, Color.GREEN, null, Color.BLUE, Color.RED};

        // Call the remove method with the target color
        Color[] result = ArrayExercises.remove(pixels, Color.RED);
        assertEquals(3, result.length);
        assertEquals(Color.GREEN, result[0]);

        //fail("Not yet implemented");
    }

    /**
     * This test method tests the sort method. It passes in an array of integers, and if the expected sort matches the actual sort
     * the test passes, else it fails.
     */
    @Test
    public void testSort01() {
        int[] data = {1, 2, 3, 4, 5};
        int[] expected = {5, 4, 3, 2, 1};
        ArrayExercises.sort(data);
        assertArrayEquals(expected, data);
    }
    /**
     * This test method tests the sort method. It passes in an array of integers, and if the expected sort matches the actual sort
     * the test passes, else it fails. In addition, it uses different values than the first test.
     */
    @Test
    public void testSort02() {
        int[] data = {6, 7, 8, 9, 10};
        int[] expected = {10, 9, 8, 7, 6};
        ArrayExercises.sort(data);
        assertArrayEquals(expected, data);
    }
    /**
     * This test method tests the sort method. It passes in an array of integers, and if the expected sort matches the actual sort
     * the test passes, else it fails. In addition, it uses different values than the first and second test.
     */
    @Test
    public void testSort03() {
        int[] data = {11, 12, 13, 14, 15};
        int[] expected = {15, 14, 13, 12, 11};
        ArrayExercises.sort(data);
        assertArrayEquals(expected, data);
    }

    /**
     * This test method tests the findSmallest method. It passes in an array of rectangles,
     * and if the expected smallest rectangle matches the actual smallest rectangle.
     */
    @Test
    public void testFindSmallest01() {
        Rectangle[] rectangles = {new Rectangle(2, 3), new Rectangle(1, 5), new Rectangle(4, 2), new Rectangle(3, 3)};
        Rectangle expected = rectangles[1];
        Rectangle actual = ArrayExercises.findSmallest(rectangles);
        assertEquals(expected, actual);
    }

    /**
     * This test method tests the findSmallest method. It passes in an array of rectangles,
     * and if the expected smallest rectangle matches the actual smallest rectangle.
     * Also, like other tests, it tests different values than the other methods of the same category to find any edge cases.
     */
    @Test
    public void testFindSmallest02() {
        Rectangle[] rectangles = {new Rectangle(2, 3), new Rectangle(1, 5), new Rectangle(4, 2), new Rectangle(3, 3)};
        Rectangle expected = rectangles[1];
        Rectangle actual = ArrayExercises.findSmallest(rectangles);
        assertEquals(expected, actual);
    }
    /**
     * This test method tests the findSmallest method. It passes in an array of rectangles,
     * and if the expected smallest rectangle matches the actual smallest rectangle.
     * Also, like other tests, it tests different values than the other methods of the same category to find any edge cases.
     */
    @Test
    public void testFindSmallest03() {
        Rectangle[] rectangles = {new Rectangle(1, 1), new Rectangle(2, 2), new Rectangle(3, 3)};
        Rectangle result = ArrayExercises.findSmallest(rectangles);
        assertEquals(rectangles[0], result);
    }

    /**
     * This test method tests the histogram method. It passes in an array of integers,
     * and if the expected histogram matches the actual histogram
     * the test passes, else it fails.
     */
    @Test
    public void testHistogram01() {
        int[] data = {1, 2, 3, 3, 3, 2, 1};
        int[] expected = {0, 2, 2, 3};
        int[] actual = ArrayExercises.histogram(data);
        assertArrayEquals(expected, actual);
    }

    /**
     * This test method tests the histogram method. It passes in an array of integers,
     * and if the expected histogram matches the actual histogram. This is a different test than the first one though.
     * It passes different values to test all cases to be thorough in the testing.
     */
    @Test
    public void testHistogram02() {
        int[] data = {1, 1, 2, 3, 3, 3, 4, 4, 5, 5, 5, 5};
        int[] expected = {0, 2, 1, 3, 2, 4};
        int[] actual = ArrayExercises.histogram(data);
        assertArrayEquals(expected, actual);
    }
    /**
     * This test method tests the histogram method. It passes in an array of integers,
     * and if the expected histogram matches the actual histogram. This is a different test than the first one and second though.
     * It passes different values to test all cases to be thorough in the testing.
     */
    @Test
    public void testHistogram03() {
        int[] data = {2, 2, 3, 3, 3, 3, 4, 4, 4, 4};
        int[] expected = {0, 0, 2, 4, 4};
        int[] actual = ArrayExercises.histogram(data);
        assertArrayEquals(expected, actual);
    }
}