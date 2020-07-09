 //Write a Java program to get the maximum value of the year, month, week, date from the current date of a default calendar. 
 package World;
 import java.util.*;
 public class MaximumCal
 {
	 public static void main(String [] args)
	 {
		 Calendar cal=Calendar.getInstance();
		 System.out.println("date and time is :"+cal.getTime());
		 int maxYear=cal.getActualMaximum(Calendar.YEAR);
		 int maxMonth=cal.getActualMaximum(Calendar.MONTH);
		 int maxWeak=cal.getActualMaximum(Calendar.WEEK_OF_YEAR);
		 int maxDate=cal.getActualMaximum(Calendar.DATE);
		 System.out.println("maximum Year: "+maxYear);
		 System.out.println("maximum Month: "+maxMonth);
		 System.out.println("maximum Weak: "+maxWeak);
		 System.out.println("maximum Date: "+maxDate);
	 }
 }