vector<int> removeElement(const vector<int>& nums, int val) {
    vector<int> out;
    for (int x : nums)
        if (x != val) out.push_back(x);
    return out;
}
