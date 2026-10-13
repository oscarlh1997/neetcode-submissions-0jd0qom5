class Solution {
    public int numDecodings(String s) {
        if (s.isEmpty()) {
            return 0;
        }

        int[] memo = new int[s.length()];
        Arrays.fill(memo, -1);

        return decode(s, 0, memo);
    }

    private int decode(String s, int index, int[] memo) {
        if (index == s.length()) {
            return 1;
        }

        if (memo[index] != -1) {
            return memo[index];
        }

        if (s.charAt(index) == '0') {
            memo[index] = 0;
            return 0;
        }

        int ways = decode(s, index + 1, memo);

        if (index + 1 < s.length()) {
            int twoDigits = (s.charAt(index) - '0') * 10
                    + (s.charAt(index + 1) - '0');

            if (twoDigits >= 10 && twoDigits <= 26) {
                ways += decode(s, index + 2, memo);
            }
        }

        memo[index] = ways;
        return ways;
    }
}