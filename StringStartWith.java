//Write a Java program to check whether a given string starts with the contents of another string.
package World;     //its my package
import java.util.*;  //its used to import scanner class
public class StringStartWith    //its a class
{
	public static void main(String[]args)     //its a main function
	{
		Scanner buf = new Scanner(System.in); //scanner class used for taking input from user
		String s1 = buf.nextLine();
		String s2 = buf.nextLine();
		if(s1.startsWith(s2)) //startWith is a pre defind function
		{
			System.out.println("Given string starts with:" +s2);
		}
		else
		{
			System.out.println("Given string not starts with:" +s2);
		}
	} //end of main function
} //end of class