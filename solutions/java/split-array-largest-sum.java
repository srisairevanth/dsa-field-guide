class Solution {
    public int splitArray(int[] nums, int m) {
        long lo = 0, hi = 0;
        for (int x : nums) {
            lo = Math.max(lo, x);
            hi += x;
        }
        while (lo < hi) {
            long mid = (lo + hi) / 2;
            long parts = 1, total = 0;
            for (int x : nums) {
                if (total + x > mid) {
                    parts++;
                    total = 0;
                }
                total += x;
            }
            if (parts <= m) hi = mid;
            else lo = mid + 1;
        }
        return (int) lo;
    }
}
