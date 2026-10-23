vector<vector<int>> permutations(vector<int> nums) {
    if (nums.size() <= 1) return {nums};
    vector<vector<int>> out;
    for (size_t i = 0; i < nums.size(); i++) {
        vector<int> rest = nums;
        rest.erase(rest.begin() + i);
        for (auto& p : permutations(rest)) {
            p.insert(p.begin(), nums[i]);
            out.push_back(p);
        }
    }
    return out;
}
