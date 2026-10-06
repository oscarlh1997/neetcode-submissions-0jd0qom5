class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int r = 1; 
        int maxPro = 0;
        if(prices.length <=1)   {
            return 0;
        }

        while (r < prices.length)   {
            if(prices[l]>=prices[r])    {
                l=r;
                r++;
            }
            else    {
                maxPro = Math.max(maxPro, prices[r]- prices[l]);
                r++;
            }
        }

        return maxPro;


        
    }
}
