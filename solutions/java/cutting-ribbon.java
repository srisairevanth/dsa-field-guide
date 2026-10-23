class Solution {
    public int maxRibbonLength(int[] ribbons, int k) {
        int lo = 0, hi = 0;
        for (int r : ribbons) hi = Math.max(hi, r);
        while (lo < hi) {
            int mid = lo + (hi - lo + 1) / 2;
            long pieces = 0;
            for (int r : ribbons) pieces += r / mid;
            if (pieces >= k) lo = mid;
            else hi = mid - 1;
        }
        return lo;
    }
}
