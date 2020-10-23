/*
    https://codeforces.com/problemset/problem/344/A
*/
import java.util.Scanner;
public class Problem344A {
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    
	    int n = in.nextInt();
	    int lastIn = in.nextInt();
	    int count = 1;
	    while(n--!=1){
	        int in_ = in.nextInt();
	        if(in_!=lastIn){
	            lastIn = in_;
	            count++;
	        } 
	    }
	    System.out.println(count);
	    in.close();
	}
}
