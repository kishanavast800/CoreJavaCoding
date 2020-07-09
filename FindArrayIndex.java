//Write a java program to find the index of an array element
package World;  //its my package
import java.util.*;   //its used for importing scanner class

public class FindArrayIndex      //its a class main
{
	public static void main(String[] args)   //its a main function
	{
		int i;   //its a local variable
		Scanner buf = new Scanner(System.in); //its a scanner class for using user input
		int search_num=buf.nextInt();
		System.out.println("enter the array :");
		int array1[] = new int[5];   //array declaration
		for(i=0;i<5;i++)
		{
			array1[i]=buf.nextInt();
		}
		
		int len=array1.length;
		System.out.println("print index :");
		i=0;
		while(i<len)
		{
			if(array1[i]==search_num)
			{
				System.out.println(i);
				break;
			}
			else
			{
				i+=1;
			}
		}
	}  //closing of main function
}  //closing of class