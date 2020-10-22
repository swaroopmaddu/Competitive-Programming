/*
    https://codeforces.com/problemset/problem/116/A
*/
import java.util.Scanner;
public class Problem116A {
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    
	    int num = in.nextInt();
	    int initial = in.nextInt();
	    int passengers = in.nextInt();
	    int minCapacity = passengers;
	    while(num--!=1){
	        int out = in.nextInt();
	        passengers -= out;
	        int in_ = in.nextInt();
	        passengers += in_;
	        if(passengers>minCapacity){
	            minCapacity = passengers;
	        }
	    }
	    System.out.println(minCapacity);
	    in.close();
	}
}
