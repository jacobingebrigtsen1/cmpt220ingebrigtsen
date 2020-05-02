import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args) throws Exception{
		File file = new File("Exercise 10_1");
		if(file.exists()){
			System.out.println("File Already Exists");
			System.exit(0);
		}
		
		
		
		
		try(PrintWriter output=new PrintWriter(file);){
			for(int i=0;i<100;i++) {
				output.print(((int)(Math.random() * 100) + 1));
                output.print(" ");
			}
		}
		
		ArrayList<Integer> list = new ArrayList<>();
		try(Scanner input=new Scanner(file);){
			while(input.hasNext()) 
				list.add(input.nextInt());
		}	
		Collections.sort(list);
		System.out.print(list.toString());
		System.out.println();
	}
}
