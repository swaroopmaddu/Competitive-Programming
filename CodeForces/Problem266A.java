/*
    https://codeforces.com/problemset/problem/266/A
*/
import java.util.Scanner;

public class Problem266A {
	public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	
    	int num = in.nextInt();
    	String stones = in.next();
    	
    	int removals = 0;
    	for (int i=0;i<num-1; i++ ){
    	    if(stones.charAt(i) == stones.charAt(i+1)){
    	        removals++;
    	    }
    	} 
    	System.out.println(removals);
    	in.close();
	}
}
