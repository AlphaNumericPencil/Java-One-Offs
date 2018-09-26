// FactorialProg1.java
// Input an int, compute and display its factorial.

import java.util.Scanner;

public class FactorialProg1
{
   public static void main(String[] args)
   {
     int num= 1;
     
     while (num > 0)
     {
      Scanner in = new Scanner(System.in);
      
      System.out.print("Enter an integer (or any negative number to quit): ");

     num = in.nextInt();

      long factorial = 1;

      for ( int i = num; i >= 1; i-- )
      {
         factorial = factorial * i;
         if (i > 1)
             System.out.print( i + " * " );
         else // i = 1
             System.out.print( i );
      } // end for      
     
      System.out.println( " = " + factorial );
     }
   } // end main

} // end class