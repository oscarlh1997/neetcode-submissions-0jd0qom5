class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] nums, int start, List<Integer> current, List<List<Integer>> result) {
        result.add(new ArrayList<>(current)); // Agregar copia del subconjunto actual

        for (int i = start; i < nums.length; i++) {
            current.add(nums[i]);                    // Incluir nums[i]
            backtrack(nums, i + 1, current, result); // Explorar con nums[i]
            current.remove(current.size() - 1);      // Quitar nums[i] (backtrack)
        }
    }
}