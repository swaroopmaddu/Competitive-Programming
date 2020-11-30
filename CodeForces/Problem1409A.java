import java.util.Scanner;

public class Problem1409A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        while(num--!=0){
            long n = in.nextInt();
            long m = in.nextInt();
            if(n==m) System.out.println(0);
            else printMinSteps(Math.abs(n-m));
        }
        in.close();
    }
    public static void printMinSteps(long value){
        long steps = 0;
        steps += value/10;
        value -= (steps*10);
        if(value!=0) steps++;
        System.out.println(steps);
    }
}
