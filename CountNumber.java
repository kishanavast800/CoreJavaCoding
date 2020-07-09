package World;
import java.util.*;
public class CountNumber
{
	public void fun(String b, int a, int c)
	{
		int n = a;
		int temp =3;
		while(true)
		{
			if(0<c && c<=3)
			{
				for(int i=0;i<12;i++)
				{
					System.out.print(b + " ");
					n--;
					
				}
				c--;
			}
			else if(c>3)
			{
				for(int i=0;i<n;i++)
				{
					System.out.print(b + " ");
					n--;
					
				}
				c--;
			}
			if(c==0 && n==0)
			{
				break;
			}
			System.out.println();
			
		}
		System.out.println(n);
	}
	public static void main(String[] args)
	{
		Scanner buf = new Scanner(System.in);
		int n = buf.nextInt();
		int no = buf.nextInt();
		String name = buf.next();
		CountNumber obj = new CountNumber();
		obj.fun(name,n,no);
	}
}