int findNumbers(const vector<int>& nums) {
    int count = 0;
    for (int x : nums) {
        string digits = to_string(llabs((long long)x));
        if (digits.size() % 2 == 0) count++;
    }
    return count;
}
