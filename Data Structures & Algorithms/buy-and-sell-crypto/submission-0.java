class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length < 1) {
            return 0;
        }
        int totalProfit = 0;
        int l = 0, r = 1;

        while (r < prices.length) {
            if(prices[l]>prices[r]) {
                l = r;
                r ++;

            }
            else    {
               totalProfit = Math.max(totalProfit,prices[r]-prices[l]);
               r++;
                
            }

        }

return totalProfit;
        
    }
}
