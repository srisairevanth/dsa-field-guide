int missingNumber(const vector<int>& nums) {
    long long n = (long long)nums.size();
    long long total = n * (n + 1) / 2;
    for (int x : nums) total -= x;
    return (int)total;
}
