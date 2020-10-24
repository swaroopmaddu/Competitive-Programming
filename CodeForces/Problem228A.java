/*
    https://codeforces.com/problemset/problem/228/A
*/
import java.util.Scanner;
import java.util.HashSet; 
public class Problem228A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		HashSet<Integer> shoes = new HashSet<>();
		
		for (int i=0;i<4 ;i++ ){
		    int x = in.nextInt();
		    shoes.add(x);
		}
		System.out.println(4-shoes.size());
		in.close();
	}
}
