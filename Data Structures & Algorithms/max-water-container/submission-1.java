class Solution {
    public int maxArea(int[] heights) {
        int maxResult = 0;
        int l = 0 , r = heights.length - 1;

        while (l<r) {
            int currentSum = Math.min(heights[l],heights[r]) * (r - l);
            if (currentSum > maxResult )   {
                maxResult = currentSum;
              }

              if(heights[l] < heights[r])   {
                l++;
              }

              else if (heights[l] > heights[r]) {
                r--;
              }
              else {
                l++;
              }
        }

        return maxResult;
        
    }
}
