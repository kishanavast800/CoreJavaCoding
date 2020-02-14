import java.io.*;   //io is used to import file and Exception class
class FileCreate
{
	public FileCreate()throws IOException     //its a constructor
	{
		File f1=new File("C:/CoreJavaCode/name.txt");
		f1.createNewFile();            //for creation of new file
		System.out.println("is Exist:"+f1.exists());       /*some function in file are used below*/
		System.out.println("Length of file:"+f1.length());
		System.out.println("name of file:"+f1.getName());
		System.out.println("Can file read:"+f1.canWrite());
	}
}
class Example
{
	public static void main(String[] args)throws IOException //static main function
	{
		FileCreate obj=new FileCreate();        //object of fileCreate calss
	}
}