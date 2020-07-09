//write a java program to short a numeric array and string array
package World;     //its my package
import java.util.*;        //its used to import different classes
import java.io.*; //its used for exception
public class SortArray       //its a class name
{
	public SortArray()throws IOException   //its a constructor
	{
		int a[]=new int[6];     //int array
		int i,j,temp=0; //its a local variable
		Scanner buf = new Scanner(System.in); //for taking input from user
		System.out.println("Enter the array :");
		for(i=0;i<=5;i++) //loop used for taking array from user
		{
			a[i]=buf.nextInt();
		}
		for(i=0;i<=5;i++)
		{
			for(j=i;j<=5;j++)
			{
				if(a[i]>=a[j])
				{
					temp=a[i];   //concept of swapping
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Sorted array is :");
		for(i=0;i<=5;i++)
		{
			System.out.println(a[i]);
		}
	}//ending of constructor
	public void SortString()   //its a instance member function
	{
		int i; //local variable
		String s[]=new String[6];
		Scanner buf = new Scanner(System.in);
		for(i=0;i<=5;i++)
		{
			s[i]=buf.nextLine();
		}
		Arrays.sort(s);     //its a predefind function for sorting its inside a util package
		System.out.println("Sorted string are :"+Arrays.toString(s));  
	}
		
}
class Example   //its a class for main function
{
	public static void main(String[] args)throws IOException //its a static main function
	{
		SortArray obj=new SortArray(); //creating object
		obj.SortString();  //calling function
	}  //closing of main 
}//closing of class