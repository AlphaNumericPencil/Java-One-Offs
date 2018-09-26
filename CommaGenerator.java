//George Rohn
//Modified from the previous dropbox'd submission
import java.util.Scanner;
import java.lang.Math;


public class CommaGenerator
{
  public static void main(String[] args)
  {
    
    int number= 0;
    double firstComma= 0;
    double secondComma= 0;
    
    Scanner in= new Scanner(System.in);
    
    while (number >= 0){
      
      System.out.println("Please input your number to be commafied.");
      
    /*  String input = scanner.nextLine();
      if (input.matches("-?\\d+")) {
        number= (double)input;
      }
         */
      
      
      if (number <= 999){
        System.out.println(number);
      }
      
      else if (number <= 999999){
        firstComma = (int)(number % 1000);
        number= number/1000;
        System.out.println(number + "," + (int)firstComma);
      }
      
      else if (number <= 999999999){
        firstComma = (int)(number % 1000);
        secondComma = (int)(number % 1000000);
        number= number/10000;
        System.out.println(number + "," + (int)secondComma + "," + (int)firstComma);
      }
      
    }
    
    
    
    
  }
}
