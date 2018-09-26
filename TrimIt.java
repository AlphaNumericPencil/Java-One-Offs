//George Rohn CS 175

public class TrimIt
{
   public static void main(String[] args)
   {
      String sentence1 = "      abc   ";
      String sentence2 = "   def";
      String sentence3 = "ghi         ";
     String complete= sentence1.trim() + sentence2.trim() + sentence3.trim();
      
      System.out.print(complete.trim());


   } 
} 