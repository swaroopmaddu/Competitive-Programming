/*
    https://codeforces.com/problemset/problem/61/A
*/

import java.util.Scanner;
public class Problem61A {
	public static void main(String[] args) {
	    String b1, b2;
	    Scanner in = new Scanner(System.in);
	    b1 = in.nextLine();
	    b2 = in.nextLine();
	    for (int i=0;i<b1.length() ;i++ ){
	        if(b1.charAt(i)==b2.charAt(i)){
	            System.out.print("0");
	        }else {
	            System.out.print("1");
	        }
	    } 
	    System.out.println();
	    in.close();
	}
}
