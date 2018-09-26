/**
 * George Rohn
 * 9/15/16
 */

import java.util.Scanner;
import java.lang.Math;

public class MilitaryTime {
  
  
  public static void main(String[] args) { 
    
    Scanner in = new Scanner(System.in);
   int time1 = 1;
   int time2 = 1;
   
   int hour1;
   int hour2;
   
   int minute1;
   int minute2;
   
  
   
    while (time1 != 0) {
      
      System.out.println("Please input one time in military time. Ex: 1530");
      
     time1 = in.nextInt();
     
     System.out.println("Please input another time in the same format.");
     
     time2 = in. nextInt();
    
     hour1 = time1 / 100;
       hour2 = time2 /100;
     
       minute1 = time1 % 100;
       minute2 = time2 % 100;
       
       minute1 += (hour1/60)*100;
       minute2 += (hour1/60)*100;
       
       System.out.println("The difference between the first time and the second time is: " + (minute1 - minute2) + " minutes.");
    }
    
  } 
}
