class Solution {
    public int[] sortedSquares(int[] nums) {
        int smallestNegative = 0;
        int arrayLen =nums.length;
        int[] result = new int[arrayLen];
        while(smallestNegative<arrayLen && nums[smallestNegative]<0) smallestNegative++;
        int smallestPostitive = smallestNegative--;
        int i =0;
        while(smallestNegative>=0 && smallestPostitive<arrayLen){
            if((nums[smallestNegative]*-1)>nums[smallestPostitive]){
                result[i] = nums[smallestPostitive]*nums[smallestPostitive];
                smallestPostitive++;
            } else {
                result[i] = nums[smallestNegative]*nums[smallestNegative];
                smallestNegative--;
            }
            i++;
        }

        while(smallestNegative>=0 ){
            result[i] = nums[smallestNegative]*nums[smallestNegative];
            smallestNegative--;
            i++;
        }

        while(smallestPostitive<arrayLen){
            result[i] = nums[smallestPostitive]*nums[smallestPostitive];
            smallestPostitive++;
            i++;
        }   
        return result;
    }
}