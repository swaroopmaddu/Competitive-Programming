/*
    https://codeforces.com/problemset/problem/977/A
*/
import java.util.Scanner;
public class Problem977A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		long n = in.nextLong();
		int k = in.nextInt();
		
		while(k--!=0){
		    if(n%10==0){
		        n /= 10;
		    } else{
		        n--;
		    }
		}
		System.out.println(n);
		in.close();
	}
}
