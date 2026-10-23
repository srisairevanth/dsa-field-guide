long long subarraySumK(const vector<int>& flows, int k) {
    long long count = 0, total = 0;
    unordered_map<long long, long long> seen;
    seen[0] = 1;
    for (int x : flows) {
        total += x;
        auto it = seen.find(total - k);
        if (it != seen.end()) count += it->second;
        seen[total]++;
    }
    return count;
}
