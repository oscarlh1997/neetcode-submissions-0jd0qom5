class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length == 1)   {
            return nums[0];
        }
        int currSum = nums[0];
        int bestSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currSum = Math.max(nums[i], currSum + nums[i]);
            bestSum = Math.max(bestSum, currSum);
        }

        return bestSum;
    }
}