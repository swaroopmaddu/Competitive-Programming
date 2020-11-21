/*
    url : https://codeforces.com/problemset/problem/141/A
*/

import java.util.*;
public class Problem141A {
	public static void main(String[] args) {
	    Scanner in =  new Scanner(System.in);
	    String s1 = in.next();
	    String s2 = in.next();
	    String s3 = in.next();
	    s1 += s2;
	    char chars[] = s1.toCharArray(); 
        Arrays.sort(chars);
        
        char required[] = s3.toCharArray(); 
        Arrays.sort(required);
 
        String sortedStr = new String(chars);
        String sortedRes = new String(required);
        
        if(sortedStr.equals(sortedRes)==true){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

	    in.close();
	}
}
