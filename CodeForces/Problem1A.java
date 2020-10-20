/*
Problem https://codeforces.com/problemset/problem/1/A
*/

import java.lang.Math;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    double n = in.nextDouble();
	    double m = in.nextDouble();
	    double a = in.nextDouble();
	    System.out.println((long)(Math.ceil(n/a)*Math.ceil(m/a)));
	    in.close();
	}
}
