vector<int> twoSumIndices(const vector<int>& nums, int target) {
    int i = 0, j = (int)nums.size() - 1;
    while (i < j) {
        long long s = (long long)nums[i] + nums[j];
        if (s == target) return {i, j};
        if (s < target) i++;
        else j--;
    }
    return {};
}
