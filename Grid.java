package lab10;

/**
 * A grid object represents the cell grid of a life simulation.
 * The grid is a 2D array of cells.  The grid object keeps track
 * of the state of each cell (alive, dead), and allows the user
 * to make one step in the life simulation.
 * <p>
 * Note that this class does not do any drawing or other I/O.
 * It just represents a grid.
 *
 * @author Peter Jensen and (Vivaan Rajesh)
 * @version (March 19 2023)
 */
public class Grid {
    // Instance variables here.
    private int width;
    private int height;
    private int[][] grid;


    /**
     * Constructor - creates an empty grid of the
     * specified dimensions.
     *
     * @param width  The width of the new grid
     * @param height The height of the new grid
     */
    public Grid(int width, int height) {
        //width and height variables are set to the instance variables in the constructors.
        this.width = width;
        this.height = height;
        this.grid = new int[width][height];
    }

    /**
     * Returns true if the specified cell in the grid
     * is alive, false otherwise.  If the coordinates
     * are illegal (outside the grid), false is returned.
     *
     * @param row    a row number
     * @param column a column number
     * @return true iff that cell is alive
     */
    public boolean isAlive(int row, int column) {
        // try catch to catch the exception if the row and column are out of bounds. Tests if cell is alive or not
        try {
            if (grid[row][column] == 1) {
                return true;
            } else {
                return false;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            return false;
        }
    }

    /**
     * Returns the width of the grid.
     *
     * @return the width of this grid
     */
    public int getWidth() {
        return grid[0].length;  // returning the width
    }

    /**
     * Returns the height of the grid.
     *
     * @return the height of this grid
     */
    public int getHeight() {
        return grid.length;  // returning the height
    }

    /**
     * Sets the state of the specified cell in the
     * grid.
     *
     * @param row     a row number
     * @param column  a column number
     * @param isAlive true if the grid cell should be alive
     */
    public void setCellState(int row, int column, boolean isAlive) {
        if (isAlive) { // grid at row and column is set to 1 if isAlive is true. Otherwise, it is set to 0.
            grid[row][column] = 1;
        } else {
            grid[row][column] = 0;
        }
    }

    /**
     * Clears the grid, all cells marked as dead.
     */
    public void clear() {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                grid[i][j] = 0;
            }
        }
    }

    /**
     * Performs one 'life' step using the standard rules
     * of life:
     * <p>
     * Any live cell with fewer than two neighbors dies, as if by loneliness.
     * Any live cell with more than three neighbors dies, as if by overcrowding.
     * Any live cell with two or three neighbors lives, unchanged, to the next generation.
     * Any dead cell with exactly three neighbors comes to life.
     * <p>
     * Care must be taken to make sure the next generation is kept separate from the
     * current generation.
     */
    public void stepOneGeneration() {
        // Create a spare grid
        // Loop through each grid location
        // Count the neighbors of the current location (using the helper function 8 times)
        // Set the alive/dead state in the spare grid according to the rules
        // Store the spare grid in the grid field (replacing the old grid with the new one)

        int[][] otherGrid = grid;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                // Count the neighbors of the current location (using the helper function 8 times)
                // testing for all arrangements.
                int neighbors = 0;
                if (isAlive(i - 1, j - 1)) {
                    neighbors++;
                }
                if (isAlive(i - 1, j)) {
                    neighbors++;
                }
                if (isAlive(i - 1, j + 1)) {
                    neighbors++;
                }
                if (isAlive(i, j - 1)) {
                    neighbors++;
                }
                if (isAlive(i, j + 1)) {
                    neighbors++;
                }
                if (isAlive(i + 1, j - 1)) {
                    neighbors++;
                }
                if (isAlive(i + 1, j)) {
                    neighbors++;
                }
                if (isAlive(i + 1, j + 1)) {
                    neighbors++;
                }
                // setting the alive and dead state of cells in other grid.
                if (otherGrid[i][j] == 1) {
                    if (neighbors < 2) {
                        otherGrid[i][j] = 0;
                    } else if (neighbors < 4) {
                    } else {
                        otherGrid[i][j] = 0;
                    }
                } else {
                    if (neighbors == 3) {
                        otherGrid[i][j] = 1;
                    }
                }
            }
        }
        // setting the grids equal
        grid = otherGrid;
    }
}
