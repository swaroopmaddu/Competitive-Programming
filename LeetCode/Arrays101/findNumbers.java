package Arrays101;

/**
 *
 * @author Sai
 */
public class findNumbers {
    public static int findNumbers(int[] nums) {
        int result =0;

        for(int num : nums){
            double digits = Math.log10(num);
            if((Math.floor(digits)+1)%2==0)
                result++;
        }
        return result;
    }
    
    public static void main(String[] args) {
        int[] array = new int[]{12,345,23,6,7896};
        System.out.println(findNumbers(array));
    }
}
