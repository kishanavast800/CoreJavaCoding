package World;
import java.util.Scanner;         //This package is import for using scanner class
public class Swaping
{
	public void Swap(int a,int b)       //Instance method
	{
		  System.out.println("Before Swaping:"+a+" "+b);
			int temp=a;                         //Swaping using three variable
				a=b;
				b=temp;
				System.out.println("After Swaping:"+a+" "+b);
	}
}
class Example
{
	public static void main(String[] args)        //its main function
	{
		Scanner buf=new Scanner(System.in);
		int x=buf.nextInt();
		int y=buf.nextInt();
		Swaping S1=new Swaping();
		S1.Swap(x,y);
	}
}