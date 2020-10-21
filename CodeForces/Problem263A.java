/*
    https://codeforces.com/problemset/problem/263/A
*/
import java.util.Scanner;
import java.lang.Math;
public class Problem263A {
	public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	
    	int[][] matrix = new int[5][5];
    	
    	
    	int one_i=0,one_j=0;
    	
    	for (int i=0; i<5 ;i++ ){
    	    for (int j=0;j<5 ;j++ ){
    	        matrix[i][j] = in.nextInt();
    	        if(matrix[i][j]==1){
    	            one_i = i;
    	            one_j = j;
    	        }
    	    } 
    	} 
    	
    	int x = Math.abs(2-one_i);
    	int y = Math.abs(2-one_j);
    	System.out.println(x+y);
    	in.close();
	}
}
