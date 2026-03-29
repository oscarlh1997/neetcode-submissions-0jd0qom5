class Solution {
    public boolean hasDuplicate(int[] nums) {
        List<Integer> number = new ArrayList();
        for (int num: nums) {
            if(number.contains(num)){
                return true;
            }
            else    {
                number.add(num);
            }

        }
        return false;
    }
}