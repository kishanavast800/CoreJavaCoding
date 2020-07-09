package World;
import java.io.*;
import java.util.*;
import java.lang.*;
class Car
{
	protected String CarName = "Ford";
	public void CompanyCEO()
	{
		System.out.println("Kishan Srivastava");
	}
}
class Vechile extends Car
{
	public void System_Car()
	{
		System.out.println("comfort car");
	}
	public static void main(String[] args)
	{
		Vechile obj = new Vechile();
		obj.CompanyCEO();
		obj.System_Car();
		System.out.println("name of car company: "+obj.CarName);
	}
}
	