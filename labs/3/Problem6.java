import java.util.Scanner;

public class Problem6 
{
	public static int vowels(String s)
	{
		int count=0;
		 for (int i = 0; i < s.length(); i++)
	        {
	            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i'
	                    || s.charAt(i) == 'o' || s.charAt(i) == 'u')
	            {
	                count++;
	            }
	        }
		 return count;
	}
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
	    System.out.println("Enter a word and we shall return the # of vowels");
		System.out.println(vowels(input.nextLine())); // JA: nextLine() reads the complete line
	}
}