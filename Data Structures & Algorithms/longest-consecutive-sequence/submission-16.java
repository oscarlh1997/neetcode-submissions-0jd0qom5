class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numeros = new HashSet<>();

        for (int num : nums) {
            numeros.add(num);
        }

        int maxSeen = 0;

        for (int num : numeros) {
            if (num != Integer.MIN_VALUE && numeros.contains(num - 1)) {
                continue;
            }

            int actual = 1;
            int siguiente = num;

            while (siguiente != Integer.MAX_VALUE && numeros.contains(siguiente + 1)) {
                siguiente++;
                actual++;
            }

            maxSeen = Math.max(maxSeen, actual);
        }

        return maxSeen;
    }
}