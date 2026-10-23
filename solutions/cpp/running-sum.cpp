vector<long long> runningSum(const vector<int>& nums) {
    vector<long long> out;
    long long total = 0;
    for (int x : nums) {
        total += x;
        out.push_back(total);
    }
    return out;
}
