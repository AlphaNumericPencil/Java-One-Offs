/**
George Rohn
 */

import java.util.Scanner;
import java.lang.Math;


public class OddEven {
  
  
  public static void main(String[] args) { 
    
    final int checker= 2;
    
       Scanner in= new Scanner(System.in);
    System.out.println("Please input a number.");
    
    
      int mystery = in.nextInt();
      
      int remainder= mystery % checker;
      
      if (remainder== 0)
      {
        System.out.println("This is an even number!");
      }
      else
      {
        System.out.println("This is an odd number!");
      }
    
    
  }
}
