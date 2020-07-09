package Collect;
import java.util.*;
public class Array_list
{
	public static void main(String[] args)
	{
		ArrayList a1 = new ArrayList();
		a1.add("colors");
		a1.add("yellow");
		a1.add("blue");
		a1.add("black");
		a1.add("brown");
		a1.add("pink");
		System.out.println(a1);
		a1.add(0,"Kishan");
		a1.remove(4);
		System.out.println(a1);
		ListIterator it = a1.listIterator();
		
		while(it.hasNext())
		{
			String s =(String)it.next();
			
			System.out.println(s);
		}
		//it.add("hello");
		
		while(it.hasPrevious())
		{
			System.out.println((String)it.previous() + " " +(Integer)it.previousIndex());
		}
		
	
		
			System.out.println(a1);
		
	}
}