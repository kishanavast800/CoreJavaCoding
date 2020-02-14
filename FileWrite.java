
package World;     //its my package name
import java.io.*;     //its used for import FileOutputstream and exception class
public class FileWrite //its class
{
	public static void main(String[] args)throws IOException //its a static function
	{
		int i;
		FileOutputStream f1=new FileOutputStream("./name2.txt",true);  //OutputStream is a abstract calss can not be a create object so FileOutputStream is a subclass
		String s="TATA";
		char ch[]=s.toCharArray();  //toCharArray is a function 
		for(i=0;i<s.length();i++)
		{
			f1.write(ch[i]);
		}
		f1.close();
	}//closing of main function
} //closing of class