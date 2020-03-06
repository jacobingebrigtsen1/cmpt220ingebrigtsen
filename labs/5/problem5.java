import java.util.Scanner;
public class problem5
{
	public static void main(String [ ] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the matrix you want");
		int size=input.nextInt();
		int[][] matrix1=new int[size][size];
		int counter=1;
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				matrix1[i][j]=counter;  //You didnt specify how you want the numbmers in the matrix , so i made it count from 1- the size, the method itself will work on any size with any numbers
				counter++;
			}
		}
		print2D(matrix1);
		print2D(transpose(matrix1,size));
	}
	public static int[][] transpose(int[][] matrix1,int size)
	{
		int[][] matrix2=new int[size][size];
		
	    for(int i=0; i < size; i++)
	    {
	       for(int j=0;j < size;j++)
	       {
	    	   matrix2[i][j]=matrix1[j][i];
	       }
	    }
		return matrix2;
	}
	 public static void print2D(int mat[][]) //DISCLAIMER this is a method i found online to help make sure MY method worked , its not essential to making the rows and collums swap I just used it for printing out the matrixs
	    { 
	        // Loop through all rows 
	        for (int i = 0; i < mat.length; i++) 
	        {
		        System.out.println("");
	            // Loop through all elements of current row 	
	            for (int j = 0; j < mat[i].length; j++) 
	                System.out.print(mat[i][j] + " "); 
	        }
	        System.out.println("");
	    }
}