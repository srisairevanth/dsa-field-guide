int pivotIndex(const vector<int>& nums) {
    long long total = 0;
    for (int x : nums) total += x;
    long long left = 0;
    for (int i = 0; i < (int)nums.size(); i++) {
        if (left == total - left - nums[i]) return i;
        left += nums[i];
    }
    return -1;
}
