int maxMinDistance(const vector<int>& positionsIn, int m) {
    vector<int> positions = positionsIn;
    sort(positions.begin(), positions.end());
    int lo = 1, hi = positions.back() - positions.front();
    while (lo < hi) {
        int mid = lo + (hi - lo + 1) / 2;
        int count = 1, last = positions[0];
        for (size_t i = 1; i < positions.size(); i++) {
            if (positions[i] - last >= mid) {
                count++;
                last = positions[i];
            }
        }
        if (count >= m) lo = mid;
        else hi = mid - 1;
    }
    return lo;
}
