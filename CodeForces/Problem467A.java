/*
    https://codeforces.com/problemset/problem/467/A
*/
import java.util.Scanner;
public class Problem467A {
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    
	    int num = in.nextInt();
	    int people_living,capacity;
	    
	    int hasFreePlace = 0;
	    while(num--!=0){
	        people_living = in.nextInt();
	        capacity = in.nextInt();
	        if(capacity>=(people_living+2)){
	            hasFreePlace++;
	        }
	    }
	    System.out.println(hasFreePlace);
	    in.close();
	}
}
