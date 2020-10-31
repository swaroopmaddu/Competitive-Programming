/*
    url : https://codeforces.com/problemset/problem/750/A
*/

import java.util.*;
public class Problem750A {
	public static void main(String[] args) {
	    Scanner in =  new Scanner(System.in);
	    
	    int problems = in.nextInt();
	    int timeReq = in.nextInt();
	    
	    int canSolve = 0;
	    
	    for (int i=1;i<=problems;i++){
	        if(i*5+timeReq<=240){
	            timeReq+=(i*5);
	            canSolve++;
	        }
	    } 
	    System.out.println(canSolve);
	    in.close();
	}
}
