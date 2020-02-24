
public class Problem5 
{
	public static double average(double a,double b ,double c)
	{
		double total=a+b+c;
		return (total/3);
	}
	public static void main(String[] args)
	{
		// JA: You had to get the numbers from the user
		System.out.println(average(2.5,6.1,8.6));
	}
}