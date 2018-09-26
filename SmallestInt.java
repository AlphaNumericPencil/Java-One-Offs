//George Rohn

import java.util.*;
import java.lang.Math;


public class SmallestInt
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a value for x:");
    int x = scan.nextInt();
    System.out.println("Enter a value for y:");
    int y = scan.nextInt();
    System.out.println("Enter a value for z:");
    int z= scan.nextInt();
    
    //Search for the smallest variable
    int min= x;
    
    if (y < min) 
    {
      min= y;
    }
    
    if (z < min) 
    {
      min= z;
    }
    
    System.out.println("The smallest value was "+(min));
    
  }
}
