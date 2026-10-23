vector<vector<int>> threeSum(const vector<int>& nums) {
    vector<int> arr = nums;
    sort(arr.begin(), arr.end());
    int n = (int)arr.size();
    vector<vector<int>> out;
    for (int i = 0; i + 2 < n; i++) {
        if (i > 0 && arr[i] == arr[i - 1]) continue;
        int lo = i + 1, hi = n - 1;
        while (lo < hi) {
            int s = arr[i] + arr[lo] + arr[hi];
            if (s == 0) {
                out.push_back({arr[i], arr[lo], arr[hi]});
                lo++;
                hi--;
                while (lo < hi && arr[lo] == arr[lo - 1]) lo++;
            } else if (s < 0) {
                lo++;
            } else {
                hi--;
            }
        }
    }
    return out;
}
