import java.util.Scanner;

public class Problem1343B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        while (num--!=0){
            long value = in.nextInt();
            if(value%4!=0){
                System.out.println("NO");
            }
            else {
                System.out.println("YES");
                long evenSum =0;
                long oddSum =0;
                long j =2;
                for(long i=1;i<=value/2;i++){
                    System.out.print(j+" ");
                    evenSum += j;
                    j += 2;
                }
                j = 1;
                for(long i=0;i<value/2-1;i++){
                    System.out.print(j+" ");
                    oddSum += j;
                    j += 2;
                }
                System.out.println(evenSum-oddSum);
            }
        }
        in.close();
    }
}