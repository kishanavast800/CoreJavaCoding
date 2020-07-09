 //Write a Java program to find the maximum and minimum value of an array.
package World;    //its my package
import java.util.*;   //its a package for importing scanner class
public class CallingArray
{
	public int CallArray(int[] a)    //its a instance member function
	{
		int min=a[0];   //its a logic for finding minimum element
		for(int i=1;i<=4;i++)
		{
			if(min>a[i])
				min=a[i];
		}
		
		return min;
	}
	public int CallMaxArray(int[] a)    //its second instance member function
	{
		int max=a[0];    //its logic for finding maximum function
		for(int j=1;j<=4;j++)
		{
			if(max<a[j])
				max=a[j];
		}
		return max;
	}
}//closing of class
class Example    //its another class its hold main function
{
	public static void main(String[] args)  //its a main function
	{
		Scanner buf=new Scanner(System.in); //its take input from user
		int a[]=new int[5]; //its a array declaration
		System.out.println("enter the array :");
		for(int i=0;i<5;i++)
		{
			a[i]=buf.nextInt();
		}
		CallingArray obj= new CallingArray();  //its creating a object of public class
	
		int s=obj.CallArray(a); //calling function
		int s2=obj.CallMaxArray(a); 
		
		System.out.println("minimum element is :"+s);
		System.out.println("maximum element is :"+s2);
		
	}//closing of main function
}  //closing of class