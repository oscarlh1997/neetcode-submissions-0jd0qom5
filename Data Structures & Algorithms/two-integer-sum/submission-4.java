class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indices = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complemento = target - nums[i];
            Integer indice = indices.get(complemento);

            if (indice != null) {
                return new int[] {indice, i};
            }

            indices.put(nums[i], i);
        }

        return new int[0];
    }
}