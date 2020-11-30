import java.util.List;
import java.util.ArrayList;
public class FindAllNumbersDisappearedinanArray {
    
    public static List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i])-1;

            if(nums[index]>0){
                nums[index] = -nums[index];
            }
        }
        for (int i = 0; i <nums.length; i++) {
            if(nums[i] > 0){
                result.add(i+1);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{4,3,2,7,8,2,3,1};

        List<Integer> arr = findDisappearedNumbers(nums);

        for(int num : arr) {
            System.out.println(num);
        }
    }
}
