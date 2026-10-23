vector<long long> productExceptSelf(const vector<int>& nums) {
    size_t n = nums.size();
    vector<long long> out(n, 1);
    long long left = 1;
    for (size_t i = 0; i < n; i++) {
        out[i] = left;
        left *= nums[i];
    }
    long long right = 1;
    for (size_t i = n; i-- > 0;) {
        out[i] *= right;
        right *= nums[i];
    }
    return out;
}
