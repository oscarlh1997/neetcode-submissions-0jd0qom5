class Solution {
    public long numberOfSubstrings(String s) {
        long[] counts = new long[26];
        long total = 0;
        for (char c : s.toCharArray()) {
            total += ++counts[c - 'a'];
        }
        return total;



    }
}
