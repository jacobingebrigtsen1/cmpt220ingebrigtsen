
public class problem2
{
	public static void main(String [ ] args)
	{
	      char[][] matrix= new char [5][5]; //makes 5 x 5
	      for ( int i = 0 ; i < 5 ; i++)
	      {
	    	for(int j=0;j < 5 ; j++)
	    	{
	    		matrix[i][j]=(char)((int)(Math.random()*(25))+97); //fills up 5 x5 with a random number between a-z in char
	    		System.out.print(matrix[i][j]+" ");
	    		
	    	}
	      System.out.println(); //makes it appear as 5x5
	      }
	}
}
