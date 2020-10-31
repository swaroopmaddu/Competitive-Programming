/*
    url : https://codeforces.com/problemset/problem/996/A
*/

import java.util.*;
public class Problem996A {
	public static void main(String[] args) {
	    Scanner in =  new Scanner(System.in);
	    
	    int amount = in.nextInt();
	    
	    int bills = 0;
	    
	    bills += (amount/100);
	    amount%=100;
	    
	    bills += (amount/20);
	    amount%=20;
	    
	    bills += (amount/10);
	    amount%=10;
	    
	    bills += (amount/5);
	    amount%=5;
	    
	    bills += amount;
	    
	    System.out.println(bills);
	    in.close();
	}
}
