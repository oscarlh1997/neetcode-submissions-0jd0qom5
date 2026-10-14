class Solution {
    public int uniquePaths(int m, int n) {
        int [][] memo = new int [m][n];

        return memoization(0,0,m-1,n-1, memo);
        
    }

    public int memoization(int r,int c, int row, int col, int [][]memo) {
        if(r > row || c > col)    {
            return 0;
        }

        if (r == row && c == col)  {
            return 1;
        }

        if (memo[r][c] > 0) {
            return memo[r][c];
        }

        memo[r][c] = (memoization(r+1,c,row,col,memo)+memoization(r,c+1,row,col,memo));

        return memo[r][c];
    }
}