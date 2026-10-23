vector<vector<int>> mergeIntervals(vector<vector<int>> intervals) {
    sort(intervals.begin(), intervals.end(),
         [](const vector<int>& a, const vector<int>& b) { return a[0] < b[0]; });
    vector<vector<int>> out;
    for (const auto& iv : intervals) {
        if (!out.empty() && iv[0] <= out.back()[1]) {
            out.back()[1] = max(out.back()[1], iv[1]);
        } else {
            out.push_back({iv[0], iv[1]});
        }
    }
    return out;
}
