/*
Problem4A url https://codeforces.com/problemset/problem/4/A
*/
import java.util.Scanner;
public class Problem4A{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    int num = in.nextInt();
	    
	    if(num%2==0 && num>2){
	        System.out.println("YES");
	    } else {
	        System.out.println("NO");
	    }
	    in.close();
	}
}
