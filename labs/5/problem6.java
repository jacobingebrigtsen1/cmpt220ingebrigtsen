import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class problem6
{
	public static void main(String [ ] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the matrix you want");
		int size=input.nextInt();
		double[][] matrix1=new double[size][size];
		Random rand = new Random(); 
		double random = 0.0; 
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				random=rand.nextDouble();
				matrix1[i][j]=random;  //decided to make it fill the array up randomly
			}
		}
		print2D(matrix1);
		System.out.println(averageRow(matrix1,2));
	}
	public static double averageRow(double[][] array, int row)
	{
		double total=0;
		for(int i=0;i<array.length;i++)
			total+=array[row][i];
		return total/array.length;
	}
	 public static void print2D(double mat[][]) //DISCLAIMER this is a method i found online to help make sure MY method worked , its not essential to making the rows and collums swap I just used it for printing out the matrixs
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