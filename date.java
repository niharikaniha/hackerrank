import java.time.*;
import java.util.*;
public class Solution {
    public static String getDay(String day, String month, String year) {
        int day1 = Integer.parseInt(day);
        int month1 = Integer.parseInt(month);
           int year1 = Integer.parseInt(year);
        LocalDate date = LocalDate.of(year1, month1, day1);
      return (String.valueOf(date.getDayOfWeek()));

     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        System.out.println(getDay(day,month,year));
     }   
    }
