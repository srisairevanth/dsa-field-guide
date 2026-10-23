class Solution {
    public int maxValueAt(int n, int index, int maxSum) {
        long lo = 1, hi = maxSum;
        while (lo < hi) {
            long mid = (lo + hi + 1) / 2;
            if (needed(n, index, mid) <= maxSum) lo = mid;
            else hi = mid - 1;
        }
        return (int) lo;
    }

    private long needed(int n, int index, long peak) {
        long left = index;
        long right = n - index - 1;
        return peak + side(left, peak) + side(right, peak);
    }

    private long side(long length, long peak) {
        if (length <= peak - 1) return (peak - 1 + peak - length) * length / 2;
        return (peak - 1) * peak / 2 + (length - (peak - 1));
    }
}
