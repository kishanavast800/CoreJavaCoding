import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;
 class Example {
   public static void main(String[] args)throws IOException {
	/* The pattern "EEE" for Day of the week in short form
	 * such as "Mon", "Tue", "Wed" etc.
	 */
	 Scanner buf = new Scanner(System.in);
	// Date now = new Date();
	 String date_1 = "20/12/1999";
	 SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
	Date date1=dateFormat.parse(date_1); 
	SimpleDateFormat sdf = new SimpleDateFormat("EEE");
	String stringDate = sdf.format(date1);
	System.out.println("Today is: "+stringDate);
		
	/* The pattern "EEEE" for Day of the week in full form
	 * such as "Monday", "Tuesday", "Wednesday" etc.
	 */
	SimpleDateFormat sdf2 = new SimpleDateFormat("EEEE");
	String stringDate2 = sdf2.format(date1);
	System.out.println("Today is: "+stringDate2);
   }
}
