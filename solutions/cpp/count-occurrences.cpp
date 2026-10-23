int countOccurrences(const vector<int>& nums, int t) {
    int n = (int)nums.size();
    int lo = 0, hi = n;
    while (lo < hi) {
        int mid = lo + (hi - lo) / 2;
        if (nums[mid] < t) lo = mid + 1;
        else hi = mid;
    }
    int first = lo;
    lo = first;
    hi = n;
    while (lo < hi) {
        int mid = lo + (hi - lo) / 2;
        if (nums[mid] <= t) lo = mid + 1;
        else hi = mid;
    }
    return lo - first;
}
