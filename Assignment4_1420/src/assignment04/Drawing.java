/**
 * This class implements the cool idea that: Creates the frame that allows us to draw on it, and
 * allows the person running the program to see what is being drawn.
 */
package assignment04;

import java.awt.Color;
import javax.swing.*;
public class Drawing {
    public static void main(String[] args) {
        new Drawing();
    }
    public Drawing() {
        // creating the jframe
                JFrame frame = new JFrame("House");
                // setting the frames size
                frame.setSize(800, 800);
                // allowing the frame to close
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                // setting the background color
                frame.setBackground(new Color(159, 188, 255));
                // creating a new instance of the draw class.
                Draw draw = new Draw();
                frame.add(draw);
                // allowing the drawing to be visible
                frame.setVisible(true);
            }
        }

