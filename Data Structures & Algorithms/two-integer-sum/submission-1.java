class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> visitedNumbers = new HashMap();
        int i = 0;
        int l = 0;
        int r = 0;

        while(i < nums.length)    {
            if(visitedNumbers.containsKey(target-nums[i]))   {
                l = visitedNumbers.get(target-nums[i]);
                r = i;
                return new int []{l,r};
            }

            else {
                visitedNumbers.put(nums[i],i);
                i++;
            }
        }

        return new int []{l,r};

    }

   


        
    
}
