import java.util.Scanner;
public class problem4
{
	public static void main(String [ ] args)
	{
		Scanner input = new Scanner(System.in);
		String word = input.nextLine();
		int count=0;
		for(int i = 97 ; i <123 ; i++) //uses char to int conversions
		{
			   for(int j = 0; j < word.length(); j++) 
			   {    
		            if(word.charAt(j) ==(i))
		            {
		                count++; //counts each number of instaces of each number
		            }
			   }
			   char character=(char)(i);
			   System.out.println(character+" "+ count);
			   count=0;
		}
	}
}