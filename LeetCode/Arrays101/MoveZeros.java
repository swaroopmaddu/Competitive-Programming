public class MoveZeros{
    public static void moveZeroes(int[] nums) {

        if(nums.length <2) return;

        int indexZero = 0;
        for (int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                indexZero = i;
                for (int j = i+1; j < nums.length; j++) {
                    if(nums[j] != 0){
                        nums[indexZero++] = nums[j];
                        nums[j] = 0;
                    }  
                }
            }            
        }
    }
    public static void main(String[] args) {  

        int[] array = new int[]{0,1,0,3,12};    
        moveZeroes(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]+" ");
        }
    }
}