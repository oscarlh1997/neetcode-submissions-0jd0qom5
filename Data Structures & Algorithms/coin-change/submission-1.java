class Solution {
    int [] memo;
    public int coinChange(int[] coins, int amount) {    
        int leastC = 0;
        if( amount == 0) return 0;
        
        memo = new int[amount + 1];
        Arrays.fill(memo,-2);
        memo[0] = 0;

        return dfs(coins,amount,memo);

        }

        public int dfs(int [] coins, int amount, int [] memo)    {
            if (memo[amount]!= -2)    {
                return memo[amount];
            }

            int min = Integer.MAX_VALUE;

            for (int coin: coins)   {
                if(coin > amount)   {
                    continue;
                }

                int result = dfs(coins, amount - coin, memo);

                if(result != -1)    {
                    min = Math.min(min, result+1 );
                }
            }
            
        memo[amount] =
                min== Integer.MAX_VALUE ? -1 : min;

        return memo[amount];

        }
}
