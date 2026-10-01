class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencies = new HashMap<>();
        int maxFrequency = 0;

        for (int num : nums) {
            int frequency = frequencies.merge(num, 1, Integer::sum);
            maxFrequency = Math.max(maxFrequency, frequency);
        }

        Map<Integer, List<Integer>> buckets = new HashMap<>();
        for (Map.Entry<Integer, Integer> entry : frequencies.entrySet()) {
            buckets.computeIfAbsent(entry.getValue(), ignored -> new ArrayList<>())
                   .add(entry.getKey());
        }

        int[] response = new int[k];
        int index = 0;

        for (int frequency = maxFrequency; frequency >= 1; frequency--) {
            List<Integer> numbers = buckets.get(frequency);
            if (numbers == null) {
                continue;
            }

            for (int num : numbers) {
                response[index++] = num;
                if (index == k) {
                    return response;
                }
            }
        }

        return response;
    }
}
