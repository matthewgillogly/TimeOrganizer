package timeorganizer;
import java.util.*;

public class timeorganizer {

    public static void main(String[] args) {
        GregorianCalendar gcalendar = new GregorianCalendar();
        
//Hardcoded hour and minutes to test time differences
        int testHour = 5;
        int testMinute = 45;
        
        int currentHour = gcalendar.get(Calendar.HOUR);
        int currentMin = gcalendar.get(Calendar.MINUTE);
      
//Prints current time   LINK http://www.tutorialspoint.com/java/java_date_time.htm
      System.out.print("Time: ");
      System.out.print(currentHour + ":");
      if (currentMin<10)
      System.out.println("0"+currentMin);
      else
      System.out.println(currentMin);
      
//Printint difference of current time and hardcoded time
      System.out.print("Time difference from now to " + testHour + ":" + testMinute + " : ");
      if (testMinute<currentMin)
      {
          System.out.print((testHour - currentHour)-1 + ":");
          int minResult = testMinute +(60-currentMin);
          if (minResult<10)
          System.out.println("0" + minResult);
          else
          System.out.println(minResult);
      }
      else
      {
          System.out.print(testHour-currentHour + ":");
          int minResult = testMinute-currentMin;
          if (minResult<10)
          System.out.println("0" + minResult);
          else
          System.out.println(minResult);
      }

    }
}