int searchInsert(const vector<int>& nums, int target) {
    return (int)(lower_bound(nums.begin(), nums.end(), target) - nums.begin());
}
