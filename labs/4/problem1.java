
public class problem1 
{
	public static void main(String [ ] args)
	{
	      System.out.println("in     cm   |   cm     in");
	      System.out.println("---------------------------");
	      String format = "|%2d %6.2f  |  %3d  %6.2f";
	      for(int i=1,j=1;i<51;i++,j+=5)
	      {
	    	    System.out.printf(format,i, (i*2.54),(j),(j*1/2.54));
	    	    System.out.println("");
	      }
	}
}
