/*
    https://codeforces.com/problemset/problem/41/A
*/

import java.util.Scanner;
public class Problem41A {
	public static void main(String[] args) {
	    
	    Scanner in = new Scanner(System.in);
	    String s = in.nextLine();
	    String t = in.nextLine();
	    
	    int sLength = s.length();
	    int tLength = t.length();
	    
	    if(sLength!=tLength){
	        System.out.println("NO");
	        return;
	    } 
	    
	    for (int i=0;i<sLength ;i++ ){
	        if(s.charAt(i) != t.charAt(sLength-i-1)){
	            System.out.println("NO");
	            return;
	        }
	    }
	    System.out.println("YES");
	    in.close();
	}
}
