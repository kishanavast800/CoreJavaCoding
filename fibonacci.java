package World;           //its my package which is used to store .class file
import java.util.Scanner;      //Its package is used to take input by user
public class fibonacci 
{
	public static void main(String[] args)    //its main function
	{
		Scanner buf = new Scanner(System.in);
		int n=buf.nextInt();
		int a=0,b=1;
		System.out.print(a+" ");
		System.out.print(b+" ");
		for(int i=0;i<=n;i++)
		{
			int c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}
}
			