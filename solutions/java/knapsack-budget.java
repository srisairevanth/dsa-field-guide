class Solution {
    public int bestValue(int[][] items, int budget) {
        int[] best = new int[budget + 1];
        for (int[] item : items) {
            int w = item[0], v = item[1];
            for (int b = budget; b >= w; b--) best[b] = Math.max(best[b], best[b - w] + v);
        }
        return best[budget];
    }
}
