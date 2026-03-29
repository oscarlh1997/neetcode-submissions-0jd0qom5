class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> responseL = new ArrayList();
        int counter = 0;
        PriorityQueue <Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        int l = 0, r = 0;
        if (k == 1)   {
            return nums;
        }

        while (r < nums.length)   {
            maxHeap.add(nums[r]);
            if (r - l == k - 1) {
                responseL.add(maxHeap.peek());
                maxHeap.remove(nums[l]);
                l++;
            }
            r++;
        }
        int [] response = new int[responseL.size()];
        for (int i= 0; i < response.length; i++)  {
            response[i] = responseL.get(i);
        }

        return response;
    }
}