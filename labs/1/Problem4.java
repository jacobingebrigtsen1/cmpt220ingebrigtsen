import java.util.Scanner;
public class Problem4{
	public static void main(String[] args) {    
		Scanner input = new Scanner(System.in);
	    System.out.println("Enter A value for mass ");
	    double mass = input.nextDouble();
	    double energy=((mass*299972458)*(mass*299972458));
	    System.out.println(mass+" kilograms creates "+energy+" units of energy");
	}
}
