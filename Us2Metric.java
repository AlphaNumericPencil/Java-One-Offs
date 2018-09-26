/**
 * Auto Generated Java Class.
 */
public class Us2Metric {
  
  
  public static void main(String[] args) { 
    
    final double CMPERIN= 2.54;
    final double KGPERLB= 0.45359237;
    
    System.out.println("Inches \t\t\t centimeters \t\t\t pounds \t\t\t kilograms");
    System.out.println("------ \t\t\t ----------- \t\t\t ------ \t\t\t ---------");
    
    for ( int i = 1; i <= 50; i++ )
    {
      double cm= i * CMPERIN;
      double kg= i * KGPERLB;
      
        System.out.println( i + "\t\t\t" + cm + "\t\t\t" + i + "\t\t\t" + kg);
    }
    
  
    
    
  }  
}
