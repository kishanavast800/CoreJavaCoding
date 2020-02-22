//Write a java program to compare two strings lexicographically, ignoring case differences.
package World;       //its my package
import java.util.*;          //for imorting class like scanner
public class CompareString
{
	public void Compare()
	{
		Scanner buf = new Scanner(System.in); //for taking input by users
		String s1 = buf.nextLine();
		String s2 = buf.nextLine();
		if(s1.equalsIgnoreCase(s2))        //equalsIgnoreCase is a function for comparision of two string
		{
			System.out.println(s1+" is equal to "+s2);
		}
		else
		{
			System.out.println(s1+" is not equal to "+s2);
		}
	}
}
class Compare
{
	public static void main(String[] args)           //its a main function
	{
		CompareString obj = new CompareString();
		obj.Compare();
	}
}
		