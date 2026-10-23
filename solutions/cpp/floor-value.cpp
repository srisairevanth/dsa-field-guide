int floorValue(const vector<int>& nums, int limit) {
    size_t i = upper_bound(nums.begin(), nums.end(), limit) - nums.begin();
    return i > 0 ? nums[i - 1] : -1;
}
