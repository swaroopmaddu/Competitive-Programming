/*
https://codeforces.com/problemset/problem/158/A
*/
import java.util.Scanner;

public class Porblem158A {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int participants;
        participants = in.nextInt();
        int k = in.nextInt();
        
        int kth_score=0;
        
        for (int i=0; i<k; i++ ){
            kth_score = in.nextInt();
            if(kth_score<1){
                System.out.println(i);
                return;
            }
        } 
        int temp=0;
        for (int i=k; i<participants ; i++ ){
            temp = in.nextInt();
            if(temp!=kth_score){
                System.out.println(i);
                return;
            }
        } 
        System.out.println(participants);
	}
}
