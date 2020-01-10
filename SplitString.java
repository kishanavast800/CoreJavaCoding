package World;       //its my package
import java.util.*;        //package for scanner class
public class SplitString           //public class begin
{
	public static void main(String[] args)
	{
		Scanner sn = new Scanner(System.in);  //for input taken by user
		String s = sn.nextLine(); //for string input use nextLine
		int n= s.length();
		System.out.println(n);
		char r[]=new char[n];
		System.out.println(s);
		String a[]=s.split(" ");
		
		for(int i=0;i<=a.length;i++)
		{
		System.out.println(a[i]);            //output
		}
	}
}