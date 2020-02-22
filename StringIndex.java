// Write a Java program to get the character at the given index within the String. 

package World;
import java.util.*; //its used for importing class like scanner class
public class StringIndex //class name
{
	public StringIndex()      //constructor
	{
		Scanner buf = new Scanner(System.in);   //used for input
		String s=buf.nextLine();
		char ch[]= s.toCharArray();          //function used for to split string in char
		int n=buf.nextInt();
	
		System.out.println(ch[n]);
	}
}
class Example
{
	public static void main(String[] args)        //its a main function
	{
		StringIndex obj = new StringIndex();     //object of class
	}
}