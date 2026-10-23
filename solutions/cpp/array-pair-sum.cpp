int arrayPairSum(const vector<int>& nums) {
    vector<int> ordered = nums;
    sort(ordered.begin(), ordered.end());
    long long total = 0;
    for (size_t i = 0; i < ordered.size(); i += 2) total += ordered[i];
    return (int)total;
}
