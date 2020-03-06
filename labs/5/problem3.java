import java.util.Arrays;
import java.util.Scanner;
public class problem3
{
	public static void main(String [ ] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the total Number of Students");
		int totalstudents=input.nextInt();
		String nameinput="";
		String[] array=new String[totalstudents];
	    for(int i=0;i<totalstudents;i++)  //takes the the word and reverses it
	    	{
	    		  System.out.println("Enter a student and grade like so 3.71Jacob");
	    		  nameinput=input.next();
	    		  array[i]=nameinput;
	    	}
	    Arrays.sort(array);
	    for(int i=0;i<totalstudents;i++)
	    {
	    	System.out.println(array[i]);
	    }
	    


	}
}
