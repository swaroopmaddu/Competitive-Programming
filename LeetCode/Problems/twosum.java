import java.util.Hashtable;

class twosum{
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
        int[] array = new int[]{-1,-2,-3,-4,-5};    
        int[] result = twoSum(array,-8);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }
}