/*
    https://codeforces.com/problemset/problem/486/A
*/
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    long n = in.nextLong();
	    long result=0;
	    
	    if(n%2==0){
	        result = n/2;
	    } else {
	        result = ((n + 1) / 2) * (-1);
	    }
	    System.out.println(result);
	    in.close();
	}
}
