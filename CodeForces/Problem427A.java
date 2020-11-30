/*
    url https://codeforces.com/problemset/problem/427/A
*/

import java.util.Scanner;
class Problem427A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int policeman =0;
        int untreated = 0;
        while (t--!=0){ 
            int input = in.nextInt();
            if(input ==-1){
                if(policeman>0) policeman--;
                else untreated++;
            } else {
                policeman += input;
            }
        }
        System.out.println(untreated);
        in.close();
    }
}