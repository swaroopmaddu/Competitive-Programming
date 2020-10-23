/*
    https://codeforces.com/problemset/problem/734/A
*/
import java.util.Scanner;
public class Problem734A {
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int num = in.nextInt();
	    String s = in.next();
	    int Anton = 0, Danik=0;
	    while(--num!=-1){
	        if(s.charAt(num)=='A'){
	            Anton++;
	        } else {
	            Danik++;
	        }
	    }
	    if(Anton>Danik){
	        System.out.println("Anton");
	    }else if(Danik>Anton){
	        System.out.println("Danik");
	    }else{
	        System.out.println("Friendship");
	    }
	    in.close();
	}
}
