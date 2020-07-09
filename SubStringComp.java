//Java Substring Comparisons
package World;
import java.util.*;
public class SubStringComp
{
	public static void main(String[] args)
	{
		Scanner buf = new Scanner(System.in);
		String s1 = buf.nextLine();
		String s2 = s1.toLowerCase();
		int n = buf.nextInt();
		int count =0;
		int l = s2.length();
		String s[] = new String[l];
		for(int i=0;i<l;i++)
		{
			if(i+n<=l)
			{
			   s[i] = s2.substring(i,i+n);
			}
		}
		for(int i=0;i<l;i++)
		{
			if(s[i] != null)
			{
				count++;
			   System.out.println(s[i]);
			   
			}
		}
		System.out.println(count);
		String s3[] = new String[count];
		for(int i=0;i<count;i++)
		{
			if(s[i] != null)
			{
				
			  s3[i] = s[i]; 
			   
			}
		}
		
		for(int i=0;i<count;i++)
		{
			 System.out.println(s3[i]);
		
		}
		
		for(int i=0;i<count;i++)
		{
			String temp;
			for(int j=i+1;j<count;j++)
			{
			    if((s3[i].compareTo(s3[j]))>0)
			    {
					temp = s3[i];
					s3[i] = s3[j];
					s3[j] = temp;
				}
			}
		}
		for(int i=0;i<count;i++)
		{
			System.out.println(s3[i]);
		     
		}
	}
}