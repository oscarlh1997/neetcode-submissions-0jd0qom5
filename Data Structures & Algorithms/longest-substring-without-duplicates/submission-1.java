class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap <Character,Integer> seenCh = new HashMap<>();
        int l = 0;
        int r = 0;
        int maxRange = 0;

        while (r < s.length()) {
            char rightChar = s.charAt(r);
            seenCh.put(rightChar, seenCh.getOrDefault(rightChar, 0) + 1);
            while (seenCh.get(rightChar) > 1) {
                char leftChar = s.charAt(l);
                seenCh.put(leftChar, seenCh.get(leftChar) - 1);
                l++;
            }
            maxRange = Math.max(r - l + 1, maxRange);
            r++;
        }
        return maxRange;
    }
}