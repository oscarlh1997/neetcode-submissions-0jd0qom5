class Solution {
    int[] memo;
    public int rob(int[] nums) {
        memo = new int[nums.length];
        Arrays.fill(memo, -1);
        return dfs(0, nums);
    }

    public int dfs(int i, int[] nums) {
        if (i >= nums.length) {
            return 0;
        }
        if (memo[i] != -1) {
            return memo[i];
        }
        memo[i] = Math.max(nums[i] + dfs(i + 2, nums), dfs(i + 1, nums));
        return memo[i];
    }
}