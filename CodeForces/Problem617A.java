/*
    https://codeforces.com/problemset/problem/617/A
*/

import java.util.Scanner;
public class Problem617A {
	public static void main(String[] args) {
	    
	    Scanner in = new Scanner(System.in);
	    int x = in.nextInt();
	    int minSteps = 0;
	    if(x>0){
	        minSteps+= (x/5);
	        x %= 5;
	    } 
	    if(x>0){
	        minSteps+= (x/4);
	        x %= 4;
	    } 
	    if(x>0){
	        minSteps+= (x/3);
	        x %= 3;
	    } 
	    if(x>0){
	        minSteps+= (x/2);
	        x %= 2;
	    } 
	    if(x>0){
	        minSteps+= x;
	    }
	    System.out.println(minSteps);
	    in.close();
	}
}
