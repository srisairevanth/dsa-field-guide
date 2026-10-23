class Solution {
    public int shipWithinDays(int[] weights, int days) {
        long lo = 0, hi = 0;
        for (int w : weights) {
            lo = Math.max(lo, w);
            hi += w;
        }
        while (lo < hi) {
            long mid = (lo + hi) / 2;
            long needed = 1, load = 0;
            for (int w : weights) {
                if (load + w > mid) {
                    needed++;
                    load = 0;
                }
                load += w;
            }
            if (needed <= days) hi = mid;
            else lo = mid + 1;
        }
        return (int) lo;
    }
}
