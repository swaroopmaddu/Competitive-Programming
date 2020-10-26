/*
    https://codeforces.com/problemset/problem/443/A
*/
import java.util.Scanner;
import java.util.HashSet;
public class Problem443A {
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    String str = in.nextLine();
	    HashSet<Character> set = new HashSet<Character>();
	    for (int i=0;i<str.length();i++){
	        set.add(str.charAt(i));
	    } 
	    if(set.size()>4){
    	    System.out.println(set.size()-4);
	    } else {
	        System.out.println(set.size()-2);
	    }
	    in.close();
	}
}
