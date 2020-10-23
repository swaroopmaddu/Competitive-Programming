/*
    https://codeforces.com/problemset/problem/705/A
*/
import java.util.Scanner;
public class Problem705A {
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    
	    int n = in.nextInt();
	    int num=1;
	    while(n!=0){
	        if(num%2==1){
    	        System.out.print("I hate ");
	        }else {
	            System.out.print("I love ");
	        }
    	    num++;
	        if(--n==0){
	            System.out.println("it");
	        }else{
	            System.out.print("that ");
	        }
	        
	    }
	    in.close();
	}
}
