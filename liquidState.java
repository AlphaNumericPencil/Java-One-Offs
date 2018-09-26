//George Rohn
//Modified from the previous dropbox'd submission
import java.util.Scanner;
import java.lang.Math;


public class liquidState
{
  public static void main(String[] args)
  {

    
    Scanner input = new Scanner(System.in);
    

      
      System.out.print("Please input the temperature of your liquid.");
      
     String a = input.nextLine();
     
     if (a.matches("-?\\d+")) {
      int c = Integer.parseInt(a);
     
    
     if (c < 264) {
       System.out.println("Tempertaure too low, " + c +". Please enter a valid temperature greater than -274.");
     }
     else if (c <= 0){
      System.out.println("Solid");
     }
     
else if (c <= 100){
System.out.println("Liquid.");
}

else {
 System.out.println("Gas."); 
}

  
     }



  }
}
    
  
