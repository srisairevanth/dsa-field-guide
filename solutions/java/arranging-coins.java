class Solution {
    public int arrangeCoins(int n) {
        long lo = 0, hi = n;
        while (lo < hi) {
            long mid = (lo + hi + 1) / 2;
            if (mid * (mid + 1) / 2 <= n) lo = mid;
            else hi = mid - 1;
        }
        return (int) lo;
    }
}
