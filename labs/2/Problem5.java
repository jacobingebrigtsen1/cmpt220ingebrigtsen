import java.util.Scanner;
public class Problem5{
	public static void main(String[] args) {    
		Scanner input = new Scanner(System.in);
	    System.out.println("Enter a word");
	    String word1=input.next();
	    System.out.println("Enter another word");
	    String word2=input.next();
	    
	    if(word1.charAt(0)<word2.charAt(0)) {
	    	System.out.println("The first word is alphebetically first");}
	    	else if(word1.charAt(0)>word2.charAt(0))
	    		System.out.println("The second word is alphebetically first");
	    		else if(word1.charAt(1)<word2.charAt(1))
		    		System.out.println("The first word is alphebetically first");
		    		else if(word1.charAt(1)>word2.charAt(1))
			    		System.out.println("The second word is alphebetically first");
}}