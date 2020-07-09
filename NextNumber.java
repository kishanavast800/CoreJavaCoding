//Write a Java program to get the next floating-point adjacent in the direction of positive and negative infinity from a given float/double number.
package World;

import java.util.*;
public class NextNumber
{
	public void nextFloatNumber(float n)
	{
		float lower_next_number = Math.nextDown(n);
		float higher_next_number = Math.nextUp(n);
		System.out.println("lower value is: "+lower_next_number +" and " +"higher value is :"+ higher_next_number );
	}
	public void nextDoubleNumber(Double x)
	{
		double lower_next_numbers = Math.nextDown(x);
		double higher_next_numbers = Math.nextUp(x);
		System.out.println("lower value is: "+lower_next_numbers +" and " +"higher value is :"+ higher_next_numbers );
	}
	
	public static void main(String[] args)
	{
		Scanner buf = new Scanner(System.in);
		float s = buf.nextFloat();
		double n = buf.nextDouble();
		NextNumber obj = new NextNumber();
		obj.nextFloatNumber(s);
		obj.nextDoubleNumber(n);
	}
}


