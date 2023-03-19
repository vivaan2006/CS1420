/**
 * This class consists of the positions of the shapes and the color of the shapes, shown in the methods
 * @author Peter Jensen, Vivaan Rajesh
 * @version Spring 2023
 */
package lab09;

import java.awt.*;

public class Rect extends Shape{
    // Instance variables.
    private int width;
    private int height;

    /**
     * Constructor - initializes the position, diameter, and
     * color of this circle object.
     *
     * @param x
     *         the x coordinate of this object's position
     *
     * @param y
     *         the x coordinate of this object's position
     *
     * @param color
     *             the color of this circle
     * @param width
     *            the width of this rectangle
     * @param height
     *           the height of this rectangle
     */
    public Rect(int x, int y, int width, int height, Color color)
    {
        super(x, y, color);
        this.width = width;
        this.height = height;
    }


    /**
     * Changes the position of this shape by
     * the specified amount.  Note that this does
     * not set the position absolutely, the deltas
     * specify how far to move the shape from its
     * current position.
     *
     * @param deltaX
     *              how far to move the shape horizontally
     *
     * @param deltaY
     *              how far to move the shape vertically
     */


    /**
     * Draws the circle at it's current position and color
     * to the specified graphics object.
     *
     * @param g
     *         the graphics object (where to draw to)
     */
    public void draw (Graphics g)
    {
        g.setColor (color);
        g.fillRect(this.x, this.y, this.width, this.height);
    }

    /**
     * Returns true if the coordinates are within the circle.
     *
     * @param targetX
     *               an x coordinate
     *
     * @param targetY
     *               a y coordinate
     *
     * @return
     *        true if the coordinates are within the shape
     */
    public boolean isInside (int targetX, int targetY)
    {
//        int cx = x + radius;  // Calculate the center point
//        int cy = y + radius;
//
//        int deltaX = cx - targetX;  // Calculate the deltas to the click
//        int deltaY = cy - targetY;
//
//        // Make sure the distance from the click to the center is less
//        //   than the radius.  (Notice how I avoid a square root.)
//
//        return (deltaX * deltaX + deltaY * deltaY) <= radius * radius;
        return targetX >= x &&
                targetX < x + width &&
                targetY >= y &&
                targetY < y + height;
    }
}

