import java.util.Hashtable;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        
        Hashtable<Integer,Integer> elements = new Hashtable<Integer,Integer>();

        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            elements.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int required = target - nums[i];
            if(elements.containsKey(required) && (i!= elements.get(required))) {
                result[0] = elements.get(required);
                result[1] = i;
                return result;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{3,3};
        int[] result = twoSum(nums,6);
        for (int i: result) System.out.println(i);
    }
}