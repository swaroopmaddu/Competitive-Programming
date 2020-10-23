/*
    https://codeforces.com/problemset/problem/677/A
*/
import java.util.Scanner;
public class Problem677A {
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    
	    int n = in.nextInt();
	    int h = in.nextInt();
	    int minWidth=0;
	    while(n--!=0){
	        int height = in.nextInt();
	        if(height>h){
	            minWidth++;
	        } 
	        minWidth++;
	    }
	    System.out.println(minWidth);
	    in.close();
	}
}
