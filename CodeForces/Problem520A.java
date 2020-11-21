/*
    url https://codeforces.com/problemset/problem/520/A
*/

import java.util.Scanner;
import java.util.HashSet;
public class Problem520A {
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int size = in.nextInt();
	    String str = in.next();
	    str = str.toLowerCase();
	    HashSet<Character> chars = new HashSet<Character>();
	    
	    for(int i=0;i<size;i++){
	        chars.add(str.charAt(i));
	    }
	    
	    if(chars.size()==26){
	        System.out.println("YES");
	    } else {
	        System.out.println("NO");
	    }
	    in.close();
	}
}
