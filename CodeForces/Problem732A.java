/*
    https://codeforces.com/problemset/problem/732/A
*/
import java.util.Scanner;
public class Problem732A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int r = in.nextInt();
        int numItems = 1;
        while ((((k*numItems)-r)%10!=0) && ((k*numItems)%10!=0 ) ) {
            numItems++;
        }
        System.out.println(numItems);
        in.close();
    }
}
