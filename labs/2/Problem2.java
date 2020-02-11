import java.util.Scanner;
public class Problem2{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    System.out.println("Enter a number 1-12 and ill print out the corresponding month");
	    int month=input.nextInt();
	    String[] months= {"January","Febuary","March","April","May","June","July","Augest","September","October","November","December"};
	    System.out.println(months[month-1]);
	}
}
