//George Rohn


import java.util.Scanner;
import java.lang.Math;

public class SmallerOfInputs {
  
  
  public static void main(String[] args) { 
    
    Scanner in= new Scanner(System.in);
    System.out.println("Please input two numbers.");
    
    
    int a= in.nextInt(); 
      int b= in.nextInt();
      
      int smaller= Math.min(a,b);
      System.out.println("The smallest of the two is: " + smaller);
    
  }
}
