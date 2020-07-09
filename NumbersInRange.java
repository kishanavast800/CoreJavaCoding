package World;
import java.util.Scanner;

public class NumbersInRange {

int id;
String name;
int Salary;
public void fun(int id,String name,int Salary)
{
		this.id = id;
		this.name = name;
		this.Salary = Salary;
}
public void Display()
{
	System.out.println(id + name + Salary);
}
public static void main(String[] args)
{
	Scanner buf = new Scanner(System.in);
	NumbersInRange obj = new NumbersInRange();
	for(int i=0;i<3;i++)
	{
		int n =buf.nextInt();
		String name = buf.next();
		int s = buf.nextInt();
		obj.fun(n,name,s);
		obj.Display();
	}
	
	
}  
 
}