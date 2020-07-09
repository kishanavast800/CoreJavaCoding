package World;
import java.util.*; 
import java.io.*;

class Main {

  public static int[] ArrayChallenge(int[] arr) {
    // code goes here  
    int n = arr.length;
    int [] arr1 = new int[n];
    for(int i=0;i<n;i++)
    {
      int temp = 1;
      for(int j=0;j<n;j++)
      {
        if(arr[j] != arr[i])
        {
          temp = temp*arr[j];
        }
      }
      arr1[i]=temp;
    }
    
    return arr1;
    
  }

  public static void main (String[] args) {  
    // keep this function call here 
    Scanner s = new Scanner(System.in);
    
	String s3 ="";
	System.out.println("Enter the size of array: ");
	int n = s.nextInt();
    int[] arr = new int[n];
	System.out.println("Enter the array: ");
    for(int i=0;i<n;i++)
    {
      arr[i] = s.nextInt();
    }
    int[] arr2 = ArrayChallenge(arr);
	String[] s2 =new String[n];
	for(int i=0;i<arr2.length;i++)
	{
		s2[i] =  String.valueOf(arr2[i]);
	}
	for(int i=0;i<arr2.length;i++)
	{
		 s3 += s2[i];
		 if(i<arr2.length-1)
		 {
			 s3 += "-";
		 }
	}
		System.out.println("in form of string seprated by - : " +s3);
  }

}