class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subset = new ArrayList();
        List<Integer> curSet = new ArrayList();
        helperF(0,nums,subset,curSet);
        return subset;
        
    }

    public void helperF(int i ,int [] nums, List<List<Integer>> subset, List<Integer>curSet) {
        if (i >=nums.length)   {
            subset.add(new ArrayList<>(curSet));
            return;
        }

        curSet.add(nums[i]);
        helperF(i+1, nums, subset, curSet);
        curSet.remove(curSet.size() -1);

        helperF(i+1, nums, subset, curSet);


    }
}
