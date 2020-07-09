//Write a Java program to copy an array by iterating the array.
package World;  //its my package
import java.util.*; //its a package import for Array and scanner classes
public class IteratingArray //its my class name
{
	public static void main(String[] args) //its a main function
	{
		Scanner buf = new Scanner(System.in);  //its used for taking input from user
		int array[]=new int[5]; //its a array declaration
		int new_array[]=new int[5];
		for(int i=0;i<5;i++)
		{
			array[i]=buf.nextInt();
		}
		System.out.println("old array is :"+Arrays.toString(array)); //print statement
		for(int i=0;i<5;i++)
		{
			new_array[i]=array[i];
		}
		System.out.println("new array is :"+Arrays.toString(new_array));
	}//closing of main function
}//closeing of class