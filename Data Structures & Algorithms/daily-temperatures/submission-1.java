class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] output = new int[temperatures.length];
        Deque<int[]> temp = new ArrayDeque<>();

        for (int i = 0; i < temperatures.length; i++) {
            while (!temp.isEmpty() && temp.peek()[0] < temperatures[i]) {
                int[] top = temp.pop();
                output[top[1]] = i - top[1];
            }
            temp.push(new int[] {temperatures[i], i});
        }

        return output;
    }
}