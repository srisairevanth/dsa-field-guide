vector<int> moveZeroes(const vector<int>& nums) {
    vector<int> keep;
    for (int x : nums)
        if (x != 0) keep.push_back(x);
    keep.resize(nums.size(), 0);
    return keep;
}
