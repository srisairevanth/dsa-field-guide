vector<int> topKFrequent(const vector<int>& nums, int k) {
    vector<int> order;
    unordered_map<int, int> counts;
    for (int x : nums)
        if (counts[x]++ == 0) order.push_back(x);
    stable_sort(order.begin(), order.end(), [&](int a, int b) { return counts.at(a) > counts.at(b); });
    if ((int)order.size() > k) order.resize(k);
    return order;
}
