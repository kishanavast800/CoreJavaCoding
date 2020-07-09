//Write a java program to remove a specific element from an array
package World;  //its my package
import java.util.*;  //its a package used for scanner class and Arrays
public class RemoveElementArray  //its a class name
{
	public static void main(String[] args)//its a main function
	{
		int i; //local variable
		Scanner buf=new Scanner(System.in);
		int numDe=buf.nextInt();
		int array1[]=new int[5];
		for(i=0;i<5;i++)
		{
			array1[i]=buf.nextInt();
		}
		System.out.println(Arrays.toString(array1));
		int len = array1.length;
		for(i=numDe;i<len-1;i++)
		{
			array1[i]=array1[i+1];
		}
		System.out.println("array is :"+Arrays.toString(array1));
	}
}