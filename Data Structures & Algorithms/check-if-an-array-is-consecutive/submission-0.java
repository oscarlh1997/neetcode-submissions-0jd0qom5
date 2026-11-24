class Solution {
    public boolean isConsecutive(int[] nums) {
        int min = Integer.MAX_VALUE;
        Set<Integer> numbers = new HashSet<>();
        int size  = nums.length;

        for (int num: nums) {
            if (num < min)  {
                min = num;
            }
            numbers.add(num);
        }

        if (numbers.size() != size) {
            return false;
        }

        while (size > 0)    {
            if (!numbers.contains(min))  {
                return false;
            }

            else    {
                min++;
                size--;
            }
        }

        return true;
    }
}