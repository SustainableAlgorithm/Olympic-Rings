// Kathleen Kagan
// ACO 102 - Spring 2020
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.Timer;

/**
   This frame is supposed to make the rings move.
   But it does not. 
*/
public class OlympicRingsFrame extends JFrame
{
   private static final int FRAME_WIDTH = 400;
   private static final int FRAME_HEIGHT = 400;

   private OlympicRingsComponent rings;

   class TimerListener implements ActionListener
   {
      public void actionPerformed(ActionEvent event)
      {
         rings.moveRingsBy(1, 1);
         repaint();
      }
   }
   
   public OlympicRingsFrame()
   {
      rings = new OlympicRingsComponent();
      add(rings);
      setSize(FRAME_WIDTH, FRAME_HEIGHT);
      ActionListener listener = new TimerListener();
      final int DELAY = 100; // Milliseconds between timer ticks
      Timer t = new Timer(DELAY, listener);
      t.start();
   }
}

