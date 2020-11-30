package Arrays101;

/**
 *
 * @author Sai
 */
public class findMaxConsecutiveOnes {
    
    public static int findMaxConsecutiveOnes(int[] nums){
        int maxVal=0,currentVal=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==1)
                    currentVal++;
            else{
                if(currentVal>maxVal){
                        maxVal = currentVal;
                }
                currentVal = 0;
            }
        }
        return Math.max(maxVal, currentVal);
    }
    
    public static void main(String[] args) {
        int[] array = new int[]{0};
        System.out.println(findMaxConsecutiveOnes(array));
    }
}
