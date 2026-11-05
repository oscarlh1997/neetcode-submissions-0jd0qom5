class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList();
        List<Integer> subset = new ArrayList();
        helper(result, subset, nums,0);
        return result;
    }

    public void helper (List<List<Integer>> result, List<Integer> subset, int [] nums, int pointer) {
        if(pointer == nums.length)    {
           result.add(new ArrayList<>(subset));
            return;
        }

        subset.add(nums[pointer]);
        helper(result, subset, nums, pointer + 1);
        subset.remove(subset.size() - 1);
        helper(result, subset, nums, pointer + 1);

        return;

    }
}
