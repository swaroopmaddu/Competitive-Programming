public class ThirdMaximumNumber {
    public static int thirdMax(int[] nums) {
        int length = nums.length;
        int max = nums[0];
        double secondMax = Double.NEGATIVE_INFINITY;
        double thirdMax = Double.NEGATIVE_INFINITY;
        
        for(int i = 1; i<length; i++){
            
            int num = nums[i];
            
            if(num > max){
                
                thirdMax = secondMax;
                secondMax = max;
                max = num;
                
            } else if(num > secondMax && num < max) {
                
                thirdMax = secondMax;
                secondMax = num;
                
            } else if(num > thirdMax && num < secondMax) {
                
                thirdMax = num;
                
            }
            
        }
        return thirdMax == Double.NEGATIVE_INFINITY ? max : (int)thirdMax;
    }

    public static void main(String[] args) {
        int[] array = new int[]{3,2,1};
        System.out.println(thirdMax(array));
        array = new int[]{1,2};
        System.out.println(thirdMax(array));
        array = new int[]{2,3,2,1};
        System.out.println(thirdMax(array));
    }
}
