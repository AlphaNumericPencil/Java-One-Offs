import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import java.awt.geom.Line2D;
import java.awt.Color;


public class TriangleComponent extends JComponent
{  
  public void paintComponent(Graphics g)
  {  
    // Recover Graphics2D
    Graphics2D g2 = (Graphics2D) g;
    

Line2D.Double segment1= new Line2D.Double(40,40,40,200);  //Line1                      //x1,y1,x2,y2
g2.setColor(Color.RED);
g2.draw(segment1);

Line2D.Double segment2= new Line2D.Double(40, 40,100,200);  //Line2
g2.setColor(Color.BLUE);
 g2.draw(segment2);  
   
 
 Line2D.Double segment3= new Line2D.Double(100,200,40,200);  //Line3
 g2.setColor(Color.GREEN);
 g2.draw(segment3);

  
  }
}