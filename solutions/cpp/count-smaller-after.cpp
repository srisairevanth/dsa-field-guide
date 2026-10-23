vector<int> countSmaller(const vector<int>& nums) {
    vector<int> seen, out;
    for (size_t i = nums.size(); i-- > 0;) {
        auto it = lower_bound(seen.begin(), seen.end(), nums[i]);
        out.push_back((int)(it - seen.begin()));
        seen.insert(it, nums[i]);
    }
    reverse(out.begin(), out.end());
    return out;
}
