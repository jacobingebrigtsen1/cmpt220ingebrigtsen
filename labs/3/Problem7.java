import java.util.Scanner;
public class Problem7 {
public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter where u want to start pentagonal theorum");
		int n = input.nextInt();
   		int count = n;
		for(int i = n; i <=n + 50; i++){
			System.out.printf("%-6d",getPentagonalNumber(i));
			if(count % 10 == 0) System.out.println();
			count++;
		}
    }
  public static int getPentagonalNumber(int i) {
		return (i * (3 * i - 1))/2;
	}
}