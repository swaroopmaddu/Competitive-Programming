/*
    https://codeforces.com/problemset/problem/271/A
*/
import java.util.Scanner;
public class Problem271A {
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    
	    int year = in.nextInt();
	    while(true){
	        year++;
	        int a =  year / 1000;
            int b = (year / 100) % 10;
            int c = (year / 10)% 10;
            int d =  year % 10;
            if (a != b && a != c && a != d && b != c && b != d && c != d){
                break;
            }
	    }
	    System.out.println(year);
	    in.close();
	}
}
