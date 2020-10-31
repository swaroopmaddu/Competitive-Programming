/*
    url : https://codeforces.com/problemset/problem/1154/A
*/

import java.util.*;
public class Problem1154A {
	public static void main(String[] args) {
	    Scanner in =  new Scanner(System.in);
	    int[] nums = new int[4];
	    int max = Integer.MIN_VALUE;
	    
	    for (int i=0;i<4 ;i++ ){
	        nums[i] = in.nextInt();
	        if(max<nums[i]){
	            max = nums[i];
	        }
	    } 
	    for (int i=0;i<4 ;i++ ){
	        int x = max-nums[i];
	        if(x!=0){
	            System.out.printf("%d ", x);
	        }
	    }
	    System.out.println();
	    
	    in.close();
	}
}
