long long countInversions(const vector<int>& nums) {
    function<pair<vector<int>, long long>(vector<int>)> sortCount = [&](vector<int> a) -> pair<vector<int>, long long> {
        if (a.size() <= 1) return {a, 0};
        size_t mid = a.size() / 2;
        vector<int> leftPart(a.begin(), a.begin() + mid), rightPart(a.begin() + mid, a.end());
        auto [left, cl] = sortCount(leftPart);
        auto [right, cr] = sortCount(rightPart);
        vector<int> merged;
        long long count = cl + cr;
        size_t i = 0, j = 0;
        while (i < left.size() && j < right.size()) {
            if (left[i] <= right[j]) {
                merged.push_back(left[i++]);
            } else {
                merged.push_back(right[j++]);
                count += (long long)(left.size() - i);
            }
        }
        while (i < left.size()) merged.push_back(left[i++]);
        while (j < right.size()) merged.push_back(right[j++]);
        return {merged, count};
    };
    return sortCount(nums).second;
}
