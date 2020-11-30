class NumberOfGoodPairs{
    public static int numIdenticalPairs(int[] nums) {
        int pairs = 0;
        for (int i = 0; i < nums.length; i++){
            int x = nums[i];
            for (int j = i+1;j<nums.length; j++){
                if(nums[j]==x) pairs++;
            }
        }
        return pairs;
    }
    public static void main(String[] args) {
        System.out.println(numIdenticalPairs(new int[]{1,2,3}));
    }
}