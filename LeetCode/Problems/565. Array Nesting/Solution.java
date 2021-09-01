class Solution {
    public int arrayNesting(int[] nums) {
        int len = nums.length;
        int maxLen = 0;
        for(int i=0;i<len;i++){
            if(nums[i]==-1) continue;
            int j = i;
            int curLen = 0; 
            while(nums[j]!=-1){
                curLen++;
                int temp = j;
                j = nums[j];
                nums[temp] = -1;
            }
            maxLen = Math.max(maxLen,curLen);
        }
        return maxLen;
    }
}