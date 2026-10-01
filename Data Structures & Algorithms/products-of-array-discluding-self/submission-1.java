class Solution {
    public int[] productExceptSelf(int[] nums) {
            int totalMult = 1;
            int[] result = new int [nums.length];
            boolean zeroSeen = false;
            boolean twoOrMoreSeen = false;

            for(int num: nums)  {
                if (num == 0)   {
                    if(zeroSeen == true)    {
                        return new int [nums.length];

                    }
                    zeroSeen = true;
                    continue;
                }
                totalMult*=num;
            }

            if(zeroSeen)    {
                for (int i = 0; i< nums.length; i++)    {
                    if (nums[i] != 0)    {
                    result[i] = 0;
                 }
                 else {
                    result[i] = totalMult;
                    
                }
             }
            }

            else{

            for (int i = 0; i< nums.length; i++)    {
                
                    result[i] = totalMult / nums[i];
             }
            }


           return result;   
    }
}  
