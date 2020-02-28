 import java.util.Scanner;
 import java.util.ArrayList;
 import java.util.*;
public class problem8
{   
	 public static void main(String[] args) 
	 {
        
        Scanner input = new Scanner(System.in);
        List<Integer> mylist= new ArrayList<Integer>();
        System.out.println("Enter your numbers: ");
        int response=input.nextInt();
        while(response!=0) {
            if(response>0) {
                mylist.add(response);
            }//ends if
            response= input.nextInt();
        }//ENDS WHILE
        Collections.sort(mylist);  
        System.out.println(mylist);
	 }
}