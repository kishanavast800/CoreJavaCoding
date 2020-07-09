//Write a java program to print current date and time 
package World;
import java.util.Calendar;
public class calen
{
	public static void main(String[] args)
	{
		Calendar c=Calendar.getInstance();
		System.out.println("Current date and time:");
		System.out.format("%tB %te , %tY%n",c,c,c);
		System.out.format("%tH:%tM %tp%n",c,c,c);
	}
}