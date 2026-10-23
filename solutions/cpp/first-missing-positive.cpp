int firstMissingPositive(const vector<int>& nums) {
    vector<int> arr = nums;
    int n = (int)arr.size();
    for (int i = 0; i < n; i++) {
        while (arr[i] >= 1 && arr[i] <= n && arr[arr[i] - 1] != arr[i]) {
            int j = arr[i] - 1;
            swap(arr[i], arr[j]);
        }
    }
    for (int i = 0; i < n; i++)
        if (arr[i] != i + 1) return i + 1;
    return n + 1;
}
