class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if ((long) m * k > bloomDay.length) return -1;
        int lo = Integer.MAX_VALUE, hi = Integer.MIN_VALUE;
        for (int d : bloomDay) {
            lo = Math.min(lo, d);
            hi = Math.max(hi, d);
        }
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            int bouquets = 0, run = 0;
            for (int d : bloomDay) {
                if (d <= mid) {
                    run++;
                    if (run == k) {
                        bouquets++;
                        run = 0;
                    }
                } else {
                    run = 0;
                }
            }
            if (bouquets >= m) hi = mid;
            else lo = mid + 1;
        }
        return lo;
    }
}
