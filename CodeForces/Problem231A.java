/*
Problem https://codeforces.com/problemset/problem/231/A
*/


import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    int num = in.nextInt();
	    int canSolve = 0;
	    while(num--!=0){
	        int[] array = new int[]{0,1};
	        for (int i=0;i<3 ;i++ ) {
	            int x = in.nextInt();
	            array[x] = array[x]+1;
	        }
	        if(array[0]<2){
	            canSolve++;
	        }
	    }
	    System.out.println(canSolve);
	    in.close();
	}
}
