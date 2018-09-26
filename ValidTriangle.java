/**
 George Rohn
 */


import java.util.Scanner;
import java.lang.Math;


  
 public class ValidTriangle {
  
  
  public static void main(String[] args) { 
    
    Scanner in= new Scanner(System.in);
    System.out.println("Please input the three triangle sides.");
    
    
    double side1 = in.nextDouble();
    double side2 = in.nextDouble();      
    double side3 = in.nextDouble();
    
    
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
