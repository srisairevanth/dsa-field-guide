int maxValueAt(int n, int index, int maxSum) {
    auto side = [](long long peak, long long length) -> long long {
        if (length <= peak - 1) return (peak - 1 + peak - length) * length / 2;
        return (peak - 1) * peak / 2 + (length - (peak - 1));
    };
    auto needed = [&](long long peak) -> long long {
        return peak + side(peak, index) + side(peak, (long long)n - index - 1);
    };
    long long lo = 1, hi = maxSum;
    while (lo < hi) {
        long long mid = (lo + hi + 1) / 2;
        if (needed(mid) <= maxSum) lo = mid;
        else hi = mid - 1;
    }
    return (int)lo;
}
