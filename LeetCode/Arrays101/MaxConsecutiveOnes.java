public class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxVal = 0,currentval=0;

        for (int num:nums){
            if(num == 1)
                currentval++;
            else{
                maxVal = Math.max(maxVal, currentval);
                currentval = 0;
            }
        }
        return Math.max(maxVal, currentval);
    }

    public static void main(String[] args) {
        int[] num = new int[]{1,2,1,1,1,1,1,3,2,4}; 
        System.out.println(findMaxConsecutiveOnes(num));
    }
}
