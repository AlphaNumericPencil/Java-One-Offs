import java.util.*;
import java.text.DecimalFormat;

/**
 * @Author George Rohn
 * @Version: 1.0
 */


public class Quad {
  
  
  public static void main(String[] args) { 
    
  }
  
Scanner input = new Scanner(System.in);

// y = a x^2 + bx + c



int a = r.nextInt(4)++;
int b = r.nextInt(11)++;
int c = - r.nextInt(7)++;

double d = Math.pow(b, 2) - 4 * a * c;
  
double answer1, answer2;

double answer1= (-b + Math.sqrt(d)) / (2 * a);
double answer2= (-b - Math.sqrt(d)) / (2 * a);

DecimalFormat f = new DecimalFormat("0.##");

String o = f.format(answer1);

System.out.println(o);

o = f.format(answer2);

System.out.println(o);

}
