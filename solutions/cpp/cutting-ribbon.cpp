int maxRibbonLength(const vector<int>& ribbons, int k) {
    long long lo = 0, hi = *max_element(ribbons.begin(), ribbons.end());
    while (lo < hi) {
        long long mid = (lo + hi + 1) / 2;
        long long total = 0;
        for (int r : ribbons) total += r / mid;
        if (total >= k) lo = mid;
        else hi = mid - 1;
    }
    return (int)lo;
}
