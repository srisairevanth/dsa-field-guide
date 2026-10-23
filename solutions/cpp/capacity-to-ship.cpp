int shipWithinDays(const vector<int>& weights, int days) {
    long long lo = *max_element(weights.begin(), weights.end()), hi = 0;
    for (int w : weights) hi += w;
    while (lo < hi) {
        long long mid = (lo + hi) / 2;
        long long needed = 1, load = 0;
        for (int w : weights) {
            if (load + w > mid) {
                needed++;
                load = 0;
            }
            load += w;
        }
        if (needed <= days) hi = mid;
        else lo = mid + 1;
    }
    return (int)lo;
}
