/*
  https://codeforces.com/problemset/problem/144/A
*/
import java.util.Scanner;
public class Problem144A {
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    int[] array = new int[n];
	    
	    int minIndex = 0;
	    int maxIndex = 0;
	    int minVal = 101;
	    int maxVal = 0;
	    
	    for (int i=0;i<n ;i++ ){
	        array[i] = in.nextInt();
	        if(array[i]<=minVal){
	            minVal = array[i];
	            minIndex = i;
	        } 
	        if(array[i]>maxVal){
	            maxVal = array[i];
	            maxIndex = i;
	        }
	    }

        if(maxIndex>minIndex){
            minIndex++;
        }
        System.out.println(maxIndex+(n-1)-minIndex);
	    in.close();
	}
}
