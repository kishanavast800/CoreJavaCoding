//Write a Java program to get and display information (year, month, day, hour, minute) of a default calendar.
package World;  //its my package which is create by me
import java.util.*; //its a package to import different class from library
public class CalenderDisplay  //its a class name
{
	public static void main(String[] args)    //its a main function
	{
		Calendar cal=Calendar.getInstance();   //its a clandar class 
		System.out.println("Year: " + cal.get(Calendar.YEAR));
        System.out.println("Month: " + cal.get(Calendar.MONTH));
        System.out.println("Day: " + cal.get(Calendar.DATE));
        System.out.println("Hour: " + cal.get(Calendar.HOUR));
        System.out.println("Minute: " + cal.get(Calendar.MINUTE));
	    System.out.println("second: "+cal.get(Calendar.SECOND));
	}  //closing of main
}//closing of class
