import java.util.Scanner;

public class Problem1367A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        while (t--!=0){
            String line = in.nextLine();
            String result = line.substring(0,2);
            for (int i=3;i<line.length();i+=2){
                result += line.charAt(i);
            }
            System.out.println(result);
        }

        in.close();
    }
}
