import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;

public class ColoredCirclesComponent extends JComponent
{  
   public void paintComponent(Graphics g)
   {  
    
      // Recover Graphics2D 
      Graphics2D g2 = (Graphics2D) g;
      
      
      Ellipse2D.Double circle1= new Ellipse2D.Double(75,75,200,200);
        g2.setColor(Color.GREEN);
      g2.draw(circle1);
      
          

   }
}