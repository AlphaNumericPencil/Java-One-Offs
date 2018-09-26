//George Rohn

import java.util.Scanner;

public class Prob2 {
  
  
  public static void main(String[] args) { 
    
    int skipnum;
  
    
       Scanner in= new Scanner(System.in);
    System.out.println("Please input a number between 1-10.");
    
    skipnum= in.nextInt();
    
    for ( int counter= 0; counter <= 10; counter++ )
    {
      if (counter != skipnum)
      {
      System.out.println(counter);
      }
    }
  }
}