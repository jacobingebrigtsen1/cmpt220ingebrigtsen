import java.util.Scanner;
public class problem5
{
	public static void main(String [ ] args)
	{
		int [] numbers=new int[1000];
		for(int i=0;i<1000;i++)
		{
			double randNumber = Math.random(); //gets thousand random numbers and puts them in numbers[]
			double d = randNumber * 100;			
			numbers[i]=(int)d;
		}
		int total=0;
		for(int i=0;i<1000;i++) //takes thouseand numbers and gets the total
		{
			total+=numbers[i];
		}
		int average=(int)total/1000; //math calculations to get the average
		int totalL=0;
		int totalH=0;
		for(int i=0;i<1000;i++)
		{
			if(numbers[i]>average) //figures out if its higher or lower based on the average
			{
				totalH++;
			}
			if(numbers[i]<average)
			{
				totalL++;
			}
		}
		System.out.println("Average: "+average);
		System.out.println("Numbers higher: "+totalH);
		System.out.println("Numbers lower: "+totalL);
	}
}