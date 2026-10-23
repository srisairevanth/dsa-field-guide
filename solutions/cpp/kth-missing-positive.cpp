int findKthPositive(const vector<int>& arr, int k) {
    unordered_set<int> present(arr.begin(), arr.end());
    int missing = 0, value = 0;
    while (true) {
        value++;
        if (!present.count(value)) {
            missing++;
            if (missing == k) return value;
        }
    }
}
