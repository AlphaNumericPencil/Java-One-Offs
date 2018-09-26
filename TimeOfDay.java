/**
 * Defines a time of day
 */
public class TimeOfDay {
   
   private int hour;
   private int minute;
   
   /**
    * set the hour
    * @param phour set to this hour
    */
   public void setHour(int phour)
   {
      hour = phour;
   }
   
   /**
    * set the minute
    * @param pminute set to this minute
    */
   public void setMinute(int pminute)
   {
      minute = pminute;
   }
   
   /**
    * add one hour
    */
   public void addHour()
   {
      hour++;
      
      // If hour is > 23, reset hour to 0
      if ( hour > 23 )
      {
         hour = 0;
      }
   }
   
   /**
    * add one minute
    */
   public void addMinute()
   {
      minute++;
      
      // If minute is > 59, reset minute to 0,
      // add 1 to hour
      if ( minute > 59 )
      {
         minute = 0;
         addHour();
      }
   }
     
   /**
    * return the current time in HH:MM format
    * @return hhmm current time as HH:MM
    */
   public String getTime()
   {
      String zero1 = "";
      String zero2 = "";
      
      if ( hour < 10 )
      {
         zero1 = "0";
      }
      
      if ( minute < 10 )
      {
         zero2 = "0";
      }
      
      String hhmm = zero1 + hour + ":" + zero2 + minute;

      return hhmm;
   }
   

   
}




