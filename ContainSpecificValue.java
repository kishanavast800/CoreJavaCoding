//Write a Java program to test if an array contains a specific value.
package World; //its my package
import java.util.*;   //its import a package for implementation of scanner class
public class ContainSpecificValue  //its a pubblic class 
{
	public ContainSpecificValue(int[] a)   //its a constructor
	{
		Scanner s = new Scanner(System.in);     //its used for taking input from user
		System.out.println("enter the search element:");
		int n = s.nextInt(); 
		int count=0;
		for(int i=0;i<6;i++)         /*its a logic for searching a element 
										which are present in array or not*/
		{
			if(a[i] == n)
			{
				System.out.println("true");
				break;
			}
			else
			{
				count++;
			}
		}
		if(count==6)
		{
			System.out.println("false");
		}
		
	}//closing of constructor
}//closing of class
class test  //its an other class for calling main function
{
	public static void main(String[] args)  //its a main function
	{
		Scanner buf = new Scanner(System.in);
		int a[] = new int[6];    //its a array declaretion
		int i=0;
		while(i<6)
		{
			a[i]=buf.nextInt();
			i++;
		}
		ContainSpecificValue obj = new ContainSpecificValue(a);
	}//closing of main function
}//closing of class
		