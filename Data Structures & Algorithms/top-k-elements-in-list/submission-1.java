class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map <Integer,Integer> frecuencies = new HashMap<>();
        int[] response = new int[k];

        for(int num: nums)  {
            frecuencies.merge(num, 1, Integer::sum);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>(
                (a, b) -> Integer.compare(b.getValue(), a.getValue()));

        maxHeap.addAll(frecuencies.entrySet());

        for (int i = 0; i < k; i++) {
            response[i] = maxHeap.poll().getKey();
        }

        return response;
        
    }
}
