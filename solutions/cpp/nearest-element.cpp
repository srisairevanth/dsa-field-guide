int nearestValue(const vector<int>& nums, int target) {
    size_t i = lower_bound(nums.begin(), nums.end(), target) - nums.begin();
    size_t from = i > 0 ? i - 1 : 0;
    size_t to = min(i + 1, nums.size());
    int best = nums[from];
    for (size_t k = from + 1; k < to; k++) {
        long long dv = llabs((long long)nums[k] - target), db = llabs((long long)best - target);
        if (dv < db || (dv == db && nums[k] < best)) best = nums[k];
    }
    return best;
}
