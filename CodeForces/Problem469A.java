/*
    https://codeforces.com/problemset/problem/469/A
*/
import java.util.Scanner;
public class Problem469A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] rounds = new int[n];
		int p = in.nextInt();
		for (int i=0;i<p ;i++ ){
		    int r = in.nextInt();
		    rounds[r-1] =1;
		}
		int q = in.nextInt();
		for (int i=0;i<q ;i++ ){
		    int r = in.nextInt();
		    rounds[r-1] =1;
		}
		
		int count = 0;
		for (int i=0;i<n ;i++ ){
		    if(rounds[i]==1){
		        count++;
		    }
		}
		if(count==n){
		    System.out.println("I become the guy.");
		} else {
		    System.out.println("Oh, my keyboard!");
		}
		in.close();
	}
}
