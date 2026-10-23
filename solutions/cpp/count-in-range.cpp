int countInRange(const vector<int>& nums, int low, int high) {
    vector<int> ordered = nums;
    sort(ordered.begin(), ordered.end());
    int right = (int)(upper_bound(ordered.begin(), ordered.end(), high) - ordered.begin());
    int left = (int)(lower_bound(ordered.begin(), ordered.end(), low) - ordered.begin());
    return right - left;
}
