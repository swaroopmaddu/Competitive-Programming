/*
    https://codeforces.com/problemset/problem/1352/A
*/
import java.util.Scanner;
import java.util.ArrayList;
public class Problem1352A {

	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int num = in.nextInt();
	    
	    while(num--!=0){
            int n = in.nextInt();
            ArrayList<Integer> vals = new ArrayList<Integer>();
	        while(n>10){
                int x = (int) (Math.log10(n) + 1);
                x = (int) Math.pow(10, x-1);
                x = x*(n/x);
                vals.add(x);
                n = n -x;
            }
            if(n!=0) vals.add(n);

            System.out.println(vals.size());
            for(int i=0; i<vals.size();i++){
                System.out.print(vals.get(i));
                System.out.print(" ");
            }
            System.out.println();
	    }
	    
	    in.close();
	}
}
