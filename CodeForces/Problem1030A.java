/*
    https://codeforces.com/problemset/problem/1030/A
*/
import java.util.Scanner;
public class Problem1030A {
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    
	    int n = in.nextInt();
	    
	    while(n--!=0){
	        int notEasy = in.nextInt();
	        if(notEasy==1){
	            System.out.println("HARD");
	            return;
	        }
	    }
	    System.out.println("EASY");
	    in.close();
	}
}
