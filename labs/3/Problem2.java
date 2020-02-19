import java.util.Scanner;
public class Problem2{
	public static void main(String[] args) {
		int counter=0;
	    for (int i = 100; i < 501; i++){
	    	if(i%5==0 ^ i%7==0){
	    		counter++;
	    		System.out.print(i+" ");
	    		if(counter==10){
	    			counter=0;
	    			System.out.println("");
	    		}
	    	}
	    }
	    
	}
}