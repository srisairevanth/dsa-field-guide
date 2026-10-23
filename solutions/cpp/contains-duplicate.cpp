bool hasDuplicate(const vector<int>& nums) {
    unordered_set<int> seen(nums.begin(), nums.end());
    return seen.size() != nums.size();
}
