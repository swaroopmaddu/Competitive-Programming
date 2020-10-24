/*
    https://codeforces.com/problemset/problem/148/A
*/
import java.util.Scanner;
public class Problem148A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int k = in.nextInt();
		int l = in.nextInt();
		int m = in.nextInt();
		int n = in.nextInt();
		int d = in.nextInt();
		int[] dragons = new int[d];
		
		if(k==1||l==1||m==1||n==1){
		    System.out.println(d);
		    return;
		}
		
		for (int i=0;i<d ;i++ ){
		    if((i+1)%k==0){
		        dragons[i] = 1;
		    }
		    if((i+1)%l==0){
		        dragons[i] = 1;
		    }
		    if((i+1)%m==0){
		        dragons[i] = 1;
		    }
		    if((i+1)%n==0){
		        dragons[i] = 1;
		    }
		}
		int count = 0;
		for (int i=0;i<d ;i++ ){
		    if(dragons[i]==1){
		        count++;
		    }
		} 
		System.out.println(count);
		in.close();
	}
}
