import java.util.Scanner;
public class Problem1{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    System.out.println("Enter value for the first number ");
	    int number1 = input.nextInt();
	    System.out.println("Enter value for the second number ");
	    int number2 = input.nextInt();
	    
	    System.out.println(number1 < number2);
	    System.out.println(number1 <= number2);
	    System.out.println(number1 == number2);
	    System.out.println(number1 != number2);
	    System.out.println(number1 > number2);
	    System.out.println(number1 >= number2);
	}
}