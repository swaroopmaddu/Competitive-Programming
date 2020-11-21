import java.util.Arrays;
import java.util.Scanner;

/*
    https://codeforces.com/problemset/problem/1399/A
*/
public class Problem1399A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while(t--!=0){
            int n = in.nextInt();
            int[] array = new int[n];
            for(int i=0;i<n ;i++)
                array[i] = in.nextInt();
            Arrays.sort(array);
            int isCapable = 1;
            for(int i=0;i<n-1;i++){
                if(array[i+1]-array[i]>1){
                    isCapable = 0;
                    break;
                }
            }
            if(isCapable==1) System.out.println("YES");
            else System.out.println("NO");
        }
        in.close();
    }
}
