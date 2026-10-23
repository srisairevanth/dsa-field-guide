int findRadius(const vector<int>& houses, const vector<int>& heaters) {
    vector<int> hs = heaters;
    sort(hs.begin(), hs.end());
    long long best = 0;
    for (int h : houses) {
        size_t i = lower_bound(hs.begin(), hs.end(), h) - hs.begin();
        long long dist = LLONG_MAX;
        if (i < hs.size()) dist = (long long)hs[i] - h;
        if (i > 0) dist = min(dist, (long long)h - hs[i - 1]);
        best = max(best, dist);
    }
    return (int)best;
}
