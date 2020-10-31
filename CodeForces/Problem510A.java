/*
    url : https://codeforces.com/problemset/problem/510/A
*/

import java.util.*;
public class Problem510A {
	public static void main(String[] args) {
	    Scanner in =  new Scanner(System.in);
	    
	    int x = in.nextInt();
	    int y = in.nextInt();
	    
	    int row=1;
	    while(row!=(x+1)){
	        if(row%2==1){
	            for (int i=0;i<y;i++){
	                System.out.print("#");
	            } 
	            System.out.println();
	        } else if (row%4==0){
	            System.out.print("#");
	            for (int i=1;i<y;i++){
	                System.out.print(".");
	            } 
	            System.out.println();
	        } else {
	            for (int i=1;i<y;i++){
	                System.out.print(".");
	            } 
	            System.out.println("#");
	        }
	        row++;
	    }
	    in.close();
	}
}
