package timeorganizer;
import java.util.*;

public class timeorganizer {

    static GregorianCalendar gcalendar = new GregorianCalendar();
    static int currentHour;
    static int currentMin;
    static int PeriodOfDay;
    
    public static void main(String[] args) {

        int testHour = 5;
        int testMinute = 45;
        int testPeriod = 1;    //Period of day; 0 = AM, 1 = PM
        
        currentHour = getCurrentHour();
        currentMin = getCurrentMinute();
        PeriodOfDay = getPeriodOfDay();
      
        printCurrentTime();
      
//Printint difference of current time and hardcoded time
      System.out.print("Time difference from now to " + testHour + ":" + testMinute + " : ");
      if (testMinute<currentMin)
      {
          int hourResult = (testHour - currentHour)-1;
          if (hourResult<0)
              System.out.print(hourResult*-1 + ":");
          else
              System.out.print(hourResult + ":");
          
          int minResult = testMinute +(60-currentMin);
          if (minResult<10)
          System.out.println("0" + minResult);
          else
          System.out.println(minResult);
      }
      else
      {
          int hourResult = testHour-currentHour;
          if (hourResult<0)
              System.out.print(hourResult*-1 + ":");
          else
              System.out.print(hourResult + ":");
          
          int minResult = testMinute-currentMin;
          if (minResult<10)
          System.out.println("0" + minResult);
          else
          System.out.println(minResult);
      }

    }
    
    static public void printCurrentTime()
    {
        //Prints current time
      System.out.print("Time: ");
      System.out.print(currentHour + ":");
      if (currentMin<10)
        System.out.print("0"+currentMin);
      else
        System.out.print(currentMin);
      if (PeriodOfDay == 0)
        System.out.println(" AM");
      else if (PeriodOfDay == 1)
         System.out.println(" PM");
    }
    
    static public int getCurrentHour()
    {
        int CurrHr = gcalendar.get(Calendar.HOUR);
        return (CurrHr);
    }
    static public int getCurrentMinute()
    {
        int CurrMin = gcalendar.get(Calendar.MINUTE);
        return (CurrMin);
    }
    static public int getPeriodOfDay()
    {
        int POD = gcalendar.get(Calendar.AM_PM);
        return(POD);
    }
}
//Link to Calendar http://www.tutorialspoint.com/java/java_date_time.htm