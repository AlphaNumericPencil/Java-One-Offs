/**
 * George Rohn
 * 9/15/16
 */


import java.util.Scanner;
import java.lang.Math;




public class HalfLife {
  
  
  public static void main(String[] args) { 
    
    double t;
    double dosage;
    double output;
      
    Scanner in = new Scanner(System.in);
    
    System.out.println("Please enter the hours since dosage was given.");
    t = in.nextInt();
    
    System.out.println("Please give the dosage the patient recieved.");
    dosage = in.nextDouble();

    while (t > 0){
     output=   dosage * Math.pow(Math.E, (-t * Math.log(2/6)));
    System.out.println((int)output);

    t--;
  }
}
}
