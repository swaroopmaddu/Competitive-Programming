
/**
 *
 * @author Sai
 */
public class ReverseInteger {
    public static int reverse(int x) {
        boolean isnegative = x < 0 ? true : false;
        x =  Math.abs(x);
        long reverse = 0;
        while(x>0){
            int rem = x%10;
            reverse = (reverse*10) + rem;
            x = x/10;
        }
        if(reverse > Integer.MAX_VALUE) return 0;
        return isnegative ? -1*((int)reverse) : (int)reverse;
    }
    public static void main(String[] args) {
        System.out.println(reverse(-123));
        System.out.println(reverse(0));
        System.out.println(reverse(9));
        System.out.println(reverse(120));
        
        
    }
}
