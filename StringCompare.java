package World;       //its my package
import java.util.*;  //this package is used to import scanner calls for user input
import java.io.*;  //its use for import exception class
public class StringCompare
{
	public static void main(String[] args)throws IOException //its a main function
	{
		Scanner buf = new Scanner(System.in);
		String s1 = buf.nextLine();      
		String s2 = buf.nextLine();
		StringBuffer s=new StringBuffer(s2);
		System.out.println("Comparing "+s1+" and "+s+": " + s1.contentEquals(s));
		
	}//closing of main function
}//closing of class