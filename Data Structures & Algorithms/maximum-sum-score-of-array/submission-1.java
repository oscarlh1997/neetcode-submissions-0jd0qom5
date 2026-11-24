class Solution {
    public long maximumSumScore(int[] nums) {
        long max = Long.MIN_VALUE;
        long actualSum = 0;

        for (int i = 0; i < nums.length; i++ )    {
            actualSum = nums[i] + actualSum;
            if (actualSum > max)    {
                max = actualSum;
            }
        }

        actualSum = 0;

        for (int i = nums.length-1; i >= 0; i-- )    {
            actualSum = nums[i] + actualSum;
            if (actualSum > max)    {
                max = actualSum;
            }
        }
        return max;
    }
}