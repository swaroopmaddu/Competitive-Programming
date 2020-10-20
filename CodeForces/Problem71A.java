/*
Problem https://codeforces.com/problemset/problem/71/A
*/

import java.util.Scanner;
public class Problem71A{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    int num = in.nextInt();
	    
	    while(num--!=0){
	        String word = in.next();
	        int length = word.length();
	        if(length>10){
	            System.out.println(word.charAt(0)+String.valueOf((length-2))+word.charAt(length-1));
	        }else {
	            System.out.println(word);
	        }
	    }
	    in.close();
	}
}
