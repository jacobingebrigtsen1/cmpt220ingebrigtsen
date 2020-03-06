import java.util.Scanner;

public class problem1 
{
	public static void main(String [ ] args)
	{
		System.out.println("Enter 10 numbers and ill tell you the mean and standard deviation");
  	  	Scanner input = new Scanner(System.in);
  	  	double[] array=new double[10];
  	  	for(int i=0;i<10;i++)
  	  		{
  	  			double number = input.nextDouble();
  	  			array[i]=number;
  	  			
  	  		}
		System.out.println(max(array));
	}
	public static double max(double[] array)
	{
		double highest=array[0];
		for(int i=0;i<array.length;i++)
		{
			if(array[i]>highest)
			{
				highest=array[i];
			}
		}
		return highest;
	}
}
