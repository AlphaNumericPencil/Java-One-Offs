//George Rohn
//ChessSquares.java


import java.util.*;
import java.lang.Math;

public class ChessSquares {
  
  
  public static void main(String[] args) { 
    
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter your square's letter:");
    String letter = scan.next();
    
    System.out.println("Enter your square's number:");
    int number = scan.nextInt();
    /*
     * This is a debug section of the code. 
     * It runs some simple checks to ensure that the user has correctly entered the parameters.
     * */
  
    
    letter= letter.toLowerCase(); //Ensuring that people will not accidentally break the program using cases
    
    int letterLength= letter.length();
      
      if (letterLength != 1)
    {
      System.out.println("You have not entered a correct letter."); //This ensures user has entered one letter.
    }
    //end debug
    
   
    
    
    if (number % 2 == 0) 
    {
      if (letter.equals("a") || letter.equals("c") || letter.equals("e") || letter.equals("h"))
        
      {
        System.out.println("The square is white."); //even numbers in A, C, E, H are white
      }
      
      else if (letter.equals("b") || letter.equals("d") || letter.equals("f") || letter.equals("h"))
      {
        System.out.println("The square is black."); //Even numbers in B, D, F, H are black
      }
    }
    
    /*
     * This portion of the code begins odd numbers
     */
    
    
    else if (letter.equals("a") || letter.equals("c") || letter.equals("e") || letter.equals("h")) 
    {
      System.out.println("The square is black"); //Odd numbers in A, C, E, H are black
    }
    
    
    else if
      (letter.equals("b") || letter.equals("d") || letter.equals("f") || letter.equals("h"))
    {
      System.out.println("The square is white"); //Odd numbers in B, D, F, H are white
    }
 
  
  } 
}


