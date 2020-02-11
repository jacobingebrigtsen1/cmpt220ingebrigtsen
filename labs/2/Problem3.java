import java.util.Scanner;
public class Problem3{
	public static void main(String[] args) {    
		Scanner input = new Scanner(System.in);
	    System.out.println("Enter value for the lower limit ");
	    int lower = input.nextInt();
	    System.out.println("Enter value for the upper limit ");
	    int upper = input.nextInt();
	    
	    double random1=(Math.random() * (upper-lower)+lower);
	    System.out.println((int)random1);
	    
	    random1=(Math.random() * (upper-lower)+lower);
	    System.out.println((int)random1);
	    
	    random1=(Math.random() * (upper-lower)+lower);
	    System.out.println((int)random1);
	}
}
