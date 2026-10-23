int trap(const vector<int>& h) {
    int lo = 0, hi = (int)h.size() - 1;
    int left = 0, right = 0;
    long long total = 0;
    while (lo < hi) {
        if (h[lo] < h[hi]) {
            left = max(left, h[lo]);
            total += left - h[lo];
            lo++;
        } else {
            right = max(right, h[hi]);
            total += right - h[hi];
            hi--;
        }
    }
    return (int)total;
}
