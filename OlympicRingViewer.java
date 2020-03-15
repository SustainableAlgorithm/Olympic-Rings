// Kathleen Kagan
// ACO 102 - Spring 2020

import javax.swing.JFrame;

/**
   This program shows a frame that displays the Olympic Rings .
*/
public class OlympicRingViewer
{
   public static void main(String[] args)
   {
      JFrame frame = new OlympicRingsFrame();
      frame.setTitle("Olympic Rings");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
   
}