int longestRun(const vector<int>& nums) {
    unordered_set<int> seen(nums.begin(), nums.end());
    int best = 0;
    for (int x : seen) {
        if (seen.count(x - 1)) continue;
        int length = 1;
        while (seen.count(x + length)) length++;
        best = max(best, length);
    }
    return best;
}
