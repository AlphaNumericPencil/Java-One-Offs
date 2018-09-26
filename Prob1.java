//George Rohn

import java.util.Scanner;

public class Prob1 {
  
  
  public static void main(String[] args) { 
    
    
    int loopLimit;
    
       Scanner in= new Scanner(System.in);
    System.out.println("Please input a positive interger.");
    
    loopLimit= in.nextInt();
    
    for ( int counter= 1; counter <= loopLimit; counter++ )
    {
      System.out.println(counter + ".");
    }
    
    
    
    
  }
}
