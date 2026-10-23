vector<int> rotateRight(const vector<int>& nums, int k) {
    if (nums.empty()) return {};
    int n = (int)nums.size();
    k = ((k % n) + n) % n;
    vector<int> out(nums.end() - k, nums.end());
    out.insert(out.end(), nums.begin(), nums.end() - k);
    return out;
}
