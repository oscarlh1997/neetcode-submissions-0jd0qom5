class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> subSet = new ArrayList();
        List<Integer> currSet = new ArrayList();
        backtrackingF(0,nums,subSet,currSet);
        return subSet;
        
    }

    public void backtrackingF(int i, int[] nums, List<List<Integer>> subSet, List<Integer> currSet) {
        if(i>= nums.length) {
            subSet.add(new ArrayList<>(currSet));
            return;
        }

        currSet.add(nums[i]);
        backtrackingF(i+1, nums, subSet, currSet);

        currSet.remove(currSet.size() - 1);

        while(i + 1 < nums.length && nums[i] == nums[i+1]){ 
            i++;
        }
        backtrackingF(i + 1, nums, subSet, currSet);


    }
}
