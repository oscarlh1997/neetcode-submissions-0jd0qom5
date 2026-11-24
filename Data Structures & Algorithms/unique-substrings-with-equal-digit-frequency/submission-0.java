class Solution {
    public int equalDigitFrequency(String s) {
        String[] suffixes = new String[s.length()];
        for (int i = 0; i < s.length(); i++) suffixes[i] = s.substring(i);
        Arrays.sort(suffixes);
        String previous = "";
        int answer = 0;
        for (String suffix : suffixes) {
            int shared = 0;
            while (shared < Math.min(previous.length(), suffix.length())
                && previous.charAt(shared) == suffix.charAt(shared))
                shared++;
            int[] counts = new int[10];
            int distinct = 0, largest = 0;
            for (int i = 0; i < suffix.length(); i++) {
                int digit = suffix.charAt(i) - '0';
                if (counts[digit] == 0)
                    distinct++;
                counts[digit]++;
                largest = Math.max(largest, counts[digit]);
                if (i + 1 > shared && distinct * largest == i + 1)
                    answer++;
            }
            previous = suffix;
        }
        return answer;
    }
}