vector<int> sortByParity(const vector<int>& nums) {
    vector<int> out;
    for (int x : nums)
        if (x % 2 == 0) out.push_back(x);
    for (int x : nums)
        if (x % 2 != 0) out.push_back(x);
    return out;
}
