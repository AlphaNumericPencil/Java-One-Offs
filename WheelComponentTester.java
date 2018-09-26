import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;



public class WheelComponentTester extends JComponent
{  
   public void paintComponent(Graphics g)
   {  
    
      // Recover Graphics2D 
      Graphics2D g2 = (Graphics2D) g;
      
      
      Ellipse2D.Double circle1= new Ellipse2D.Double(0, 0,200,200);     
      g2.draw(circle1);
      
      
       Line2D.Double l1 = new Line2D.Double(0, 100, 200, 100);
       g2.setColor(Color.BLUE);   
       g2.draw(l1);
       
           Line2D.Double l2 = new Line2D.Double(100, 0, 100, 200);
       g2.setColor(Color.BLUE);   
       g2.draw(l2);
       

   }
   
}