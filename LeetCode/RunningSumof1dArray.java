/*
  url: https://leetcode.com/problems/running-sum-of-1d-array/
*/

class RunningSumof1dArray {
    public int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            runningSum[i] = sum;
        }
        return runningSum;
    }
}