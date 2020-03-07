import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
public class problem7
{
	public static void main(String [ ] args)
	{
		double[][] matrix1=new double[][]{ {1,2,3,4} , {0,1,2,3} , {0,0,1,2} , {0,0,0,1} }; //is upper triangular
		double[][] matrix2=new double[][]{ {1,2,3,4} , {1,1,2,3} , {0,1,1,2} , {0,1,0,1} }; //is not upper triangular
		print2D(matrix1);
		System.out.println(isUpperTriangular(matrix1));
		print2D(matrix2);
		System.out.println(isUpperTriangular(matrix2));
	}
	public static boolean isUpperTriangular(double[][] array)
	{
        for (int i = 1; i < array.length ; i++) 
            for (int j = 0; j < i; j++) 
                if (array[i][j] != 0) 
                    return false; 
        return true; 
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