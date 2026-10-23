int minDays(const vector<int>& bloomDay, int m, int k) {
    if ((long long)m * k > (long long)bloomDay.size()) return -1;
    int lo = *min_element(bloomDay.begin(), bloomDay.end());
    int hi = *max_element(bloomDay.begin(), bloomDay.end());
    while (lo < hi) {
        int mid = lo + (hi - lo) / 2;
        int bouquets = 0, run = 0;
        for (int d : bloomDay) {
            if (d <= mid) {
                run++;
                if (run == k) {
                    bouquets++;
                    run = 0;
                }
            } else {
                run = 0;
            }
        }
        if (bouquets >= m) hi = mid;
        else lo = mid + 1;
    }
    return lo;
}
