class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int [][] memo = new int [text1.length()][text2.length()];
        for (int[] rowArr : memo) {
            Arrays.fill(rowArr, -1);
        }
        int row = text1.length()-1;
        int col = text2.length()-1;

        return memoization(0,0,row,col, text1, text2,memo);
        
    }

    public int memoization(int r, int c, int row, int col, String text1, String text2, int [][]memo)  {             
        if (r > row || c > col) {
                return 0;
    }
        if(memo[r][c] != -1)  {
            return memo[r][c];
        }

        if(text1.charAt(r) == text2.charAt(c))  {
            memo[r][c] = 1 + memoization(r+1, c+1, row, col, text1, text2, memo);
        } else {
            memo[r][c] = Math.max(memoization(r+1,c,row,col, text1, text2,memo), memoization(r,c+1,row,col, text1, text2,memo));
        }

        return memo[r][c];
     }
}