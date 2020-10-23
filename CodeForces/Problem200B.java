/*
    https://codeforces.com/problemset/problem/200/B
*/

import java.util.Scanner;
public class Problem200B {
	public static void main(String[] args) {
	    int num;
	    Scanner in = new Scanner(System.in);
	    num = in.nextInt();
	    double count=num,total=0;
	    while(num--!=0){
	       double x = in.nextInt();
	       total += x;
	    }
	    System.out.println(total/count);
	    in.close();
	}
}
