class Solution {
    public int[] getConcatenation(int[] nums) {
        int counter = 0;
        int arrayCounter = 0;
        int [] ans = new int [nums.length+nums.length];
        while (counter < 2){
        for (int num: nums)    {
            ans[arrayCounter] = num;
            arrayCounter++;
        }
        counter++;
    }
        return ans;
    }
}