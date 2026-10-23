class Solution {
    public int maxArea(int[] h) {
        int lo = 0, hi = h.length - 1, best = 0;
        while (lo < hi) {
            best = Math.max(best, Math.min(h[lo], h[hi]) * (hi - lo));
            if (h[lo] < h[hi]) lo++;
            else hi--;
        }
        return best;
    }
}
