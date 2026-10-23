int firstBadVersion(int n, function<bool(int)> isBad) {
    int lo = 1, hi = n;
    while (lo < hi) {
        int mid = lo + (hi - lo) / 2;
        if (isBad(mid)) hi = mid;
        else lo = mid + 1;
    }
    return lo;
}
