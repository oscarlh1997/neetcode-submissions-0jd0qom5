class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        int p = 0;
        int count=1;
        int currCount = 1;
        int leadCount = 1;
        for (int num: nums)   {
            set.add(num);
        }

        while (p < nums.length) {
            if(set.contains(nums[p]-1)) {
                p++;
            }
            else    {
                
                while (set.contains(nums[p]+leadCount)) {
                    currCount ++;
                    leadCount ++;

                }

                if (currCount > count)  {
                    count = currCount;
                    
                }
                currCount = 1;
                leadCount = 1;
                p++;
            }
        }

        return count;

    }
}

