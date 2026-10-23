int numSubarrayProductLessThanK(const vector<int>& nums, int k) {
    if (k <= 1) return 0;
    long long prod = 1;
    int count = 0, lo = 0;
    for (int hi = 0; hi < (int)nums.size(); hi++) {
        prod *= nums[hi];
        while (prod >= k) {
            prod /= nums[lo];
            lo++;
        }
        count += hi - lo + 1;
    }
    return count;
}
