/**
 * This class implements the cool idea that: Allows the creator to make whatever they want on the JFrame
 * and is visible to the users. In this specific program, I drew a house with a tree and some clouds.
 */
package assignment04;

import javax.swing.*;
import java.awt.*;
public class Draw extends JPanel {
// paint component method that adds the color to the shapes
    public void paintComponent(Graphics g) {
        // items for the house
        g.setColor(new Color(255, 67, 67)); //main square block
        g.fillRect(420,360,350,400); //red block dimensions
        g.setColor(new Color(53, 117, 255));
        g.fillRect(480,400,75,75); //window left
        g.fillRect(650,400,75,75); //window right
        g.fillRect(540,580,120,178); // center block
// triangle dimensions
        Polygon triangle = new Polygon();
        triangle.addPoint(420,360);
        triangle.addPoint(770,360);
        triangle.addPoint(600,80);
        g.fillPolygon(triangle);

        g.setColor(Color.BLACK);
// creating a width and height methods.
        int width = getWidth();
        int height = getHeight();
// adding color to the tree trunk and setting its bounds
        g.setColor(new Color(100, 38, 0));
        g.fillRect(100,380,50,400);
// setting the color for the tree.
        g.setColor(new Color(0, 108, 0));
        // radius for tree branches
        int radius = 100;
        g.fillOval(0,250,250,250);
// cloud 1 leftmost
        g.setColor(new Color(101, 255, 255));
        g.fillOval(70,70,100,100);
        g.fillOval(100,70,100,100);
        g.fillOval(130,60,100,100);
        g.fillOval(180,60,100,100);
// cloud 2 middle
        g.setColor(new Color(101, 255, 255));
        g.fillOval(240,180,100,100);
        g.fillOval(260,180,100,100);
        g.fillOval(360,170,100,100);
        g.fillOval(310,170,100,100);
// for loop to print the door handle with color in it.
        for(int i = 0; i<5; i++){
            g.setColor(new Color(131, 63, 0));
            g.fillOval(630,670,10,10);
        }
        g.dispose();
        }
    }
