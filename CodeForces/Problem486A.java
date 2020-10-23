/*
    https://codeforces.com/problemset/problem/486/A
*/
import java.util.Scanner;
public class Problem486A {
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    int result=0;
	    while(n!=0){
	        if(n%2==0){
    	        result+=n;
	        }else {
	            result-=n;
	        }
	        n--;
	    }
	    System.out.println(result);
	    in.close();
	}
}
