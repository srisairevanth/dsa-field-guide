vector<long long> sortedSquares(const vector<int>& nums) {
    vector<long long> out;
    for (int x : nums) out.push_back((long long)x * x);
    sort(out.begin(), out.end());
    return out;
}
