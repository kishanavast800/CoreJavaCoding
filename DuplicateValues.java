//Write a Java program to find the duplicate values of an array of integer values.
package World;
import java.util.*;
public class DuplicateValues
{
	public DuplicateValues(int[] a)
	{
		//System.out.println("number of repetetion");
		//System.out.println("number which repeat");
		int i,j;
		
		for(i=0;i<a.length;i++)
		{ 
	        int count=0;
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			if(count>0)
			{
				System.out.println("number which repeat");
				System.out.println(a[i]);
				System.out.println("number of repetetion");
				System.out.println(count+1);
			}
		
		}
	}
}
class Example
{
	public static void main(String[] args)
	{
		int i;
		Scanner buf=new Scanner(System.in);
		System.out.println("Enter the size of array :");
		int n=buf.nextInt();
		System.out.println("enter the array :");
		int array[]=new int[n];
		for(i=0;i<n;i++)
		{
			array[i]=buf.nextInt();
		}
		DuplicateValues obj=new DuplicateValues(array);
	}
}
