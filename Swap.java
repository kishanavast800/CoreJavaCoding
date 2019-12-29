package World;
import java.util.*;        //this package is used for importing Scanner class
public class Swap
{
	public static void main(String[] args)     //its main function
	{
		Scanner buf= new Scanner(System.in);
		int a=buf.nextInt();
		int b=buf.nextInt();
		System.out.println("before swaping:"+a+" "+b);
		a=a+b;                                  //swaping using two variable
		b=a-b;
		a=a-b;
		System.out.println("after swaping:"+a+" "+b);
	}
}