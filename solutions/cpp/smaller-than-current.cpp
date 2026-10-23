vector<int> smallerNumbersThanCurrent(const vector<int>& nums) {
    vector<int> out;
    for (int x : nums) {
        int count = 0;
        for (int y : nums)
            if (y < x) count++;
        out.push_back(count);
    }
    return out;
}
