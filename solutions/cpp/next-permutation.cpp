vector<int> nextPermutation(const vector<int>& nums) {
    vector<int> arr = nums;
    int i = (int)arr.size() - 2;
    while (i >= 0 && arr[i] >= arr[i + 1]) i--;
    if (i >= 0) {
        int j = (int)arr.size() - 1;
        while (arr[j] <= arr[i]) j--;
        swap(arr[i], arr[j]);
    }
    reverse(arr.begin() + (i + 1), arr.end());
    return arr;
}
