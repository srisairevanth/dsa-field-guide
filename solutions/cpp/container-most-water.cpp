long long maxArea(const vector<int>& h) {
    int lo = 0, hi = (int)h.size() - 1;
    long long best = 0;
    while (lo < hi) {
        best = max(best, (long long)min(h[lo], h[hi]) * (hi - lo));
        if (h[lo] < h[hi]) lo++;
        else hi--;
    }
    return best;
}
