package World;
import java.util.*;

public class AddString
{
	public static void main(String[] args)
	{
		Scanner buf = new Scanner(System.in);
		String s1=buf.nextLine();
		String s2 ="ing";
		String s3 ="ly";
		if(s1.length()<=2)
		{
			System.out.println(s1);
		}
		else if(s1.opensWith("ing"))
		{
		    String s4=s1+s3;
		    System.out.println(s4);
		}
		else
		{
			String s5=s1+s2;
			System.out.println(s5);
		}
	}
}