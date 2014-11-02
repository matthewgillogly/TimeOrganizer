package timeorganizer;
import java.util.*;

public class timeorganizer {

    public static void main(String[] args) {
//Prints current time   LINK http://www.tutorialspoint.com/java/java_date_time.htm
        
      GregorianCalendar gcalendar = new GregorianCalendar();
        System.out.print("Time: ");
      System.out.print(gcalendar.get(Calendar.HOUR) + ":");
      System.out.print(gcalendar.get(Calendar.MINUTE) + ":");
      System.out.println(gcalendar.get(Calendar.SECOND));
    }
    
}
