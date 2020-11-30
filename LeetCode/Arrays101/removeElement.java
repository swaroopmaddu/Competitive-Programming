package Arrays101;

/**
 *
 * @author Sai
 */
public class removeElement {
    public static int removeElement(int[] nums, int val) {
        int len = nums.length;

        for (int i = 0; i < len; i++) {
            if(nums[i] == val){
                nums[i] = nums[len-1];
                len--;
                i--;
            }            
        }
        return len;
    }
    public static void main(String[] args) {
        int[] array = new int[]{0,1,2,2,3,0,4,2};
        int len = removeElement(array,2);
        for (int i = 0; i < len; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
