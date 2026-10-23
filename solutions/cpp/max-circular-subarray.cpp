int maxCircularSubarray(const vector<int>& nums) {
    long long total = 0;
    for (int x : nums) total += x;
    long long bestMax = nums[0], curMax = nums[0];
    long long bestMin = nums[0], curMin = nums[0];
    for (size_t i = 1; i < nums.size(); i++) {
        long long x = nums[i];
        curMax = max(x, curMax + x);
        bestMax = max(bestMax, curMax);
        curMin = min(x, curMin + x);
        bestMin = min(bestMin, curMin);
    }
    if (bestMax < 0) return (int)bestMax;
    return (int)max(bestMax, total - bestMin);
}
