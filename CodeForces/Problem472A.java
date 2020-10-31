/*
    url : https://codeforces.com/problemset/problem/472/A
*/

import java.util.*;
public class Problem472A {
	public static void main(String[] args) {
	    Scanner in =  new Scanner(System.in);
	    
	    int n = in.nextInt();
	    if(n%2==0){
	        System.out.printf("%d %d",(n-4),4);
	    }else{
	        System.out.printf("%d %d",(n-9),9);
	    }
	}
}
