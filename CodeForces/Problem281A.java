/*
    https://codeforces.com/problemset/problem/281/A
*/
import java.util.Scanner;

public class Problem281A {
	public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	
    	String word = in.next();
    	
    	String upperCase = word.substring(0, 1).toUpperCase() + word.substring(1);
        System.out.println(upperCase); 
    	
    	in.close();
	}
}
