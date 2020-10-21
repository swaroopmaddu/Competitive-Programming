/*
https://codeforces.com/problemset/problem/112/A
*/
import java.util.Scanner;
public class Problem112 {
	public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	String str1 = in.next();
    	str1 = str1.toLowerCase();
    	String str2 = in.next();
    	str2 = str2.toLowerCase();
        int result = str1.compareTo(str2);
        
        if(result<0){
            System.out.println("-1");
        } else if(result>0){
            System.out.println("1");
        } else {
            System.out.println("0");
        }
	}
}
