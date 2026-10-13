class Solution {
    public int maxProduct(int[] nums) {
        int maxMul = nums[0];
        int minMul = nums[0];
        int bestMul = nums[0];

        for (int index = 1; index < nums.length; index++) {
            int current = nums[index];
            int tempMax = Math.max(current, Math.max(maxMul * current, minMul * current));
            minMul = Math.min(current, Math.min(maxMul * current, minMul * current));
            maxMul = tempMax;

            bestMul = Math.max(bestMul, maxMul);
        }

        return bestMul;
    }
}