import java.util.Scanner;
public class Problem1{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    System.out.println("Enter a positive integar the input ends in 0");
	    int n = input.nextInt();
	    int counter=0;
	    int totcounter=0;
	    int sum=0;
	    while(n != 0){
	    	totcounter++;
	    	if(n%2==0){
	    		counter++;
	    	}
	    	sum+=n;
	    	n=input.nextInt();
	    }
	    System.out.println("even numbers:"+counter);
	    System.out.println("sum:"+sum);
	    System.out.println("Average:"+((double)sum/totcounter));
	}}