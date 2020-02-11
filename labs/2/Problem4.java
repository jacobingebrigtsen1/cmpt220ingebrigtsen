import java.util.Scanner;
public class Problem4{
	public static void main(String[] args) {    
		Scanner input = new Scanner(System.in);
	    System.out.println("Enter first char ");
	    char first = input.next().charAt(0);
	    System.out.println("Enter second char ");
	    char second = input.next().charAt(0);
	    
	    System.out.println(first+second);
	}
}
