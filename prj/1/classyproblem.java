package classy;
import java.util.Scanner;
import java.util.Arrays;
public class classyproblem
{
	public static void main(String [ ] args)
	{
		Scanner input = new Scanner(System.in);
		int cases = input.nextInt();
		int people = input.nextInt();
		String person = "";
		String[] soontobesorted = new String[people];
		for(int i=0;i<cases;i++)
		{
			for(int j=0;j<people;j++)
			{
				person = input.next();
				System.out.println(person);
				soontobesorted=new String[people];
				soontobesorted[j]=reprocess(person);
			}
			Arrays.sort(soontobesorted);
			for(int j=0;j<soontobesorted.length;j++)
			{
				System.out.println(soontobesorted[j]);
			}
			System.out.println("==============================");
		}
	}
	public static String reprocess(String input)
	{
		String ppl = input.substring(0,input.indexOf(":"));
		String stratum = input.substring(input.indexOf(":")+1);
		String[] stratumarray=stratum.split("-");
		String reprocessed="";
		reprocessed=reprocessed+ppl;
		for(int i=1;i<stratumarray.length+1;i++)
		{
			if(stratumarray[i-1].equals("upper"))
				reprocessed="2"+reprocessed;
			if(stratumarray[i-1].equals("middle"))
				reprocessed="1"+reprocessed;
			if(stratumarray[i-1].equals("lower"))
				reprocessed="0"+reprocessed;
		}
		
		return reprocessed;
	}
}
