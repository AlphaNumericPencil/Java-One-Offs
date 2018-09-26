//George Rohn
import java.util.Scanner;
import java.lang.Math;


public class Ulam {
  
  
  public static void main(String[] args) { 
    
    
    Scanner in= new Scanner(System.in);
    System.out.println("Please input a number.");
    
    
    int n = in.nextInt();
    
    while (n > 1){
      System.out.print(n + " > ");
      
      if (n % 2== 0)
      {
        n= n/2;
      }
      else
      {
        n= 3*n + 1;
      }
    }
    System.out.println(n);
  }
}
