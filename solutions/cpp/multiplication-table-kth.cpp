int findKthNumber(int m, int n, int k) {
    long long lo = 1, hi = (long long)m * n;
    while (lo < hi) {
        long long mid = (lo + hi) / 2;
        long long count = 0;
        for (long long i = 1; i <= m; i++) count += min((long long)n, mid / i);
        if (count >= k) hi = mid;
        else lo = mid + 1;
    }
    return (int)lo;
}
