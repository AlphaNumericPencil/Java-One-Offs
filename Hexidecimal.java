/*
 * George Rohn
 * Sept 15, 2016
 **/

import java.util.Scanner;
import java.lang.Math;


public class Hexidecimal {
  
  
  public static void main(String[] args) { 
    
    String hex;
    int total = 0;
    
    Scanner in = new Scanner(System.in);
    
    do {
    
      
      System.out.println("Please input a hex value, or zero(0) to quit.");
      
       hex = in.nextLine();
      
       for (int e = 0; e < hex.length(); ++e){
         char digit = hex.charAt(hex.length()-1-e);
         
         int p = 0;
         if  (digit == 0) {
          p = 0 * (int)Math.pow(16, e);
         }
         
         else if (digit == 1){
           p = 1 * (int)Math.pow(16, e);
         }
      else if (digit == 2){
           p = 1 * (int)Math.pow(16, e);
         }
      else if (digit == 3){
           p = 1 * (int)Math.pow(16, e);
         }
      else if (digit == 4){
           p = 1 * (int)Math.pow(16, e);
         }
      else if (digit == 5){
           p = 1 * (int)Math.pow(16, e);
         }
      else if (digit == 6){
           p = 1 * (int)Math.pow(16, e);
         }
      else if (digit == 7){
           p = 1 * (int)Math.pow(16, e);
         }
      else if (digit == 8){
           p = 1 * (int)Math.pow(16, e);
         }
      else if (digit == 9){
           p = 1 * (int)Math.pow(16, e);
         }
      else if (digit == 'A'){
           p = 1 * (int)Math.pow(16, e);
         }
      else if (digit == 'B'){
           p = 1 * (int)Math.pow(16, e);
         }
      else if (digit == 'C'){
           p = 1 * (int)Math.pow(16, e);
         }
      else if (digit == 'D'){
           p = 1 * (int)Math.pow(16, e);
         }
      else if (digit == 'E'){
           p = 1 * (int)Math.pow(16, e);
         }
      else if (digit == 'F'){
           p = 1 * (int)Math.pow(16, e);
         }
       
       
         else {
           System.out.println("Cannot recognize hex digit: " + digit);
         }
         }
         total = 0;
         total += p;
         
       
       System.out.println(total);
    }   while(!hex.equals(0));
    
    
    System.out.println("Good bye!");
    
    }
}
 
