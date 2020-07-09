package World;
import java.util.*;
public class LowerUpper
{
	public static void main(String[] args)
	{
		Scanner buf = new Scanner(System.in);
		String s = buf.nextLine();
		int n = s.length();
		String s1[] = new String[n];
		char c[] = new char[n] ;
		char ch[] = s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			if(Character.isLowerCase(ch[i]) == true)  //isLowerCase and isUpperCase return a boolean value
			{
				c[i] = Character.toUpperCase(ch[i]);//its return a char or string
				//System.out.println(c[i]);
			}
			else
			{
				c[i] = Character.toLowerCase(ch[i]);
				//System.out.println(c[i]);
			}
		}
		for(int i=0;i<n;i++)
		{
			s1[i] = Character.toString(c[i]);
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(s1[i]);
		}
	}
}