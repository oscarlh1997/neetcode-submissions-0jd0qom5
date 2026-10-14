class Solution {
    public boolean canJump(int[] nums) {
         // Max index we can reach
    var reach = 0;
    for (int i = 0; i < nums.length; i++)
    {
        if (i > reach)
        {
            // How are we here if we cannot reach this index? just break.
            break;
        }
        reach = Math.max(reach, nums[i] + i); 
    }

    return reach >= nums.length - 1;
        
    }
}
