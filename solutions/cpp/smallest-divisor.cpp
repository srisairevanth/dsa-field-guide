int smallestDivisor(const vector<int>& nums, int threshold) {
    long long lo = 1, hi = *max_element(nums.begin(), nums.end());
    while (lo < hi) {
        long long mid = (lo + hi) / 2;
        long long sum = 0;
        for (int x : nums) sum += (x + mid - 1) / mid;
        if (sum <= threshold) hi = mid;
        else lo = mid + 1;
    }
    return (int)lo;
}
