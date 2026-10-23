long long maxProduct(const vector<int>& nums) {
    long long best = nums[0], hi = nums[0], lo = nums[0];
    for (size_t i = 1; i < nums.size(); i++) {
        long long x = nums[i];
        long long a = x, b = hi * x, c = lo * x;
        hi = max({a, b, c});
        lo = min({a, b, c});
        best = max(best, hi);
    }
    return best;
}
