import javax.swing.JFrame;

public class WheelViewer
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      frame.setSize(500, 500);
      frame.setTitle("The Wheel");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      WheelComponent component = new WheelComponent();
      frame.add(component);

      frame.setVisible(true);
   }
}