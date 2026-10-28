class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        Deque<Integer> stack = new ArrayDeque<>();

        for (int index = 0; index < heights.length; index++) {
            while (!stack.isEmpty() && heights[stack.peek()] > heights[index]) {
                int height = heights[stack.pop()];
                int leftIndex = stack.isEmpty() ? -1 : stack.peek();
                int width = index - leftIndex - 1;

                maxArea = Math.max(maxArea, height * width);
            }

            stack.push(index);
        }

        while (!stack.isEmpty()) {
            int height = heights[stack.pop()];
            int leftIndex = stack.isEmpty() ? -1 : stack.peek();
            int width = heights.length - leftIndex - 1;

            maxArea = Math.max(maxArea, height * width);
        }

        return maxArea;
    }
}