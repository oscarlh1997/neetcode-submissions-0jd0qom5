class Solution {
    public int trap(int[] height) {
        int l = 0, r = height.length - 1;
        int maxL = height[l];
        int maxR = height[r];
        int response = 0;

        while (l < r)   {
            if(maxL < maxR)   {
                l++;
                maxL = Math.max(maxL, height[l]);
                response = response +  maxL - height[l];
            }
            else {
                r--;
                maxR = Math.max(maxR, height[r]);
                response = response + maxR - height[r];
            }

        }

        return response;
    }
}
