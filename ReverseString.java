//WAP to reverse a string
package World;    //its my package World
import java.util.*;  //its is used to import Scanner class
public class ReverseString
{
	int i,j;    //instance variable
	public void stringReverse()      //instance member function
	{
		Scanner buf = new Scanner(System.in);  //its used for taking input from user
		String s1=buf.nextLine();   //s1,ch,ch1 are local variable
		int a=s1.length();		//'a' is a local variable for storing a length of string
		System.out.println("length of array :");
		System.out.println(a);
		char ch[]=new char[a+1];
		
		char ch1[]=s1.toCharArray();  //this function is used to convert string in char
		System.out.println("reverse of given string is :");
		for(j=0;j<a;j++)
		{
			ch[j]=ch1[a-j-1];
			
			String s=String.valueOf(ch[j]); //this function is used to convert char into String
			System.out.print(s);
		}
	}
}
class Example
{
	public static void main(String[] args)    //its a main function
	{
		ReverseString obj=new ReverseString();    //its create object of my class
		obj.stringReverse();//function calling
	}//closing of main function
}//closing of class
		
		