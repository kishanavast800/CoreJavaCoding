package World;      //its my package
import java.util.*; //its used for importing scanner class
import java.io.*;//its used for exception handling
public class Inter
{
	
	public static void main(String[] args)throws IOException      //its a main function
	{
		int i,j;
		Scanner buf = new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("enter the array");
		for(i=0;i<5;i++)
		{
			a[i]=buf.nextInt();
		}
		int b[]=new int[3];
		System.out.println("enter the second array");
		for(i=0;i<3;i++)
		{
			b[i]=buf.nextInt();
		}
		System.out.println("Intersection of two array");
		for(i=0;i<5;i++)
		{
			for( j=0;j<3;j++)
			{
				if(a[i]==b[j])
				{
					System.out.println(a[i]);
				}
				else
				{
					System.out.print("");
				}
			}
		}
	} //ending of main function
}  //ending of class
			