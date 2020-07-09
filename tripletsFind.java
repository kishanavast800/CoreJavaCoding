//Write a Java program to find all triplets equal to a given sum in a unsorted array of integers.
package World;
import java.util.*;
public class tripletsFind
{
	public static void main(String[] args)
	{
		Scanner buf = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n = buf.nextInt();
		System.out.println("enter number which find triplets: ");
		int n1 = buf.nextInt();
		int[] arr = new int[n];
		
		System.out.println("Enter the array: ");
		for(int i=0;i<n;i++)
		{
			arr[i] = buf.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			
			int temp = 0;
			int count = 0;
			for(int j=i;j<n;j++)
			{
				temp = temp+arr[j];
				if(temp <= 7 && count <=3)
				{
					System.out.print(arr[j]+",");
					count++;   //nums = { 1, 6, 3, 0, 8, 4, 1, 7 }
				}
			}
		}
	}
}