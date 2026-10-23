import java.util.*;

class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
        for (int r = 0; r < matrix.length; r++) heap.add(new int[] { matrix[r][0], r, 0 });
        int value = 0;
        for (int i = 0; i < k; i++) {
            int[] top = heap.poll();
            value = top[0];
            int r = top[1], c = top[2];
            if (c + 1 < matrix[r].length) heap.add(new int[] { matrix[r][c + 1], r, c + 1 });
        }
        return value;
    }
}
