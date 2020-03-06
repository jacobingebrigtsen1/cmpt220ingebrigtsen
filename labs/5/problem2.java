import java.util.Scanner;

public class problem2
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
		System.out.println(mean(array));
		System.out.println(deviation(array));
	}

	public static double mean(double[] x)
	{
		double total=0;
		for(int i=0;i<x.length;i++)
		{
			total+=x[i];
		}
		return (total/x.length);
	}
	public static double deviation(double[] x)
	{
		double total=0;
		for(int i=0;i<x.length;i++)
		{
			total+=x[i];
		}
		double mean= (total/x.length);
		double total2=0;
		for(int i=0;i<x.length;i++)
		{
			total2+=((x[i]*x[i])-mean);
		}
		return Math.sqrt(total2/x.length);
	}
}
