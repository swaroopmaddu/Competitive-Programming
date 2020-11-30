/**
 *
 * @author Sai
 */
public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        if(x<0) return false;
        int n = x;
        int reverse = 0;
        while(x>0){
            int rem = x%10;
            reverse = (reverse*10) + rem;
            x = x/10;
        }
        if(n == reverse) 
            return true;
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-102));
        System.out.println(isPalindrome(10));
        System.out.println(isPalindrome(151));
        System.out.println(isPalindrome(121));
        
    }
}
