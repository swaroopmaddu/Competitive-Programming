/*
    url : https://codeforces.com/problemset/problem/1335/A
*/

import java.util.*;
public class Problem1335A {
	public static void main(String[] args) {
	    Scanner in =  new Scanner(System.in);
	    
	    int num = in.nextInt();
	    
	    while(num--!=0){
	        long candies = in.nextLong();
	        if(candies%2==0){
	            candies-=1;
	        }
	        System.out.println(candies/2);
	    }
	}
}
