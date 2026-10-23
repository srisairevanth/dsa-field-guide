vector<int> searchRange(const vector<int>& nums, int target) {
    auto lowerIndex = [&](int t) {
        int lo = 0, hi = (int)nums.size();
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] < t) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    };
    int first = lowerIndex(target);
    if (first == (int)nums.size() || nums[first] != target) return {-1, -1};
    return {first, lowerIndex(target + 1) - 1};
}
