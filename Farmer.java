//farmer problem
package World;
import java.util.*;
public class Farmer
{
	public static void main(String[] args)
	{
		Scanner buf = new Scanner(System.in);
		int t = buf.nextInt();
		
		
		while(t!=0)
		{
			int count = 0;
			int n=buf.nextInt(), p = buf.nextInt();
		while(n != 0)
		{
			
			System.out.println(p);
			if( p != 0)
			{
				count += 100;
				n--;
				p--;
			}
			else
			{
				p = p+1;
				n--;
			}
		}
		System.out.println(count);
		t--;
		}
	}
}
		