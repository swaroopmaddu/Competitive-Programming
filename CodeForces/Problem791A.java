/*
    https://codeforces.com/problemset/problem/791/A
*/

import java.util.Scanner;
public class Problem791A {
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int Limak  = in.nextInt();
	    int Bob  = in.nextInt();
	    
	    int weeks = 0;
	    
	    while(Limak<=Bob){
	        Bob *= 2;
	        Limak *= 3;
	        weeks++;
	    }
	    System.out.println(weeks);
	    in.close();
	}
}
