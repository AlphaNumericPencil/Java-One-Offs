import javax.swing.JFrame;

public class ColoredCirclesViewer
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      frame.setSize(500, 1000);
      frame.setTitle("Wheel");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      WheelComponent component = new WheelComponent();
      frame.add(component);

      frame.setVisible(true);
   }
}