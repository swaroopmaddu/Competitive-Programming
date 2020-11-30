import java.util.Arrays;
import java.util.Scanner;
public class Problem723A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] distances = new int[3];
        distances[0] = in.nextInt();
        distances[1] = in.nextInt();
        distances[2] = in.nextInt();
        Arrays.sort(distances);
        System.out.println((distances[1]-distances[0])+(distances[2]-distances[1]));
        in.close();
    }
}