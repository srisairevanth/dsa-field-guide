vector<int> twoSum(const vector<int>& prices, int target) {
    unordered_map<int, int> seen;
    for (int j = 0; j < (int)prices.size(); j++) {
        auto it = seen.find(target - prices[j]);
        if (it != seen.end()) return {it->second, j};
        seen[prices[j]] = j;
    }
    return {};
}
