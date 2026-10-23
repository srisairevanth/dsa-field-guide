vector<vector<int>> subsets(const vector<int>& nums) {
    vector<vector<int>> result = {{}};
    for (int x : nums) {
        size_t n = result.size();
        for (size_t i = 0; i < n; i++) {
            vector<int> s = result[i];
            s.push_back(x);
            result.push_back(s);
        }
    }
    return result;
}
