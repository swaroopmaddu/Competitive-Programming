/*
https://codeforces.com/problemset/problem/282/A
*/
import java.util.Scanner;
public class Problem282A {
	public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	int num = in.nextInt();
    	int x = 0;
    	while(num--!=0){
    	    String operation = in.next();
    	    if(operation.contains("++")){
    	        x++;
    	    } else{
    	        x--;
    	    }
    	}
    	System.out.println(x);
	}
}
