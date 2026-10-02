class Solution {
    public int maxArea(int[] heights) {
      int maxArea = 0;
      int l = 0;
      int r = heights.length-1;

      while (l < r) {
        maxArea = Math.max(maxArea,calculateArea(heights, l, r) );
        
        if(heights[l]<heights[r]) {
        l++;
      }

        else  {
        r--;
      }
    }
      return maxArea;
        
    }

    public int calculateArea(int[] heights, int l, int r) {
      return (r-l)*(Math.min(heights[l],heights[r]));
    }
}
