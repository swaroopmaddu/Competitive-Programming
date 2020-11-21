/*
    https://codeforces.com/problemset/problem/1328/A
*/
import java.util.Scanner;
public class Problem1328A {
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int num = in.nextInt();
	    
	    while(num--!=0){
	        int a = in.nextInt();
	        int b = in.nextInt();
	        if(a%b==0){
	            System.out.println(0);
	        }else{
	            int n = (a/b+1)*b;
	            System.out.println(n-a);
	        }
	    }
	    
	    in.close();
	}
}
