package World;
import java.util.*;
public class SubStringFind
{
	public void SubFun()
	{
		Scanner buf = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s1 = buf.next();
		//ArrayList a1 = new ArrayList();
		TreeSet a1 = new TreeSet();
		String s2;
		int n1 = s1.length();
		//char ch1[] = new char[n1];
		System.out.println("enter the length of substring: ");
		int n = buf.nextInt();
	
		for(int i=0;i<n1;i++)
		{
			s2 ="";
			
			if(n+i<=n1)
			{
			s2 = s1.substring(i,n+i);
			
			a1.add(s2);
			
			
			}
			else
			{
				break;
			}
			
		}
		
			System.out.println(a1.first());
			System.out.println(a1.last());
			
		
	}
}
		
		
class Example
{
	public static void main(String[] args)
	{
		SubStringFind obj = new SubStringFind();
		obj.SubFun();
	}
}