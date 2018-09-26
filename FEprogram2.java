//George Rohn

import java.util.Scanner;


public class FEprogram2 {
  
  
  public static void main(String[] args) { 
    
    int counter1;
    int counter2;
    int bigger;
    int smaller;
    
    
     Scanner in= new Scanner(System.in);
    System.out.println("Please input a set of two numbers.");
    
    counter1= in.nextInt();
    counter2= in.nextInt();
    
    if (counter1 > counter2)
    {
      bigger= counter1;
      smaller= counter2;
    }
    else
    {
      bigger= counter2;
      smaller= counter1;
    }
    
    while ( bigger > smaller)
    {
      bigger--;
      smaller++;
      System.out.println(bigger + " " + smaller);
      
      
      if (bigger- smaller == 1)
      {
        break;
      }
    }
  
  
  }
}

