import java.util.Scanner;
public class problem3
{
	public static void main(String [ ] args)
	{
	    	  System.out.println("Enter String and ill tell you if its palindrome");
	    	  Scanner input = new Scanner(System.in);
	    	  String word = input.nextLine();
	    	  String wordR="";
	    	  for(int i=word.length()-1;i>=0;i--)  //takes the the word and reverses it
	    	  {
	    		  wordR=wordR+word.charAt(i);
	    	  }
	    	  System.out.println(word.equals(wordR)); //checks if the reversed word equals the word
	}
}
