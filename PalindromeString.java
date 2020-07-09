package World;
import java.util.*;
import java.lang.*;
public class PalindromeString
{
	public PalindromeString()
	{
		Scanner buf = new Scanner(System.in);
		String s1=buf.nextLine();
		String s2=buf.nextLine();
		if(s1.equals(s2))
		{
			System.out.println("string are same");
		}
		else
		{
			System.out.println("string are not same");
		}
	}
}
class Example
{
	public static void main(String[] args)
	{
			PalindromeString obj = new PalindromeString();
	}
}