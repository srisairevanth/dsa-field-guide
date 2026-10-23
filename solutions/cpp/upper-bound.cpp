int upperBound(const vector<int>& nums, int t) {
    int lo = 0, hi = (int)nums.size();
    while (lo < hi) {
        int mid = lo + (hi - lo) / 2;
        if (nums[mid] <= t) lo = mid + 1;
        else hi = mid;
    }
    return lo;
}
