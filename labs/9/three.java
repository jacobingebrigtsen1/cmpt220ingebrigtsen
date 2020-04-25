package lab9;
import static java.lang.Math.pow;;
import java.util.Random;import java.util.Scanner;
public class three {
	public static void main(String[] args) {
		
		System.out.println(integararray(1));
		System.out.println(integararray(50));
		System.out.println(integararray(100));
		System.out.println(bin2Dec("1111"));
		System.out.println(bin2Dec("100000201"));
		
	}
	
	
	
	
	
	public static int bin2Dec(String binaryString) throws NumberFormatException {
		int number = 0;
		for (int i = 0, j = binaryString.length() - 1; i < binaryString.length(); i++, j--) {
			if (binaryString.charAt(i) < '0' || binaryString.charAt(i) > '1')
				throw new NumberFormatException("The string is not a binary string");
			number += (Integer.parseInt(String.valueOf(binaryString.charAt(i)))) * Math.pow(2, j);
		}
		return number;
	}
	
	
	
	
	public static boolean IllegalTriangleException(int a,int b,int c) throws IllegalTriangleException {
		if(a + b < c | b + c < a | c + a < b) 
			return true;
		else
			throw new IllegalTriangleException("One side of a triangle cannot be greater then the sum of the other two sides");
	}
	
	
	
	
	
	public static int integararray(int number){
		Random rand = new Random();
		int[] intarray=new int[101];
		int randomnum=0;
		for(int i=1;i<101;i++) {
			randomnum=rand.nextInt(10);
			intarray[i]=randomnum;
		}
		System.out.println("enter a number from 1-100");
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		if(input>0 && input<101)
			System.out.println(intarray[input]);
		else
			System.out.println("out of bounds");
	}
}