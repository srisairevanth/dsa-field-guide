import java.util.*;

class Solution {
    public long largestRectangle(int[] heights) {
        Deque<Integer> stack = new ArrayDeque<>();
        long best = 0;
        int n = heights.length;
        for (int i = 0; i <= n; i++) {
            int h = i < n ? heights[i] : 0;
            while (!stack.isEmpty() && heights[stack.peek()] >= h) {
                int top = stack.pop();
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                best = Math.max(best, (long) heights[top] * width);
            }
            stack.push(i);
        }
        return best;
    }
}
