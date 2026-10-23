double findMaxAverage(const vector<int>& nums, int k) {
    int n = (int)nums.size();
    long long total = 0;
    for (int i = 0; i < min(k, n); i++) total += nums[i];
    long long best = total;
    for (int i = k; i < n; i++) {
        total += nums[i] - nums[i - k];
        best = max(best, total);
    }
    return (double)best / k;
}
