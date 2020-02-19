public class Problem3{
	public static void main(String[] args) {
		int counter=0;
	    for (int i = 1; i < 101; i++){
	    		counter++;
	    		System.out.print((char)(i)+" ");
	    		if(counter==20){
	    			counter=0;
	    			System.out.println("");
	    		}
	    		
	    }
	}
}