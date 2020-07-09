//Write a Java program to search an element in a array list.
package World;
import java.util.*;
public class SearchElementList
{
	public boolean SearchElement(ArrayList arrList,int n1)
	{
		if(arrList.contains(n1))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args)
	{
		Scanner buf = new Scanner(System.in);
		ArrayList a1 = new ArrayList();
		int n=buf.nextInt();
		while(n != 0)
		{
			a1.add(buf.nextInt());
			n--;
		}
		System.out.println("please entre the we have to search: ");
		int n1 = buf.nextInt();
		System.out.println(a1);
		SearchElementList obj = new SearchElementList();
		boolean s = obj.SearchElement(a1,n1);
		System.out.println(s);
	}
		
}