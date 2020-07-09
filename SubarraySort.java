//its a problem statement
/*Write a Java program to find and print one continuous subarray (from a given array of integers) that if you only sort the said subarray in ascending 
order then the entire array will be sorted in ascending order.*/
package World;
import java.util.*;
public class SubarraySort
{
	public void subArray(int[] a, int[] b)
	{
		int n1 = a.length;
		int n2 = b.length;
		TreeSet c = new TreeSet();
		TreeSet d = new TreeSet();
		for(int i=0;i<n1;i++)
		{
			for(int j=i+1;j<n1;j++)
			{
				if(a[i]>a[j])
				{
					c.add(a[i]);
				}
				else
				{
					continue;
				}
			}
		}
		System.out.println("1st array");
		Iterator it = c.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		for(int i=0;i<n2;i++)
		{
			for(int j=i+1;j<n2;j++)
			{
				if(b[i]>b[j])
				{
					d.add(b[i]);
				}
				
			}
		}
		System.out.println("2st array");
		Iterator l = d.iterator();
		while(l.hasNext())
		{
			System.out.println(l.next());
		}
	}
	public static void main(String[] args)
	{
		Scanner buf = new Scanner(System.in);
		int[] a = new int[6];
		int[] b = new int[9];
		for(int i=0;i<6;i++)
		{
			a[i] = buf.nextInt();
		}
		
		for(int i=0;i<8;i++)
		{
			b[i] = buf.nextInt();
		}
		SubarraySort obj = new SubarraySort();
		obj.subArray(a,b);
	}
}
				