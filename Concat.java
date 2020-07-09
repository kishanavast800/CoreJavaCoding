//Write a Java program to concatenate a given string to the end of another string.
package World;     //its my package
import java.util.*; //its package imported for scanner class
public class Concat
{
	public String fun(String str1 ,String str2)  //its a instance function
	{
		String str3 = str1.concat(str2);
		return str3;  //return string value
	}
}
class Example
{
	public static void main(String[] args)   //its a main function
	{
		Scanner buf=new Scanner(System.in);
		String s1=buf.nextLine(); //input by user a string
		String s2=buf.nextLine();
		Concat obj=new Concat(); //creating a object of public calss
		String s3=obj.fun(s1,s2);   //function calling
		System.out.println(s3);
	}
}