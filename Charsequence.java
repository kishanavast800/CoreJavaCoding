//Write a Java program to compare a given string to the specified character sequence.
package World;
import java.util.*;
public class Charsequence
{
	public static void main(String[] args)
	{
		Scanner buf = new Scanner(System.in);
		String s1=buf.nextLine();
		String s2=buf.nextLine();
		CharSequence ch=buf.nextLine();
		System.out.println(s1+" and "+ch+ ":" +s1.contentEquals(ch));
		System.out.println(s2+" and "+ch+ ":" +s2.contentEquals(ch));
	}
}
		
		