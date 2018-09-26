import javax.swing.JFrame;

public class FaceViewer
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      frame.setSize(500, 500);
      frame.setTitle("An Alien Face");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      WheelComponentTester component = new WheelComponentTester();
      frame.add(component);

      frame.setVisible(true);
   }
}