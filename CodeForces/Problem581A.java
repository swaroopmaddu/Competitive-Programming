/*
    url : https://codeforces.com/problemset/problem/581/A
*/

import java.util.*;
public class Problem581A {
	public static void main(String[] args) {
	    Scanner in =  new Scanner(System.in);
	    
	    int red = in.nextInt();
	    int blu = in.nextInt();
	    
	    int same = Math.min(red,blu);
	    
	    red -= same;
	    blu -= same;
	    
	    System.out.printf("%d %d", same,((red+blu)/2));
	    
	    in.close();
	}
}
