double findMedianSortedArrays(const vector<int>& a, const vector<int>& b) {
    vector<int> merged = a;
    merged.insert(merged.end(), b.begin(), b.end());
    sort(merged.begin(), merged.end());
    size_t n = merged.size();
    if (n % 2 == 1) return merged[n / 2];
    return ((double)merged[n / 2 - 1] + merged[n / 2]) / 2.0;
}
