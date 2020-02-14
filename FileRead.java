package World;    //its my package
import java.io.*;  //its is used to import Exception class and FileInputStream class
public class FileRead
{
	public static void main(String[] args)throws IOException //static function
	{
		int i;     //local variable
		FileInputStream fin=new FileInputStream("./name2.txt");
		do
		{
			i=fin.read();
			if(i!=-1)
			{
				System.out.println((char)i);
			}
		}while(i!=-1);
		fin.close();
	}
}//close the class
