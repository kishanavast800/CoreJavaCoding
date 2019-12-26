package World;
import java.util.Scanner; //Use util package due to import scanner class
public class SquarePattern
{
	public static void main(String[] args)
	{
		Scanner buf = new Scanner(System.in);      //it is used for input by user
		System.out.println("Enter the value of n:");
		int n=buf.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j< n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}