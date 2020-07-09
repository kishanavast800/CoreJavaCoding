package World;
import java.util.*;
import java.io.*;
public class ShortName
{
	
	public void ShortFun(String[] s, int n)
	{
		for(int i=0;i<n;i++)
		{
			String temp = "";
			for(int j=0;j<n;j++)
			{
				if((s[i].compareTo(s[j]))<0)
				{
					temp = s[i];
					s[i] = s[j];
					s[j] = temp;
				}
			}
		}
		System.out.println("Shorted name in dictionary order: ");
		for(int i=0;i<n;i++)
		{
			System.out.println(s[i]);
		}
	}
}
class Example
{
	public static void main(String[] args)
	{
		Scanner buf = new Scanner(System.in);
		System.out.println("enter the number of names which have enter: ");
		int n = buf.nextInt();
		String[] s = new String[n];
		int a = s.length;
		System.out.println("Enter the name: ");
		for(int i=0;i<a;i++)            //n-1 name in String array
		{
			s[i] = buf.nextLine();
		
		}
		ShortName obj = new ShortName();
		obj.ShortFun(s,a);
	}
}
			