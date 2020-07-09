//Write a Java program to sort a given array of distinct integers where all its numbers are sorted except two numbers.
package World;
import java.util.*;
public class SortsArray
{
	public void sort_Array(int[] a, int[] b)
	{
		int n1 = a.length;
		int n2 = b.length;
		
		if( n1 == n2)
		{
			for(int i=0;i<n1;i++)
			{
				int temp = 0;
				int temp2 = 0;
				for(int j=i;j<n1;j++)
				{
					if(a[i]>a[j])
					{
						temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
					if(b[i]>b[j])
					{
						temp2 = b[i];
						b[i] = b[j];
						b[j] = temp2;
					}
					
					else
					{
						continue;
					}
				}
			}
		}
		for(int i=0;i<n1;i++)
			{
				System.out.println(a[i]);
			}
			System.out.println("this convert in string" + Arrays.toString(a));
		for(int i=0;i<n1;i++)
		{
			System.out.println(b[i]);
		}
			
			
	}
	public static void main(String[] args)
	{
		Scanner buf = new Scanner(System.in);
		int[] a = new int[5];
		int[] b = new int[5];
		for(int i=0;i<5;i++)
		{
			a[i] = buf.nextInt();
		}
		for(int i=0;i<5;i++)
		{
			b[i] = buf.nextInt();
		}
		SortsArray obj = new SortsArray();
		obj.sort_Array(a,b);
	}
}