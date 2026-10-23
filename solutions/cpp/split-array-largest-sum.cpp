int splitArray(const vector<int>& nums, int m) {
    long long lo = *max_element(nums.begin(), nums.end()), hi = 0;
    for (int x : nums) hi += x;
    while (lo < hi) {
        long long mid = (lo + hi) / 2;
        long long parts = 1, total = 0;
        for (int x : nums) {
            if (total + x > mid) {
                parts++;
                total = 0;
            }
            total += x;
        }
        if (parts <= m) hi = mid;
        else lo = mid + 1;
    }
    return (int)lo;
}
