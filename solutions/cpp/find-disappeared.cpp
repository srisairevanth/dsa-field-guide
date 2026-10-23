vector<int> findDisappearedNumbers(const vector<int>& nums) {
    unordered_set<int> present(nums.begin(), nums.end());
    vector<int> out;
    for (int v = 1; v <= (int)nums.size(); v++)
        if (!present.count(v)) out.push_back(v);
    return out;
}
