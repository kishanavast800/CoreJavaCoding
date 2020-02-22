//Write a Java program to test if a given string contains the specified sequence of char values.
package World; //its my package
import java.util.*; //its used for importing scanner class
public class SequenceOfChar     //its a class
{
	public static void main(String[] args)  //its a main function
	{
		Scanner buf = new Scanner(System.in);  //scanner class for taking input from user
		String s1 = buf.nextLine();
		String s2 = buf.nextLine();
		System.out.println("given string:" + s1);
		System.out.println("specified sequence of char values:"+ s2);
		System.out.println(s1.contains(s2));      //contains is a pre defined functions
	}
}