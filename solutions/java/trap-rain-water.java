class Solution {
    public int trap(int[] h) {
        int lo = 0, hi = h.length - 1;
        int left = 0, right = 0, total = 0;
        while (lo < hi) {
            if (h[lo] < h[hi]) {
                left = Math.max(left, h[lo]);
                total += left - h[lo];
                lo++;
            } else {
                right = Math.max(right, h[hi]);
                total += right - h[hi];
                hi--;
            }
        }
        return total;
    }
}
