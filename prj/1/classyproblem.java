package classy;
import java.util.Scanner;
import java.util.Arrays;

// JA: Comments? Screenshot of Kattis?
public class classyproblem
{
	public static void main(String [ ] args)
	{
		Scanner input = new Scanner(System.in);
		int cases = input.nextInt();
		String person = "";
		for(int i=0;i<cases;i++)
		{
			int people = input.nextInt();
			String[] soontobesorted = new String[people];
			for(int j=0;j<people;j++)
			{
				person = input.next();
				String level=input.next();
				input.nextLine();
				soontobesorted[j]=reprocess(person+level);
			}
			Arrays.sort(soontobesorted);
			for(int j=0;j<soontobesorted.length;j++)
			{
				System.out.println(soontobesorted[j].substring(10));
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
		reprocessed=reprocessed;
		for(int i=1;i<stratumarray.length+1;i++)
		{
			if(stratumarray[i-1].equals("upper"))
				reprocessed="0"+reprocessed;
			if(stratumarray[i-1].equals("middle"))
				reprocessed="1"+reprocessed;
			if(stratumarray[i-1].equals("lower"))
				reprocessed="2"+reprocessed;
		}
		for(int i=stratumarray.length+1;i<=10;i++)
		{
			reprocessed+="1";
		}
		reprocessed+=ppl;
		return reprocessed;
	}
}