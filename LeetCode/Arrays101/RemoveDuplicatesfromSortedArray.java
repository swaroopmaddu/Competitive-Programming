public class RemoveDuplicatesfromSortedArray{
    public static int removeDuplicates(int[] nums) {
        int len = 1;
        for (int i = 0; i < nums.length; i++){
            if(nums[i] == nums[len-1]){
                continue;
            } else {
                nums[len] = nums[i];
                len++;
            }
        }
        return len;
    }
    public static void main(String[] args) {
        int[] array = new int[]{0,0,1,1,1,2,2,3,3,4};
        // nums is passed in by reference. (i.e., without making a copy)
        int len = removeDuplicates(array);

        // any modification to nums in your function would be known by the caller.
        // using the length returned by your function, it prints the first len elements.
        for (int i = 0; i < len; i++) {
            System.out.print(array[i]);
            System.out.print(" ");
        }
    }
}