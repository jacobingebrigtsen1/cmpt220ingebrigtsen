import java.util.Scanner;
public class Problem3{
	public static void main(String[] args) {    
		Scanner input = new Scanner(System.in);
	    System.out.println("Enter A value for ounces ");
	    double ounces = input.nextDouble();
	    double grams=(ounces*28.3495);
	    System.out.println("There are "+grams+" in "+ounces+" ounces");
	    
	    
	}
}
