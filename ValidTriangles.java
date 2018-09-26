

import java.util.Scanner;
import java.lang.Math;


public class ValidTriangles {
  
  
  public static void main(String[] args) { 
    
    double side1= 0;
    double side2= 0;
    double side3= 0;
    
    Scanner in= new Scanner(System.in);
;
    
    
    
    
    while (side1 != -1 || side2 != -1 || side3 != -1){
       
      System.out.println("Please input the three triangle sides. -1 to quit.");
      
      side1 = in.nextDouble();
    side2 = in.nextDouble();      
    side3 = in.nextDouble();
    
    
    if (side1+side2 > side3)
    {
      System.out.println("This is a triangle.");
    }
    else if (side2 + side3 > side1)
    {
      System.out.println("This is a triangle.");
    }
    else if (side1 + side3 > side2)
    {
      System.out.println("This is a triangle.");
    }
    else
    {
      System.out.println("This is not a triangle.");
    }
    
  }
    
  }
}
