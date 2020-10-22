/*
    https://codeforces.com/problemset/problem/236/A
*/

import java.util.Scanner;
public class Problem236A {
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    String username = in.next();
	    int[] chars = new int[26];
	    int distinct = 0;
	    for (int i=0;i<username.length();i++ ){
	        int index = (int)username.charAt(i)- 97;
	        if(chars[index] == 0){
	            chars[index] = 1;
	            distinct += 1;
	        }
	    }
	    if(distinct%2==0){
	        System.out.println("CHAT WITH HER!");
	    } else{
	        System.out.println("IGNORE HIM!");
	    }
	    in.close();
	}
}
