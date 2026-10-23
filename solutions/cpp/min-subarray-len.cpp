int minSubArrayLen(int target, const vector<int>& nums) {
    long long best = LLONG_MAX, total = 0;
    int lo = 0;
    for (int hi = 0; hi < (int)nums.size(); hi++) {
        total += nums[hi];
        while (total >= target) {
            best = min(best, (long long)(hi - lo + 1));
            total -= nums[lo];
            lo++;
        }
    }
    return best == LLONG_MAX ? 0 : (int)best;
}
