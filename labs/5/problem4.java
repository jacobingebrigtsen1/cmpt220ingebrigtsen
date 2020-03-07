import java.util.Scanner;
import java.util.Arrays;
public class problem4 
{
	public static void main(String [ ] args)
	{
		System.out.println("Enter how many numbers you want in the arrays");
  	  	Scanner input = new Scanner(System.in);
  	  	int length=input.nextInt();
  	  	int[] array=new int[length];
  	  	int[] array2=new int[length];
  	  	int number;
  	  	System.out.println("Okay enter"+length+" numbers seperated by line");
  	  	for(int i=0;i<length;i++)
  	  		{
  	  			number = input.nextInt();
  	  			array[i]=number;
  	  			
  	  		}
  	  	System.out.println("Okay enter"+length+" numbers seperated by line for array 2");
  	  	for(int i=0;i<length;i++)
  	  		{
  	  			number = input.nextInt();
  				array2[i]=number;
  	  		}
		System.out.println(equal(array,array2));
	}
	public static boolean equal(int[] array,int[] array2)
	{
		Arrays.sort(array);
		Arrays.sort(array2);
		return(Arrays.equals((array),(array2)));
	}
}