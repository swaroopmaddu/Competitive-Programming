  /*
    https://codeforces.com/problemset/problem/546/A
*/

import java.util.Scanner;
public class Problem546A {
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    long k = in.nextInt();
	    long n = in.nextInt();
	    long w = in.nextInt();
	    long total = 0;
	    
	    for (long i=1;i<=w ;i++ ) {
	        total += (k*i);
	    }
	    if(total<=n){
	        System.out.println(0);
	    } else {
	        System.out.println(total-n);
	    }
	    in.close();
	}
}
