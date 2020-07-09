package World;
import java.util.Scanner;

public class Solutio {

    public static String getSmallestAndLargest(String s, int k) {
       
        String s2 = s.toLowerCase();
        String smallest,largest;
        int count =0;
        int l = s2.length();
        String s1[] = new String[l];
        for(int i=0;i<l;i++)
        {
            if(i+k<=l)
            {
               s1[i] = s2.substring(i,i+k);
            }
        }
        for(int i=0;i<l;i++)
        {
            if(s1[i] != null)
            {
                count++;
               
               
            }
        }
        
        String s3[] = new String[count];
        for(int i=0;i<count;i++)
        {
            if(s1[i] != null)
            {
                
              s3[i] = s1[i]; 
               
            }
        }
        
        
        for(int i=0;i<count;i++)
        {
            String temp;
            for(int j=i+1;j<count;j++)
            {
                if((s3[i].compareTo(s3[j]))>0)
                {
                    temp = s3[i];
                    s3[i] = s3[j];
                    s3[j] = temp;
                }
            }
        }
        smallest = s3[0];
        largest = s3[count-1];
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}