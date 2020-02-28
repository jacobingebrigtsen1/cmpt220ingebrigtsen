 import java.util.Scanner;
 import java.util.ArrayList;
 import java.util.*;
public class problem7
{   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers in your list? ");
        int size = scan.nextInt();
        int[] arr = new int[size];
        for (int i=0; i<size; i++) {
            arr[i]=scan.nextInt();
        }//creates array with users length preference
        List<Integer> noDuplicates= new ArrayList<Integer>();
          for(int i=0; i<arr.length; i++) {// 1, 2, 3, 1, 2
              for(int x=1; x<arr.length-1; x++) {
                  if(!noDuplicates.contains(arr[i])) {// if it does not have this number, it will add it
                  noDuplicates.add(arr[i]);
                  }////ends if
              }//ends for x
          }//ends for i
       int[] newArr = new int[noDuplicates.size()];
       for(int i=0; i<noDuplicates.size(); i++) {
       newArr[i] = noDuplicates.get(i);
       System.out.println(newArr[i]);
        }
    }
}