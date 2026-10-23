class Solution {
    public int findKthNumber(int m, int n, int k) {
        long lo = 1, hi = (long) m * n;
        while (lo < hi) {
            long mid = (lo + hi) / 2;
            long count = 0;
            for (int i = 1; i <= m; i++) count += Math.min(n, mid / i);
            if (count >= k) hi = mid;
            else lo = mid + 1;
        }
        return (int) lo;
    }
}
