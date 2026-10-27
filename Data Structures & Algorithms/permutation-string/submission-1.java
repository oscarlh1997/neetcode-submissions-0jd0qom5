class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();

        if (m > n) {
            return false;
        }

        int[] target = new int[26];
        int[] window = new int[26];

        for (int i = 0; i < m; i++) {
            target[s1.charAt(i) - 'a']++;
            window[s2.charAt(i) - 'a']++;
        }

        if (java.util.Arrays.equals(target, window)) {
            return true;
        }

        for (int r = m; r < n; r++) {
            int l = r - m;

            window[s2.charAt(l) - 'a']--;
            window[s2.charAt(r) - 'a']++;

            if (java.util.Arrays.equals(target, window)) {
                return true;
            }
        }

        return false;
    }
}