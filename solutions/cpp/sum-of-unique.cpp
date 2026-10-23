int sumOfUnique(const vector<int>& nums) {
    unordered_map<int, int> counts;
    for (int x : nums) counts[x]++;
    int total = 0;
    for (const auto& [x, c] : counts)
        if (c == 1) total += x;
    return total;
}
