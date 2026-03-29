class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> arrayOfMiddleVals = new ArrayList<>();
        
        // Simulación de tu función getMiddleValuesArray
        for (int val : getMiddleValuesArray(nums1)) arrayOfMiddleVals.add(val);
        for (int val : getMiddleValuesArray(nums2)) arrayOfMiddleVals.add(val);
        
        Collections.sort(arrayOfMiddleVals);
        
        // Simulación de tu función getMedian
        return getMedian(arrayOfMiddleVals);
    }

    private int[] getMiddleValuesArray(int[] nums) {
        if (nums.length == 0) return new int[0];
        if (nums.length == 1) return new int[]{nums[0]};
        if (nums.length % 2 == 0) {
            return new int[]{nums[(nums.length / 2) - 1], nums[nums.length / 2]};
        } else {
            return new int[]{nums[nums.length / 2]};
        }
    }

    private double getMedian(List<Integer> nums) {
        int n = nums.size();
        if (n % 2 == 0) {
            return (double) (nums.get(n / 2 - 1) + nums.get(n / 2)) / 2.0;
        } else {
            return (double) nums.get(n / 2);
        }
    }
}