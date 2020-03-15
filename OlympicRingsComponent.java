// Kathleen Kagan
// ACO 102 - Spring 2020

import java.awt.*;
import javax.swing.JComponent;

/**
   A component that shows the Olympic Rings.
*/
public class OlympicRingsComponent extends JComponent
{
   private int xLeft;
   private int yTop;
   private int width;
   
   public OlympicRingsComponent()
   {
      xLeft = 0;
      yTop = 0;
   }
   public void paintComponent(Graphics g)
   {
      drawOlympicRings(g, 0, 40, 75);
   }

      /**
      Draws Olympic Rings at the given location and size
      @param g the graphics object
      @param xLeft the x coordinate of the top left corner
      @param yTop the y coordinate of the top left corner
      @param width the width of the circle
   */
   void drawOlympicRings(Graphics g, int xLeft, int yTop, int width)
   { 
      super.paintComponent(g);
      Graphics2D g2 = (Graphics2D) g;
      g2.setStroke(new BasicStroke(5));
      
      // draw the rings
      g.setColor(Color.BLUE); 
      g.drawOval(xLeft, yTop, width, width);
      
      g.setColor(Color.BLACK);
      g.drawOval(xLeft + 1 * width, yTop, width, width);
      
      g.setColor(Color.RED);
      g.drawOval(xLeft + 2 * width, yTop, width, width);
      
      g.setColor(Color.YELLOW);
      g.drawOval(xLeft + 1 * width / 2, yTop + 2 * width / 4, width, width);
      
      g.setColor(Color.GREEN);
      g.drawOval(xLeft + 3 * width / 2, yTop + 2 * width / 4, width, width);
        
   }
   
   // move the rings to another location
   public void moveRingsBy(int dx, int dy)
   {
      xLeft = xLeft + dx;
      yTop = yTop + dy;
      repaint();
   }
      
}