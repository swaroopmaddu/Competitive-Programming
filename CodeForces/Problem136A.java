/*
    https://codeforces.com/problemset/problem/136/A
*/
import java.util.Scanner;
public class Problem136A {
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    
	    int num = in.nextInt();
	    int[] array = new int[num];
	    
	    for (int i=1;i<=num ;i++ ){
	        int n = in.nextInt();
	        array[n-1] = i;
	    } 
	    for (int i=0;i<num ;i++ ){
	        System.out.print(array[i]);
	        System.out.print(" ");
	    } 
	    System.out.println();
	    in.close();
	}
}
